public class VowelsCons
{
    public static void main(String[] args)
    {
        String str = "Prorigo";
        System.out.println("The String is: " + str);
        int vcount = 0, ccount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u')
                vcount++;
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                ccount++;
        }
        System.out.println("The total number of vowels is: " + vcount);
        System.out.println("The total number of consonants is: " + ccount);
    }
}
