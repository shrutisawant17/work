import java.util.Scanner;

public class FactorialNumber
{
    public static void main(String args[])
    {
        int i, factorial = 1, number;
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        for (i = 1; i <= number; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial is: " + factorial);
    }
}
