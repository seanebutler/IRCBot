import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.AbstractQueue;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;
import org.jibble.pircbot.*;

// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Sean
 *  @version Feb 15, 2014
 */
public class Lightman extends PircBot
{
    Robot robot;
    AbstractQueue<String> q;

    // ----------------------------------------------------------
    /**
     * Create a new Lightman object.
     */
    public Lightman()
    {
        q = new ConcurrentLinkedQueue<String>();
        setName("TheLightmanWs");
        try
        {
            robot = new Robot();
        }
        catch (AWTException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     */
    public void onMessage(String channel, String sender, String login, String hostname, String message)
    {
            if (message.equalsIgnoreCase("up"))
            {
                robot.keyPress(KeyEvent.VK_3);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                robot.keyRelease(KeyEvent.VK_3);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

            if (message.equalsIgnoreCase("down"))
            {
                robot.keyPress(KeyEvent.VK_4);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                robot.keyRelease(KeyEvent.VK_4);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

            if (message.equalsIgnoreCase("left"))
            {
                robot.keyPress(KeyEvent.VK_K);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                robot.keyRelease(KeyEvent.VK_K);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

            if (message.equalsIgnoreCase("right"))
            {
                robot.keyPress(KeyEvent.VK_6);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                robot.keyRelease(KeyEvent.VK_6);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

            if (message.equalsIgnoreCase("a"))
            {
                robot.keyPress(KeyEvent.VK_A);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                robot.keyRelease(KeyEvent.VK_A);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

            if (message.equalsIgnoreCase("b"))
            {
                robot.keyPress(KeyEvent.VK_B);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                robot.keyRelease(KeyEvent.VK_B);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

            if (message.equalsIgnoreCase("x"))
            {
                robot.keyPress(KeyEvent.VK_X);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                robot.keyRelease(KeyEvent.VK_X);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

            if (message.equalsIgnoreCase("y"))
            {
                robot.keyPress(KeyEvent.VK_Y);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                robot.keyRelease(KeyEvent.VK_Y);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

            if (message.equalsIgnoreCase("l"))
            {
                robot.keyPress(KeyEvent.VK_L);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                robot.keyRelease(KeyEvent.VK_L);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

            if (message.equalsIgnoreCase("r"))
            {
                robot.keyPress(KeyEvent.VK_R);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                robot.keyRelease(KeyEvent.VK_R);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

            if (message.equalsIgnoreCase("start"))
            {
                robot.keyPress(KeyEvent.VK_1);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                robot.keyRelease(KeyEvent.VK_1);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

            if (message.equalsIgnoreCase("select"))
            {
                robot.keyPress(KeyEvent.VK_2);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                robot.keyRelease(KeyEvent.VK_2);
                try
                {
                    Thread.sleep(17);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
    }

}
