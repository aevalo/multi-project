package org.example.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Greeter is a class used to create formatted greeting.
 * 
 * @author      Arttu Valo
 * @version     %I%, %G%
 * @since       0.1
 */
public class Greeter {
    private static final Logger logger = LogManager.getLogger(Greeter.class.getName());
    private String name;

    /**
     * Default constructor.
     * Sets name to World
     *
     * @since       0.1
     */
    public Greeter() {
        logger.debug("Setting name to World");
        this.name = "World";
    }

    /**
     * Parametrized constructor.
     *
     * @param name  Name to greet
     * @since       0.1
     */
    public Greeter(String name) {
        if (name != null) {
            logger.debug(String.format("Name given is %s", name));
            this.name = name;
        } else {
            logger.debug("Name was null, defaulting to World");
            name = "World";
        }
    }

    /**
     * Returns formatted greering.
     * 
     * @return  Formatted greeting
     * @since       0.1
     */
    public String greeting() {
        return String.format("Hello, %s!!!", this.name);
    }
}
