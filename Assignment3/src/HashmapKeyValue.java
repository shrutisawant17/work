import java.util.HashMap;
import java.util.Map.Entry;

class HashmapKeyValue
{
    public static void main(String[] args)
    {

        HashMap<String, String> state = new HashMap<>();
        state.put("Maharashtra", "Mumbai");
        state.put("Gujrat", "GandhiNagar");
        for (Entry<String, String> entry : state.entrySet())
        {
            System.out.print(entry);
            System.out.print(", ");
        }
        System.out.print("\nKeys is : ");
        for (String key : state.keySet())
        {
            System.out.print(key);
            System.out.print(", ");
        }
        System.out.print("\nValues is :");
        for (String value : state.values())
        {
            System.out.print(value);
            System.out.print(", ");
        }
    }
}