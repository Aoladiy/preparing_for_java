package Task_26_color_model;

public class RGBConverter {


    public static int[] convert(double c, double m, double y, double k) {
        int r = (int) (255 * (1 - c) * (1 - k));
        int g = (int) (255 * (1 - m) * (1 - k));
        int b = (int) (255 * (1 - y) * (1 - k));

        return new int[]{r, g, b};
    }
}
