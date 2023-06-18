public class Main {

    public static void main(String[] args) {
        // Создаем нейроны с произвольными весами и смещениями
        Neuron neuron1 = new Neuron(0.5, 1);
        Neuron neuron2 = new Neuron(-0.5, 1);

        // Создаем нейронную сеть
        NeuralNetwork neuralNetwork = new NeuralNetwork(neuron1, neuron2);

        // Производим прямое распространение с произвольными входами
        double output = neuralNetwork.forwardPropagation(1, 2);

        // Выводим результат
        System.out.println("Output of the neural network: " + output);
    }
}
