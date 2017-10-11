/*
*
*/
import java.util.Random;
        import java.util.Scanner;
public class Comments
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //This will give us different inputs from the user that will tell the use to inter random numbers between 1 and 100
        Random random = new Random();
        int from = 1;
        int to = 100;
        int randomNumber = random.nextInt(to - from+1 ) + from;
        //
        int guessedNumber = 0;

        // This will let you print the numbers while the value number is between the two numbers
        System.out.printf("The number is between %d and %d.\n", from, to);

        //this will let the user input any number and tell them if they are aiming to high or low.
        do
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low!");
            else
                System.out.println("You got it!");


        } while (guessedNumber != randomNumber);
    }
}