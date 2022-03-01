import java.util.*;
import java.util.stream.*;

public class SortingNumbers
{
    public static void main(String args[])
    {
        List<Integer> myList = Arrays.asList(20, 5, 1, 15, 8, 30);

        myList.stream().sorted().forEach(System.out::println);
    }
}