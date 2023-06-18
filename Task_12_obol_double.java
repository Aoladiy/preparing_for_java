public class Task_12_obol_double {

    private final double meaning;

    Task_12_obol_double(double meaning) {
        this.meaning = meaning;
    }

    public double getMeaning() {
        return meaning;
    }

    public static Task_12_obol_double add(Task_12_obol_double d1, Task_12_obol_double d2) {
        return new Task_12_obol_double(d1.getMeaning() + d2.getMeaning());
    }

    public static Task_12_obol_double divide(Task_12_obol_double d1, Task_12_obol_double d2) {
        try {
            return new Task_12_obol_double(d1.getMeaning() / d2.getMeaning());
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на 0");
            return null;
        }
    }

    public static Task_12_obol_double pow(Task_12_obol_double d1, Task_12_obol_double d2) {
        return new Task_12_obol_double(Math.pow(d1.getMeaning(), d2.getMeaning()));
    }

    public static void main(String[] args) {
        Task_12_obol_double b1 = new Task_12_obol_double(5);
        Task_12_obol_double b2 = new Task_12_obol_double(2.5);
        System.out.println(Task_12_obol_double.add(b1, b2).getMeaning());
        System.out.println(Task_12_obol_double.divide(b1, b2).getMeaning());
        System.out.println(Task_12_obol_double.pow(b1, b2).getMeaning());
    }

}