package org.example.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.core.Greeter;

/**
 * Application main class, to test formatted greeting.
 * 
 * @author      Arttu Valo
 * @version     %I%, %G%
 * @since       0.1
 */
public class GreeterApp {
    private static final Logger logger = LogManager.getLogger(GreeterApp.class.getName());

    /**
     * Application entry point.
     * 
     * @param args  Application arguments, first one is used for greeting
     * @since       0.1
     */
    public static void main(String [] args)
    {
        Greeter greeter = null;
        if (args.length > 0) {
            greeter = new Greeter(args[0]);
        } else {
            greeter = new Greeter();
        }
        logger.info(greeter.greeting());
        System.out.println(greeter.greeting());
    }
}
