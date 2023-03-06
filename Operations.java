import java.util.Scanner;

public class Operations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        System.out.println("Enter the operations to be performed on the numbers\n 1-Addition \n 2-Subtraction \n 3-Multiplication \n 4-Division ");
        int operations = sc.nextInt();
        if(operations==1)
        {
            System.out.println(numberOne+numberTwo);
        }
        else if(operations == 2)
        {
            System.out.println(numberOne-numberTwo);
        }
        else if(operations == 3)
        {
            System.out.println(numberOne*numberTwo);
        }
        else if(operations == 4)
        {
            System.out.println(numberOne/numberTwo);
        }
        else
        {
            System.out.println("Invalid Input");
        }




    }
}
