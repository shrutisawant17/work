import java.util.*;
import java.util.stream.*;

public class EvenNumberList
{
    public static void main(String args[])
    {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6);
        myList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}