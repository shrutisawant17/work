import java.util.*;
import java.util.stream.*;

public class FirstElement
{
    public static void main(String args[])
    {
        List<Integer> myList = Arrays.asList(10, 20, 30, 40, 50);
        myList.stream().findFirst().ifPresent(System.out::println);
    }
}