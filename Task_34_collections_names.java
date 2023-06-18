import java.util.ArrayList;

public class Task_34_collections_names {
    public static void main(String[] args) {
        ArrayList<String> mas1 = new ArrayList<>();
        ArrayList<String> mas2 = new ArrayList<>();
        mas1.add("Игорь");
        mas1.add("Иван");
        mas2.add("Губан");
        mas2.add("Сергей");

        for (int i = 0; i < 2; i++) {
            System.out.println(mas1.get(i));
            System.out.println(mas2.get(i));
        }

    }
}
