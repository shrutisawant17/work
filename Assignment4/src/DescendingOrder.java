import java.util.*;
import java.util.stream.*;

public class DescendingOrder
{
    public static void main(String args[])
    {
        List<Integer> myList = Arrays.asList(10, 2, 3, 7, 20, 30);
        myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}