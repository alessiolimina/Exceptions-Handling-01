package it.develhope.exceptionshandling;

/**
 * This is a Tester class
 * @author alessiolimina
 */

public class Start {

    /**
     * Creating a method checkScore to check the score
     * Since the main method is static, so it accepts only static methods, the method checkScore will be static
     * @param score is the score that we'll insert
     * if the score respects the conditions, the program prints a message
     * If not, the program throws an ArithmeticException, and it will print a warning message to inform the user
     */

    public static void checkScore(double score) {
        if (score > 0 && score <= 50.00) {
            System.out.println("Average score");
        } else if (score > 50.00 && score <= 100.00) {
            System.out.println("Very good score");
        } else {throw new ArithmeticException("Score is out of scale!");
      }
    }

    /**
     * Creating a main method
     * call the method checkScore with the given values
     */

    public static void main(String[] args) {

        System.out.println("----------Starting the program-------------");

        Start.checkScore(2.15);
        Start.checkScore(50);
        Start.checkScore(95.02);
        Start.checkScore(100.01);
    }
}

