import java.util.*;
import java.util.List;
import java.util.function.Predicate;

public class SumOfOdd
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Predicate<Integer> oddFunc = (n) -> n % 2 == 1;

        int oddSum = numbers.stream().filter(oddFunc).mapToInt((n) -> n).sum();
        Map<String, Integer> oddSumMap = new HashMap<>();
        oddSumMap.put("Sum of Odd", oddSum);
        System.out.print(oddSumMap);

    }
}