/*
    Danny Shin
    27th/ December/ 2015
    Ms. Dyke
    This program will

    make sure that coming back to askdata after applying password re-writes the previous answers answered

    what happens if heading doesnt mathch?? (EXCCEPTIONS)
    // do the headerrrr
*/

import java.awt.*;
import hsa.*;
import java.io.*;
import javax.swing.JOptionPane;

public class ScreenSaver
{
    Console c;           // The output console
    String choice;
    String saverChoice;
    String previewChoice;
    String applyPassword;
    String password;
    String header = "Danny's Files";
    String checker;
    String headerChecker;
    boolean passwordSet;
    boolean passwordConfirm;
    int speed;
    int executionTime;
    int seeOthers;
    int passwordRetry;

    public ScreenSaver ()
    {
	c = new Console ("Screemn Saver Program");
    }


    private void title ()
    {
	Color backgroundBlue = new Color (130, 139, 215);
	c.setColor (backgroundBlue);
	c.clear ();
	c.fillRect (0, 0, 800, 600);
	c.setTextBackgroundColor (backgroundBlue);
	c.print (" ", 34);
	c.println ("Screen Saver");
	c.println ();
    }


    private void pauseProgram ()
    {
	c.println ();
	c.println ("Please press any key to continue: ");
	c.getChar ();
    }


    public void splashScreen ()
    {
	title ();
	c.println ("Welcome to the screen saver program!");
	c.println ("Please enjoy!");
	try
	{
	    Thread.sleep (0000);
	}
	catch (Exception e)
	{
	}
    }


    public void mainMenu ()
    {
	title ();
	while (true)
	{
	    c.println ("Welcome to the main menu.");
	    c.println ("1. Set screen saver");
	    c.println ("2. Set new password");
	    c.println ("3. Instructions");
	    c.println ("4. Exit");
	    c.println ();
	    c.print ("Please enter your choice: ");
	    choice = c.readString ();
	    if (!choice.equals ("1") && !choice.equals ("2") && !choice.equals ("3") && !choice.equals ("4") && !choice.equals ("5"))
	    {
		new Message ("Please enter either; '1', '2', '3', '4', or '5'.", "Error Message");
		c.setCursor (9, 1);
		c.println ();
		c.setCursor (3, 1);
	    }
	    else
	    {
		break;
	    }
	}
    }





    public void askData ()
    {
	title ();
	String temp;
	//saverChoice Question!
	while (true)
	{
	    c.println ("1. Space");
	    c.println ("2. Field");
	    c.println ("3. Balls");
	    c.println ("4. Wires");
	    c.println ("5. Ocean");
	    //c.println ("6. Cancel");     ADD THIS FEATURE WHEN DONE
	    c.print ("Please choose a screen saver: ");

	    saverChoice = c.readString ();
	    if (!saverChoice.equals ("1") && !saverChoice.equals ("2") && !saverChoice.equals ("3") && !saverChoice.equals ("4") && !saverChoice.equals ("5"))
	    {
		new Message ("Please enter either; '1', '2', '3', '4', or '5'", "Error Message");
		c.setCursor (8, 1);
		c.println ();
		c.setCursor (3, 1);
	    }
	    else
	    {
		break;
	    }
	}
	while (true)
	{
	    ///// FIX THIS
	    c.print ("PREVIEW?");
	    previewChoice = c.readString ();
	    if (!previewChoice.equals ("y") && !previewChoice.equals ("n"))
	    {
		new Message ("Please enter either; 'Y OR N'", "Error Message");
		c.setCursor (8, 1);
		c.println ();
		c.setCursor (3, 1);
	    }
	    else
	    {
		break;
	    }
	}
	if (previewChoice.equalsIgnoreCase ("y"))
	{
	    //System.out.println ("anything");
	    speed = 10;
	    executionTime = 1000;
	    return;
	}


	else
	{
	    //speed Question
	    while (true)
	    {
		try
		{
		    c.print ("Please input the speed of the animations: ");
		    temp = c.readString ();
		    speed = Integer.parseInt (temp);
		    if (speed > 0)
		    {
			break;
		    }
		    new Message ("Please enter a positive number", "Try Again");
		}
		catch (NumberFormatException e)
		{
		    new Message ("Please Input an Integer", " Try again");
		}
		c.setCursor (11, 1);
		c.println ();
		c.setCursor (11, 1);
	    }

	    //executionTime Question
	    while (true)
	    {
		try
		{
		    c.print ("Please input the length of execution time in seconds: ");
		    temp = c.readString ();
		    executionTime = Integer.parseInt (temp);
		    if (executionTime > 0)
		    {
			break;
		    }
		    new Message ("Please enter a positive number", "Try Again");
		}
		catch (NumberFormatException e)
		{
		    new Message ("Please Input an Integer", " Try again");
		}
		c.setCursor (12, 1);
		c.println ();
		c.setCursor (12, 1);
	    }
	    executionTime = executionTime * 1000; // converts the second into milliseconds



	    //applyPassword Question!
	    while (true)
	    {
		c.println ("Would you like to apply your password?");
		c.print ("Y-yes/N-no: ");
		applyPassword = c.readString ();
		if (!applyPassword.equalsIgnoreCase ("y") && !applyPassword.equalsIgnoreCase ("n"))
		{
		    new Message ("Please enter either; 'Y', or 'N'", "Error Message");
		    c.setCursor (10, 1);
		    c.println ();
		    c.setCursor (9, 1);
		}
		else if (applyPassword.equalsIgnoreCase ("y") && passwordSet == false)
		{
		    setPassword ();
		    break;
		}
		else
		{
		    break;
		}
	    }
	}
    }


