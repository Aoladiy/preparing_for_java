import java.util.ArrayList;

public class Task_32_2_dimention_collection {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mas = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            mas.add(new ArrayList<>());
            for (int j = 0; j < 5; j++) {
                mas.get(i).add((int) (Math.random() * 100));
            }
        }
        int max = 0;
        int imax1 = 0, imax2 = 0;
        int min = 100;
        int imin1 = 0, imin2 = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (mas.get(i).get(j) > max) {
                    max = mas.get(i).get(j);
                    imax1 = i + 1;
                    imax2 = j + 1;
                }
                if (mas.get(i).get(j) < min) {
                    min = mas.get(i).get(j);
                    imin1 = i + 1;
                    imin2 = j + 1;
                }
                System.out.printf("%5d ", mas.get(i).get(j));
            }
            System.out.println();
        }
        System.out.printf("Максимальный элемент: %5d \nСтрока: %5d\nСтолбец%5d\n", max, imax1, imax2);
        System.out.printf("Минимальный элемент:  %5d \nСтрока: %5d\nСтолбец%5d\n", min, imin1, imin2);

    }
}
