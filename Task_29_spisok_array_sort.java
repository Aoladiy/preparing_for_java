import java.util.ArrayList;
import java.util.Collections;

public class Task_29_spisok_array_sort {
    public static void main(String[] args) {
        ArrayList<Integer> mas = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            mas.add((int) (Math.random()*100));
        }

        Collections.sort(mas, Collections.reverseOrder());

        for (int i = 0; i < 10; i++){
            System.out.println(mas.get(i));
        }
    }
}
