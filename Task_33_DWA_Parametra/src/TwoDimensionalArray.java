// Файл com/example/main/Main.java
import java.util.Random;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int rows = 5; // Количество строк
        int columns = 5; // Количество столбцов

        int[][] collection = generateRandomCollection(rows, columns); // Генерация случайной коллекции
        printCollection(collection); // Вывод коллекции на экран

        int[] maxIndex = findMaxValue(collection); // Поиск максимального значения и его индексов
        int[] minIndex = findMinValue(collection); // Поиск минимального значения и его индексов

        System.out.println("Максимальное значение: " + collection[maxIndex[0]][maxIndex[1]] +
                " (Индексы: [" + maxIndex[0] + "][" + maxIndex[1] + "])");
        System.out.println("Минимальное значение: " + collection[minIndex[0]][minIndex[1]] +
                " (Индексы: [" + minIndex[0] + "][" + minIndex[1] + "])");
    }

    // Генерация случайной двумерной коллекции
    public static int[][] generateRandomCollection(int rows, int columns) {
        int[][] collection = new int[rows][columns];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                collection[i][j] = random.nextInt(100); // Генерация случайного числа от 0 до 99
            }
        }

        return collection;
    }

    // Вывод двумерной коллекции на экран
    public static void printCollection(int[][] collection) {
        for (int i = 0; i < collection.length; i++) {
            for (int j = 0; j < collection[i].length; j++) {
                System.out.print(collection[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Поиск максимального значения и его индексов
    public static int[] findMaxValue(int[][] collection) {
        int max = collection[0][0];
        int[] maxIndex = {0, 0};

        for (int i = 0; i < collection.length; i++) {
            for (int j = 0; j < collection[i].length; j++) {
                if (collection[i][j] > max) {
                    max = collection[i][j];
                    maxIndex[0] = i;
                    maxIndex[1] = j;
                }
            }
        }

        return maxIndex;
    }

    // Поиск минимального значения и его индексов
    public static int[] findMinValue(int[][] collection) {
        int min = collection[0][0];
        int[] minIndex = {0, 0};

        for (int i = 0; i < collection.length; i++) {
            for (int j = 0; j < collection[i].length; j++) {
                if (collection[i][j] < min) {
                    min = collection[i][j];
                    minIndex[0] = i;
                    minIndex[1] = j;
                }
            }
        }

        return minIndex;
    }
}



