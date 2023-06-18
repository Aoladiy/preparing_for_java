public class Main {
    public static void main(String[] args) {
        double[][] data1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double[][] data2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        // Сложение матриц
        System.out.println("Сумма матриц:\n" + matrix1.add(matrix2));

        // Вычитание матриц
        System.out.println("Разность матриц:\n" + matrix1.subtract(matrix2));

        // Умножение матрицы на число
        System.out.println("Умножение матрицы на число:\n" + matrix1.multiply(2));

        // Произведение двух матриц
        System.out.println("Произведение матриц:\n" + matrix1.multiply(matrix2));

        // Транспонированная матрица
        System.out.println("Транспонированная матрица:\n" + matrix1.transpose());

        // Возведение матрицы в степень
        System.out.println("Матрица, возведенная в степень 2:\n" + matrix1.pow(2));
    }
}
