import java.util.*;
import java.util.stream.*;

public class SizeOfList
{
    public static void main(String args[])
    {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5);
        long count = myList.stream().count();
        System.out.println(count);
    }
}