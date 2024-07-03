import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Lesson6 {

    // Creates a Scanner object that monitors keyboard input
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){

        divideByZero(2);

        System.out.print("How old are you? ");
        int age = checkValidAge();

        if (age != 0){
            System.out.println("You are " + age + " years old");
        }

        getAFile("./somestuff.txt");

    }

    public static void divideByZero(int a)
    {

        try
        {
            System.out.println(a/0);
        }

        catch (ArithmeticException e)
        {
            System.out.println("You can't divide by zero");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }

    public static int checkValidAge()
    {

        try
        {
            return userInput.nextInt(); // nextInt() receives the user input
        }

        catch (InputMismatchException e)
        {
            userInput.next(); // Skips the last user input and waits for the next
            System.out.print("That isn't a whole number");
            return 0;
        }

    }


    public static void getAFile(String fileName)
    {
        try
        {
            FileInputStream file = new FileInputStream(fileName);
        }

        catch (FileNotFoundException e)
        {
            System.out.println("Sorry I couldn't find that file");
        } catch (Exception e)
        {
            System.out.println("I catch every exception");
        }

        finally
        {
            System.out.println("");
        }

    }

}