package Task_18_binary_digits;

public class Binary {
    char[] item;
    private char[] item1;
    private char[] item2;


    public static char[] plus(String item1, String item2) {
        return Integer.toBinaryString(Integer.parseInt(item1, 2) + Integer.parseInt(item2, 2)).toCharArray();

    }


}
