public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //asking user for their first name
        System.out.println("What is your first name?");
        //user inputs their name
        String firstName = scanner.nextLine();

        //asking user for their last name
        System.out.println("What is your last name?");
        //user inputs their name
        String lastName = scanner.nextLine();

        //asking user for their age
        System.out.println("What is your age?");
        //user inputs their age
        String age = scanner.nextLine();

        //asking user for their favorite color
        System.out.println("What is your favorite color?");
        //user inputs their color
        String color = scanner.nextLine();

        System.out.println("Hello " + firstName + lastName + "! You are " + age + "years old and your favorite color is " + color + ".")
    }
}