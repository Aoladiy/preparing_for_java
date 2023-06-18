import java.util.Arrays;

public class Matrix {
    private double[][] data;

    // Конструктор класса
    public Matrix(double[][] data) {
        this.data = new double[data.length][];
        for (int i = 0; i < data.length; i++) {
            this.data[i] = Arrays.copyOf(data[i], data[i].length);
        }
    }

    // Сложение матриц
    public Matrix add(Matrix other) {
        checkDimension(other);
        double[][] result = new double[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                result[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return new Matrix(result);
    }

    // Вычитание матриц
    public Matrix subtract(Matrix other) {
        checkDimension(other);
        double[][] result = new double[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                result[i][j] = this.data[i][j] - other.data[i][j];
            }
        }
        return new Matrix(result);
    }

    // Умножение матрицы на число
    public Matrix multiply(double factor) {
        double[][] result = new double[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                result[i][j] = this.data[i][j] * factor;
            }
        }
        return new Matrix(result);
    }

    // Произведение двух матриц
    public Matrix multiply(Matrix other) {
        if (this.data[0].length != other.data.length) {
            throw new IllegalArgumentException("Количество столбцов первой матрицы должно быть равно количеству строк второй матрицы.");
        }

        double[][] result = new double[this.data.length][other.data[0].length];
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < other.data[0].length; j++) {
                for (int k = 0; k < this.data[0].length; k++) {
                    result[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return new Matrix(result);
    }

    // Транспонированная матрица
    public Matrix transpose() {
        double[][] result = new double[this.data[0].length][this.data.length];
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < this.data[0].length; j++) {
                result[j][i] = this.data[i][j];
            }
        }
        return new Matrix(result);
    }

    // Возведение матрицы в степень
    public Matrix pow(int n) {
        if (this.data.length != this.data[0].length) {
            throw new IllegalArgumentException("Для возведения в степень матрица должна быть квадратной.");
        }
        Matrix result = this;
        for (int i = 1; i < n; i++) {
            result = result.multiply(this);
        }
        return result;
    }

    private void checkDimension(Matrix other) {
        if (this.data.length != other.data.length || this.data[0].length != other.data[0].length) {
            throw new IllegalArgumentException("Матрицы должны быть одинакового размера.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (double[] row : data) {
            for (double value : row) {
                sb.append(value).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
