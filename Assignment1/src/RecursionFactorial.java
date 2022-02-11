import java.util.Scanner;

public class RecursionFactorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if (num >= 0)
        {
            int factorial = findFactorial(num);
            System.out.println("The factorial number is :" + factorial);
        }
    }

    public static int findFactorial(int num)
    {
        if (num == 0)
            return 1;
        else if (num == 1)
            return 1;
        else
            return num * findFactorial(num - 1);
    }
}
