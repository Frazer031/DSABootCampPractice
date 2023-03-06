import java.util.Scanner;
public class SimpleInterest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal, time and rate: ");
        int principal = sc.nextInt();
        int time = sc.nextInt();
        int rate = sc.nextInt();
        int simpleInterest = principal*(1+(rate*time));

        System.out.println("The simple interest for the given values is: " + simpleInterest);
    }

}
