import java.util.Scanner;

public class FutureAge {
    public static void main(String[] args) {
        // Exercise Two - Calculating your future age.
        //
        // You want to know how old you will be in any given year.  Create a piece of code that will compute
        // your age given your birth year and a year in the future.
        //
        // Step One:
        // prompt for the year the user was born.  Then prompt them for a year in the future.
        // Store both of these in descriptively named variables.
        //
        // Step Two:
        // Calculate the two possible ages for that year based on their inputs.
        //
        // For example, if you were born in 1988, then in 2026 you'll be either 37 or 38, depending on what month it is in 2026.
        //
        // Store the two possible ages in two different variables.
        //
        // Step Three:
        // Create a variable called message which describes the result.
        // "You will be either NN or NN in YYYY", substituting the values.
        //
        // Step Four:
        // Print your message to the console

        System.out.println("Welcome to the Future Age Calculator!");

        // Write your code here

        int birthYear;
        int futureYear;

        int futureAgeOne;
        int futureAgeTwo;
        String message;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Which year are you born?");
        birthYear = myScanner.nextInt();

        System.out.println("Choose any year from the future.");
        futureYear = myScanner.nextInt();

        futureAgeOne = futureYear - birthYear;
        futureAgeTwo = futureAgeOne - 1;

        message = "You will be either " + futureAgeOne + " or " + futureAgeTwo + " in " + futureYear + ".";
        System.out.println(message);
    }
}
