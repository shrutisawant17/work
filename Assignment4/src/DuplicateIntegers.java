import java.util.*;
import java.util.stream.*;

public class DuplicateIntegers
{
    public static void main(String args[])
    {
        List<Integer> myList = Arrays.asList(1, 1, 2, 3, 4, 5, 2);
        Set<Integer> set = new HashSet();
        myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
    }
}