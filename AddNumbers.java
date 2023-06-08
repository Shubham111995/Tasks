import java.util.InputMismatchException;
import java.util.Scanner;

public class AddNumbers 
{
public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int a,b;
        boolean validInput = false;

        do {
            try 
            {
                System.out.print("Enter the first number: ");
                a = scanner.nextInt();
                System.out.print("Enter the second number: ");
                b = scanner.nextInt();
                validInput = true;

                int sum = a +b;
                System.out.println("The sum of " + a + " and " + b + " is: " + sum);
            } 
            catch (InputMismatchException e) 
            {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); 
            }
        } while (!validInput);
        
        scanner.close();
    }
}

