package Task_26_color_model;

public class CMYKConverter {
    public static double[] convert(int r, int g, int b) {
        double rs = r / 255;
        double gs = g / 255;
        double bs = b / 255;

        double k = 1 - max(rs, gs, bs);
        double c = (1 - rs - k)/(1 - k);
        double m = (1 - gs - k)/(1 - k);
        double y = (1 - bs - k)/(1 - k);


        return new double[]{c , m, y, k};


    }

    public static double max(double a, double b, double c) {
        if ((a >= b) & (a >= c)) return a;
        if ((b >= a) & (b >= a)) return b;
        if ((c >= b) & (c >= a)) return c;
        return 1;
    }
}
