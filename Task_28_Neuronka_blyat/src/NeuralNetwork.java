public class NeuralNetwork {

    private Neuron neuron1;
    private Neuron neuron2;

    // Конструктор класса
    public NeuralNetwork(Neuron neuron1, Neuron neuron2) {
        this.neuron1 = neuron1;
        this.neuron2 = neuron2;
    }

    // Метод прямого распространения
    public double forwardPropagation(double input1, double input2) {
        // Выход каждого нейрона суммируется
        return neuron1.output(input1) + neuron2.output(input2);
    }
}
