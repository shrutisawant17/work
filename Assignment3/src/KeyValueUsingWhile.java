import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

class KeyValueUsingWhile
{
    public static void main(String[] args)
    {
        HashMap<String, String> state = new HashMap<>();
        state.put("Maharashtra", "Mumbai");
        state.put("Gujrat", "GandhiNagar");
        Iterator<String> iterate2 = state.keySet().iterator();
        System.out.print("\nKeys are ");
        while (iterate2.hasNext())
        {
            System.out.print(iterate2.next());
            System.out.print(",");
        }
        Iterator<String> iterate3 = state.values().iterator();
        System.out.print("\nValues are ");
        while (iterate3.hasNext())
        {
            System.out.print(iterate3.next());
            System.out.print(",");
        }
    }
}