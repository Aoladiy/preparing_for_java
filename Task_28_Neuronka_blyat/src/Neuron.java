public class Neuron {

    private double weight;
    private double bias;

    // Конструктор класса
    public Neuron(double weight, double bias) {
        this.weight = weight;
        this.bias = bias;
    }

    // Метод вычисления значения нейрона с использованием сигмоиды
    public double output(double input) {
        return sigmoid(weight * input + bias);
    }

    // Сигмоидальная функция активации
    private double sigmoid(double x) {
        return 1 / (1 + Math.exp(-x));
    }
}
