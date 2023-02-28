import java.util.Scanner;

public class Greeting
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name? : ");
        String name = sc.next();
        System.out.println("Greetings " + name);
    }


}
