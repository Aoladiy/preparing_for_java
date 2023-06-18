package Task_37_log_manipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc_str = new Scanner(System.in);
        Scanner sc_int = new Scanner(System.in);
        String str = sc_str.nextLine();
        if (str.equals("сложить")) {
            System.out.println("Введите число 1:");
            double item1 = sc_int.nextDouble();
            item1 = Math.log(item1);
            System.out.println("Введите число 2:");
            double item2 = sc_int.nextDouble();
            item2 = Math.log(item2);
            System.err.println(item1 + item2);
            PrintWriter pw = new PrintWriter(new File("/Users/nick/Desktop/ВУЗ/PALC/out37.txt"));
            pw.println(item1 + item2);
            pw.close();
        }
        if (str.equals("вычесть")) {
            System.out.println("Введите число 1:");
            double item1 = sc_int.nextDouble();
            item1 = Math.log(item1);
            System.out.println("Введите число 2:");
            double item2 = sc_int.nextDouble();
            item2 = Math.log(item2);
            System.err.println(item1 - item2);
            PrintWriter pw = new PrintWriter(new File("/Users/nick/Desktop/ВУЗ/PALC/out37.txt"));
            pw.println(item1 - item2);
            pw.close();
        }
        if (str.equals("умножить")) {
            System.out.println("Введите число 1:");
            double item1 = sc_int.nextDouble();
            item1 = Math.log(item1);
            System.out.println("Введите число 2:");
            double item2 = sc_int.nextDouble();
            item2 = Math.log(item2);
            System.err.println(item1 * item2);
            PrintWriter pw = new PrintWriter(new File("/Users/nick/Desktop/ВУЗ/PALC/out37.txt"));
            pw.println(item1 * item2);
            pw.close();
        }
        if (str.equals("разделить")) {
            System.out.println("Введите число 1:");
            double item1 = sc_int.nextDouble();
            item1 = Math.log(item1);
            System.out.println("Введите число 2:");
            double item2 = sc_int.nextDouble();
            item2 = Math.log(item2);
            System.err.println(item1 / item2);
            PrintWriter pw = new PrintWriter(new File("/Users/nick/Desktop/ВУЗ/PALC/out37.txt"));
            pw.println(item1 / item2);
            pw.close();
        }
        if (str.equals("возвести в степень")) {
            System.out.println("Введите число 1:");
            double item1 = sc_int.nextDouble();
            item1 = Math.log(item1);
            System.out.println("Введите число 2:");
            double item2 = sc_int.nextDouble();
            item2 = Math.log(item2);
            System.err.println(Math.pow(item1, item2));
            PrintWriter pw = new PrintWriter(new File("/Users/nick/Desktop/ВУЗ/PALC/out37.txt"));
            pw.println(Math.pow(item1, item2));
            pw.close();
        }

    }
}
