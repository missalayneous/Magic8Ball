import java.util.Scanner;
public class magic8Ball
{
    public static void main(String[] args)
    {
        //Print a greeting
        System.out.println("Welcome to the mystical Magic 8 Ball!\n");

        //Get a question from the user
        System.out.println("Ask a Yes or No Question:");

        //Create a new scanner
        Scanner input = new Scanner (System.in);

        //Assign variable to input
        String question = input.next();

        // Get a random number from 1 to 8
        int rand = (int)(Math.random()*8) + 1;

        // Use if statements to test the random number
        // and print out 1 of 8 random responses
        if (rand == 1)
        {
            System.out.println("My gut says....Maybe.");
        }
        if (rand == 2)
        {
            System.out.println("Yes!");
        }
        if (rand == 3)
        {
            System.out.println("Not today.");
        }
        if (rand == 4)
        {
            System.out.println("Perhaps.");
        }
        if (rand == 5)
        {
            System.out.println("Definitely!");
        }
        if (rand == 6)
        {
            System.out.println("Not in a million years...");
        }
        if (rand == 7)
        {
            System.out.println("I don't know.");
        }
        if (rand == 8)
        {
            System.out.println("Ask again later.");
        }

    }//end main
}//end class
