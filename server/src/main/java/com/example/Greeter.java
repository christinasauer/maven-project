package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param someone in the name of a person
   * @return greeting string
   */
  public final String greet(final String someone) {
    return String.format("F**k off, %s!", someone);
  }
}
