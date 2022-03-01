import java.util.*;
import java.util.stream.*;

public class NumberStarting1
{
    public static void main(String args[])
    {
        List<Integer> myList = Arrays.asList(10, 15, 20, 25, 1);
        myList.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
    }
}