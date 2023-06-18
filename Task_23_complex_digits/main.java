package Task_23_complex_digits;

public class main {
    public static void main(String[] args){
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(1, 3);
        Complex c3 = Complex.plus(c1, c2);
        Complex c4 = Complex.minus(c1, c2);
        Complex c5 = Complex.umnoz(c1, c2);
        System.out.println(c1.toStr());
        System.out.println(c2.toStr());
        System.out.println(c3.toStr());
        System.out.println(c4.toStr());
        System.out.println(c5.toStr());
    }
}
