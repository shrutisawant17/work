import java.util.*;

public class ArrayList1
{
    public static void main(String[] args)
    {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pineapple");
        System.out.println("******For Loop******");
        for (int counter = 0; counter < fruits.size(); counter++)
        {
            System.out.println(fruits.get(counter));
        }
        System.out.println("******Advanced For Loop******");
        for (String str : fruits)
        {
            System.out.println(str);
        }

        System.out.println("******While Loop******");
        int count = 0;
        while (fruits.size() > count)
        {
            System.out.println(fruits.get(count));
            count++;
        }

    }
}
