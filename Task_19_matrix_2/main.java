package Task_19_matrix_2;

import Task_18_binary_digits.Binary;

public class main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix();

        int[][] m2 = m1.gener_random(5, 5);
        int[][] m3 = m1.gener_random(5, 5);
        int[][] m4 = m1.plus(m2, m3, 5, 5, 5, 5);
        for (int[] i : m4) {
            for (int j : i) {
                System.out.print(j + " ");

            }
            System.out.println();
        }


    }
}
