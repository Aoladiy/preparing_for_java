package Task_26_color_model;


public class main {
    public static void main(String[] args) {
        for (int i: RGBConverter.convert(0.63, 1, 0.09, 0.07)){
            System.out.println(i);
        }
        for (double i: CMYKConverter.convert(255, 255, 255)){
            System.out.println(i);
        }
    }
}
