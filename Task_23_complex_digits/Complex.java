package Task_23_complex_digits;

public class Complex {

    public double deistv;

    public double mnim;

    Complex(double deistv, double mnim) {
        this.deistv = deistv;
        this.mnim = mnim;
    }

    public String toStr() {
        return this.deistv + " + " + this.mnim + "i";
    }

    public static Complex plus(Complex c1, Complex c2) {
        return new Complex(c1.deistv + c2.deistv, c1.mnim + c2.mnim);

    }

    public static Complex minus(Complex c1, Complex c2) {
        return new Complex(c1.deistv - c2.deistv, c1.mnim - c2.mnim);

    }

    public static Complex umnoz(Complex c1, Complex c2) {
        return new Complex(c1.deistv * c2.deistv - c1.mnim * c2.mnim, c1.deistv * c2.mnim + c2.deistv * c1.mnim);

    }

}
