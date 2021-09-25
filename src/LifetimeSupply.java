import java.util.Locale;
import java.util.Scanner;

public class LifetimeSupply {
    public static void main(String[] args) {
        // Exercise One - Computing a lifetime supply of your favorite snack!
        //
        // You just won a lifetime supply of your favorite snack.
        //
        // You are going to write a piece of code which will determine how much you
        // will actually need to last the rest of your life.
        //
        // Step one:
        // Prompt the user for three things.
        // * The name of their favorite snack
        // * The number of items of that snack they would eat in a day
        // * Their current age.
        //
        // Store each of these things in descriptively named variables.
        //
        // Step Two:
        // Calculate how many they would need to last them until they are 100!
        //
        // Hint: There are 365 days in a year.  Multiply that by the number of years until they are 100 years old.
        // (100 minus their current age) That will give you the total number of days.
        // Then multiply that by how many they would eat in a day.
        //
        // Store that number in a variable.  That is how many they will eat in their lifetime.
        //
        // Step Three:
        // Print a message to the console informing the user what they have won.
        //
        // Your sentence should describe how many of their snack they will eat.  Something like this:
        //
        // "Congratulations, you have won a lifetime supply of Snickers!"
        // "You will receive 2 Snickers per day, for a grand total of 51100 Snickers."
        //
        // Concatenate together strings with your variables to form the message dynamically.
        //
        // Then test out your program with different numbers and snack!

        // Write your code here

        String snack;
        int numOfSnack;
        int age;
        int totalSnack;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your favourite snack?");
        snack = myScanner.nextLine().toLowerCase();

        System.out.println("How many " + snack + " do you eat per day?");
        numOfSnack = myScanner.nextInt();

        System.out.println("How old are you?");
        age = myScanner.nextInt();

        totalSnack = (100 - age) * 365 * numOfSnack;

        System.out.println("Congratulations! You have won a lifetime supply of your favorite snack!");
        System.out.println("You will receive " + numOfSnack + " " + snack + " per day, for a grand total of " + totalSnack + " " + snack + ".");
    }
}