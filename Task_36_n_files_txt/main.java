//https://www.8host.com/blog/postrochnoe-chtenie-fajla-v-java/
package Task_36_n_files_txt;

import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {

        String dir = "/Users/nick/Desktop/ВУЗ/PALC/";
        Scanner sc_str = new Scanner(System.in);
        System.out.println("Введите название файла:");
        String fil = sc_str.nextLine();
        System.out.println("Выберите операцию:");
        String oper = sc_str.nextLine();

        double item1;
        double item2;
        double result = 0;
        try {
            RandomAccessFile file = new RandomAccessFile(dir + fil, "r");
            String str;
            item1 = Double.parseDouble(file.readLine());
            item2 = Double.parseDouble(file.readLine());
            file.close();
            if (oper.equals("умножение")) {
                result = item1 * item2;
                System.out.println(result);
            }
            if (oper.equals("сложение")) {
                result = item1 + item2;
                System.out.println(result);
            }
            if (oper.equals("вычитание")) {
                result = item1 - item2;
                System.out.println(result);
            }


//            while ((str = file.readLine()) != null) {
//                System.out.println(str);
//            }
            PrintWriter pw = new PrintWriter(new File(dir + "out.txt"));
            pw.println(result);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
