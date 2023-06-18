import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task_2_digits_from_string {
    public static void main(String[] args) {
        String str = "I have 3 cats, 4 dogs, and 1 turtle";
        int[] array = new int[3];
        int pos = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                array[pos] = (Character.getNumericValue(str.charAt(i)));
                pos++;
            }
        }
        for (int i : array){
            System.out.print(i + " ");
        }

    }
}
