// The "Space" class.
import java.awt.*;
import hsa.Console;

public class Space extends Thread
{
    Console c;           // The output console
    public void flying ()
    {
	Color orange = new Color (250, 169, 115);
	Color star = new Color (255, 255, 0);
	//Color moonOrange = new Color (250, 169, 20);
	c.fillRect (0, 0, 640, 500);
	c.setColor (Color.black);
	c.fillOval (-2, 148, 202, 202);
	c.setColor (orange);
	c.fillOval (220, 150, 200, 200);
	c.setColor (Color.black);
	c.fillOval (340, 220, 20, 20);
	c.fillOval (275, 220, 20, 20);
	c.setColor (Color.white);
	c.fillArc (280, 230, 80, 80, 180, 180);
	c.fillOval (275, 223, 8, 8);
	c.fillOval (340, 223, 8, 8);

	while (true)
	{
	    for (int x = 0 ; x < 670 ; x = x + 1)
	    {

		c.setColor (Color.black);
		c.fillStar (-3 + x, 464, 30, 31);
		c.fillStar (-3 + x, 414, 30, 31);
		c.fillStar (-3 + x, 364, 30, 31);
		c.fillStar (643 - x, 4, 30, 31);
		c.fillStar (643 - x, 54, 30, 31);
		c.fillStar (643 - x, 104, 30, 31);
		c.setColor (star);
		c.fillStar (0 + x, 465, 30, 30);
		c.fillStar (0 + x, 415, 30, 30);
		c.fillStar (0 + x, 365, 30, 30);
		c.fillStar (640 - x, 5, 30, 30);
		c.fillStar (640 - x, 55, 30, 30);
		c.fillStar (640 - x, 105, 30, 30);
		try
		{
		    Thread.sleep (10);
		}
		catch (Exception e)
		{
		}
	    }
	}




    }




    ////////////
    public Space ()
    {
	c = new Console ();
    }


    public static void main (String[] args)
    {
	Space s = new Space ();
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
