import org.jibble.pircbot.*;

// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 *
 * @author Sean
 * @version Feb 15, 2014
 */
public class LightmanMain
{
    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * @param args
     * @throws Exceptionaa
     */
    public static void main(String[] args)
        throws Exception
    {
        Lightman bot = new Lightman();
        bot.setVerbose(true);
        bot.connect("irc2.speedrunslive.com");
        bot.joinChannel("#memeblecrew");
    }
}