    public void display ()
    {
	title ();
	//System.out.println ("display");
	if (saverChoice.equals ("1"))
	{
	    CrossingDesign g = new CrossingDesign (c, speed);
	    try
	    {
		g.start ();
		Thread.sleep (executionTime);
		g.stop ();
	    }
	    catch (Exception e)
	    {
	    }
	}
	// else if (saverChoice.equals ("2"))
	// {
	//     Space g = new Space (c, speed);
	//     try
	//     {
	//         g.start ();
	//         Thread.sleep (executionTime);
	//         g.stop ();
	//     }
	//     catch (Exception e)
	//     {
	//     }
	// }
	
	
	
	// if (previewChoice.equals ("y"))
	// {
	//     System.out.println("ASKDATA");
	//     askData ();
	// }
    }


    public void setPassword ()
    {
	title ();
	PrintWriter output;
	while (true)
	{
	    c.print ("Please input a new password: ");
	    password = c.readString ();
	    c.print ("Please confirm the password: ");
	    checker = c.readString ();
	    if (!checker.equals (password))
	    {
		int a = JOptionPane.showConfirmDialog (null, "The two passwords do not match. Try again?", "Try again", JOptionPane.YES_NO_OPTION);
		if (a == JOptionPane.YES_OPTION)
		{
		    //new Message ("Your passwords do not match. Please try again.", "Try again.");
		    c.setCursor (3, 1);
		    c.println ();
		    c.println ();
		    c.setCursor (3, 1);
		}
		else
		{
		    return; // this allows it to just continue off and go back to main menu remember that!
		}
	    }

	    else
	    {
		// check if array can be made here!!!!
		char[] pass = new char [password.length ()];

		try
		{
		    output = new PrintWriter (new FileWriter ("User Password.txt"));
		    output.println (header);
		    for (int x = password.length () - 1 ; x >= 0 ; x = x - 1)
		    {
			pass [x] = (password.charAt (x));
			output.print (pass [x]);
		    }
		    output.close ();
		}
		catch (IOException e)
		{
		}
		//ADD MORE EXCEPTIONS THAT ARE NECESSARY!
		c.println ("Password has been saved!");
		pauseProgram ();
		break;
	    }
	}
	passwordSet = true;
    }


    private String securityCheck (String checker)
    {
	BufferedReader input;

	String encryptedPassword;
	String decryptedPassword = "";
	try
	{
	    input = new BufferedReader (new FileReader ("User Password.txt"));
	    headerChecker = input.readLine ();
	    if (headerChecker.equals (header))
	    {
		encryptedPassword = input.readLine ();
		for (int x = password.length () - 1 ; x >= 0 ; x = x - 1)
		{
		    decryptedPassword = decryptedPassword + encryptedPassword.charAt (x);
		}
	    }
	}
	catch (IOException e)
	{
	}
	return decryptedPassword;
    }



    public void checkPassword ()
    {
	while (true)
	{
	    title ();
	    c.print ("Please input the password: ");
	    checker = c.readString ();
	    if (checker.equals (securityCheck (checker)))
	    {
		return;
	    }
	    else
	    {
		passwordRetry = JOptionPane.showConfirmDialog (null, "The password is incorrect. Would you like to try again?", "Try again", JOptionPane.YES_NO_OPTION);
		if (passwordRetry == JOptionPane.YES_OPTION)
		{
		    continue;
		}
		else
		{
		    break;
		}
	    }
	}


    }


    public void instructions ()
    {
	title ();
	String line = "";
	BufferedReader input;
	try
	{
	    input = new BufferedReader (new FileReader ("Instructions.txt"));
	    headerChecker = input.readLine ();
	    if (headerChecker.equals (header))
	    {
		for (int pages = 0 ; pages < 5 ; pages = pages + 1)
		{
		    for (int lines = 0 ; lines < 20 ; lines = lines + 1)
		    {
			line = input.readLine ();
			c.println (line);

		    }
		    pauseProgram ();
		    c.clear ();
		}
	    }
	}
	catch (IOException e)
	{
	}
    }


    public void goodBye ()
    {
	title ();
	c.println ("Thank you for enjoying my program.");
	c.println ("Good bye.");
	c.println ("BY: Danny Shin");
	pauseProgram ();
	c.close ();
    }


    public static void main (String[] args)
    {
	ScreenSaver s = new ScreenSaver ();
	s.splashScreen ();
	while (true)
	{
	    s.mainMenu ();
	    if (s.choice.equals ("1"))
	    {
		do
		{
		    s.askData ();
		    s.display ();
		}
		while (s.previewChoice.equalsIgnoreCase ("y"));
		if (s.applyPassword.equalsIgnoreCase ("y"))
		{
		    s.checkPassword ();
		    if (s.passwordRetry == JOptionPane.NO_OPTION)
			break;
		}
	    }
	    else if (s.choice.equals ("2"))
	    {
		s.setPassword ();
	    }
	    else if (s.choice.equals ("3"))
	    {
		s.instructions ();
	    }
	    else
	    {
		if (s.choice.equals ("4"))
		{
		    break;
		}
	    }
	}
	s.goodBye ();
    }
} // ScreenSaver class


