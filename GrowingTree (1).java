// The "Space" class.
import java.awt.*;
import hsa.Console;

public class GrowingTree extends Thread
{
    Console c;           // The output console
    public void flying ()
    {
	Color orange = new Color (250, 169, 115);
	Color star = new Color (255, 255, 0);
	Color sky = new Color (0, 255, 255);
	Color brown = new Color (204, 102, 0);
	Color leaves = new Color (0, 204, 0);
	Color darkLeaves = new Color (0, 140, 0);
	//Color moonOrange = new Color (250, 169, 20);
	c.setColor (Color.green);
	c.fillRect (0, 450, 640, 500);



	while (true)
	{
	    c.setColor (sky);
	    c.fillRect (0, 0, 640, 450);
	    for (int x = 0 ; x < 440 ; x = x + 1)
	    {
		c.setColor (sky);
		c.fillOval (316, -1 + x, 8, 12);
		c.setColor (brown);
		c.fillOval (317, 0 + x, 6, 10);

		try
		{
		    Thread.sleep (10);
		}
		catch (Exception e)
		{
		}
	    }
	    for (int y = 0 ; y < 180 ; y = y + 1)
	    {
		c.fillRect (316, 440 - y, 10, 10 + y);
		try
		{
		    Thread.sleep (10);
		}
		catch (Exception e)
		{
		}
	    }
	    for (int z = 0 ; z < 16 ; z = z + 1)
	    {
		c.fillRect (316 - z, 260, 10 + z, 190);
		c.fillRect (321, 260, 10 + z, 190);

		try
		{
		    Thread.sleep (10);
		}
		catch (Exception e)
		{
		}
	    }
	    for (int z = 0 ; z < 75 ; z = z + 1)
	    {
		c.setColor (leaves);
		c.fillOval (305, 100 - z, 0 + z * 2, 0 + z * 2);
		c.fillOval (195, 100 - z, 0 + z * 2, 0 + z * 2);
		c.fillOval (250, 220 - z, 0 + z * 2, 0 + z * 2);
		c.fillOval (340, 220 - z, 0 + z * 2, 0 + z * 2);
		c.fillOval (150, 220 - z, 0 + z * 2, 0 + z * 2);
		try
		{
		    Thread.sleep (10);
		}
		catch (Exception e)
		{
		}
	    }
	    for (int a = 0 ; a < 15 ; a = a + 1)
	    {
		c.setColor (Color.red);
		c.fillOval (200, 230 - a, 0 + a * 2, 0 + a * 2);
		c.fillOval (310, 250 - a, 0 + a * 2, 0 + a * 2);
		c.fillOval (400, 215 - a, 0 + a * 2, 0 + a * 2);
		c.fillOval (370, 105 - a, 0 + a * 2, 0 + a * 2);
		c.fillOval (280, 165 - a, 0 + a * 2, 0 + a * 2);
		c.fillOval (240, 70 - a, 0 + a * 2, 0 + a * 2);
		try
		{
		    Thread.sleep (10 * 2);
		}
		catch (Exception e)
		{
		}
	    }
	    try
	    {
		Thread.sleep (1500);
	    }
	    catch (Exception e)
	    {
	    }
	}







    }




    ////////////
    public GrowingTree ()
    {
	c = new Console ();
    }


    public static void main (String[] args)
    {
	GrowingTree s = new GrowingTree ();
	s.flying ();
    }


    /////////////





    //
    // public Space (Console con)
    // {
    //     c = con;
    //
    // }
    //
    //
    // public void run ()
    // {
    //     while (true)
    //     {
    //         flying ();
    //     }
    //
    // }
} // Space class


