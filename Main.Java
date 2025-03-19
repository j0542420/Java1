import java.util.Scanner;  // Import the Scanner class
//Main class
public class Main
{
    //Main method entrance of you program
    public static void main(String[] args)
    {
        //System.out.println("Hello World!");//print text to screen: Console.Writline
        //how to do console.Readline:

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = scanner.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        System.out.println("What year were you born?");

        int year = scanner.nextInt();

        int age = 2025-year;

        System.out.println("You are " + age + " Years old");
    }
}