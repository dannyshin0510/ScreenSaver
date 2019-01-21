// The "Space" class.
import java.awt.*;
import hsa.Console;

public class CrossingDesign extends Thread
{
    Console c;           // The output console
    private int delay;
    
    public void drawing ()
    {
	c.setColor (Color.orange);
	c.fillRect (0, 0, 640, 500);
	for (int z = 0 ; z < 1000 ; z = z + 100)

	    {
		for (int y = 0 ; y < 660 ; y = y + 70)
		{
		    for (int x = 0 ; x < 600 ; x = x + 1)
		    {
			c.setColor (Color.red);
			c.fillOval (60 + z + x, 0 + y + x, 2, 2);
			c.setColor (Color.yellow);
			c.fillOval (560 - x, 0 + z + y + x, 2, 2);
			c.setColor (Color.blue);
			c.fillOval (560 - z - x, 500 - y - x, 2, 2);
			c.setColor (Color.green);
			c.fillOval (60 + x, 500 + z - y - x, 2, 2);
			try
			{
			    Thread.sleep (delay);
			}
			catch (Exception e)
			{
			}
		    }
		}
	    }
    }


    // //////////////
    // public CrossingDesign ()
    // {
    //     c = new Console ();
    // }
    //
    //
    // public static void main (String[] args)
    // {
    //     CrossingDesign s = new CrossingDesign ();
    //     s.flying ();
    // }


    /////////////






    public CrossingDesign (Console con)
    {
	delay = 1;

    }


    public CrossingDesign (Console con, int speed)
    {
	c = con;
	delay=speed;

    }


    public void run ()
    {
	while (true)
	{
	    drawing ();
	}

    }
} // Space class
