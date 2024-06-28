import java.util.Scanner;
public class Lesson2 {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Your favorite number: "); // Same as println without a newline

        if (userInput.hasNextInt())
        {
            int numberEntered = userInput.nextInt();

            System.out.println("You entered: " + numberEntered);

            // Here I perform basic mathematics calculations
            int numEnteredTimes2 = numberEntered + numberEntered;
            System.out.println(numberEntered + " + " + numberEntered + " = " + numEnteredTimes2);

            int numEnteredMinus2 = numberEntered - 2;
            System.out.println(numberEntered + " - 2 " + " = " + numEnteredMinus2);

            int numEnteredTimesSelf = numberEntered * numberEntered;
            System.out.println(numberEntered + " * " + numberEntered + " = " + numEnteredTimesSelf);

            // Without the cast the value wouldn't consider fractions
            double numEnteredDivide2 = (double)numberEntered / 2;
            System.out.println(numberEntered + " / 2 " + " = " + numEnteredDivide2);

            // % Modulus returns the remainder of a division
            int numEnteredRemainder = numberEntered % 2;
            System.out.println(numberEntered + " % 2 " + " = " + numEnteredRemainder);

            // Shorthand way to add to 2 to a variable and assign the result to self
            numberEntered += 2; // *= 	/=	%=  Also work
            numberEntered -= 2;

            // Shorthand way to add 1 to a variable
            numberEntered++;

            // Shorthand way to subtract 1 from a variable
            numberEntered--;

            int numEnteredABS = Math.abs(numberEntered); // Returns the absolute value

            // Returns the larger of the two arguments (They must be of the same type)
            int whichIsBigger = Math.max(5, 7);

            // Returns the smaller of the two arguments (They must be of the same type)
            int whichIsSmaller = Math.min(5, 7);

            // Returns the square root argument
            double numSqrt = Math.sqrt(5.23);

            // Rounds the number provided up
            int numCeiling = (int) Math.ceil(5.23);
            System.out.println("Ceiling: " + numCeiling);

            // Rounds the number provided down
            int numFloor = (int) Math.floor(5.23);
            System.out.println("Floor: " + numFloor);

            // Rounds the number based on the fraction
            int numRound = (int) Math.round(5.23);
            System.out.println("Rounded: " + numRound);

            // Generates random numbers between 0 to 9
            int randomNumber = (int) (Math.random() * 10);
            System.out.println("A random number " + randomNumber);

            // If the above condition is false, the code following else is executed
        } else {
            System.out.println("Sorry you must enter an integer");
        }


    }
}
