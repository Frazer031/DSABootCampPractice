import java.util.Scanner;
public class Largest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();

        if(one>two)
        {
            System.out.println("The greater number is: " + one);
        }
        else
        {
            System.out.println("The greater number is: " + two);
        }
    }
}
