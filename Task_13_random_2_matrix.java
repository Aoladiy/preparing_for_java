import java.util.Scanner;

public class Task_13_random_2_matrix {
    public static void main(String[] args) {
        int sum = 0, treb = 600;
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(), n = sc.nextInt();
        int[][] array = new int[m][n];

        while (sum != treb) {

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = (int) (Math.random() * 100 - 10);
                }
            }


            sum = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 | i == m - 1 | j == 0 | j == n - 1)
                        sum += array[i][j];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "   ");

            }
            System.out.println();
        }
    }
}
