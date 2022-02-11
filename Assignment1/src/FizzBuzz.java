import java.util.*;

class FizzBuzz
{
    public static void main(String args[])
    {
        int n = 100;
        for (int i = 1; i <= n; i++)
        {
            if (i % 15 == 0)
                System.out.print("FizzBuzz" + " " + "\n");
            else if (i % 5 == 0)
                System.out.print("Buzz" + " " + "\n");
            else if (i % 3 == 0)
                System.out.print("Fizz" + " " + "\n");
            else
                System.out.print(i + " " + "\n");
        }
    }
}
