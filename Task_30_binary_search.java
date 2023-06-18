import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task_30_binary_search {
    public static void main(String[] args) {
        Scanner sc_number = new Scanner(System.in);
        System.out.println("Введите количество элементов");
        int kolvo = sc_number.nextInt();
        System.out.println("Введите левую границу");
        int left = sc_number.nextInt();
        System.out.println("Введите правую границу");
        int right = sc_number.nextInt();
        ArrayList<Integer> mas = new ArrayList<>();
        for (int i = 0; i < kolvo; i++) {
            mas.add((int) (Math.random() * (right - left) + left));
        }

        Collections.sort(mas);
        for (int i : mas) {
            System.out.print(i + " ");
        }

        System.out.println();
        int left_item = -1;
        int right_item = kolvo;
        int middle_item = (left_item + right_item) / 2;


        System.out.println("Введите ключевой элемент");
        int key = sc_number.nextInt();
        while (true) {
            if (mas.get(middle_item) == key) {
                System.out.println("Элемент " + key + " на " + (middle_item + 1) + " позиции");
                break;
            }
            if (mas.get(middle_item) > key) {
                right_item = middle_item;
                middle_item = (left_item + right_item) / 2;
            }
            if (mas.get(middle_item) < key) {
                left_item = middle_item;
                middle_item = (left_item + right_item) / 2;
            }
            if ((middle_item == left_item) | (middle_item == right_item)) {
                System.err.println("Элемент не найден!");
                break;

            }
        }

    }
}
