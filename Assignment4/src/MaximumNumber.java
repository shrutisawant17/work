import java.util.*;
import java.util.stream.*;

public class MaximumNumber
{
    public static void main(String args[])
    {
        List<Integer> myList = Arrays.asList(10, 20, 30, 40, 50, 100);
        int max = myList.stream().max(Integer::compare).get();
        System.out.println(max);
    }
}