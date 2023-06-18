import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.HashMap;
import java.util.Scanner;

public class Task_4_text_calculator {
    public static void main(String[] args) throws ScriptException {
        HashMap<String, Integer> slov_input = new HashMap<String, Integer>();
        slov_input.put("ноль", 0);
        slov_input.put("один", 1);
        slov_input.put("два", 2);
        slov_input.put("три", 3);
        slov_input.put("четыре", 4);
        slov_input.put("пять", 5);
        slov_input.put("шесть", 6);
        slov_input.put("семь", 7);
        slov_input.put("восемь", 8);
        slov_input.put("девять", 9);
        HashMap<Integer, String> slov_output = new HashMap<Integer, String>();
        slov_output.put(0, "ноль");
        slov_output.put(1, "один");
        slov_output.put(2, "два");
        slov_output.put(3, "три");
        slov_output.put(4, "четыре");
        slov_output.put(5, "пять");
        slov_output.put(6, "шесть");
        slov_output.put(7, "семь");
        slov_output.put(8, "восемь");
        slov_output.put(9, "девять");


        Scanner sc = new Scanner(System.in);
        String vurazhenie = sc.nextLine();
        String[] mas = vurazhenie.split(" ");

        int first = Integer.parseInt(String.valueOf(slov_input.get(mas[0])));
        int second = Integer.parseInt(String.valueOf(slov_input.get(mas[2])));

        if (mas[1].equals("плюс")) {
            if ((first + second < 10) & (first + second >= 0))
                System.out.print(slov_output.get(first + second));
        }
        if (mas[1].equals("минус")) {
            if ((first - second < 10) & (first - second >= 0))
                System.out.print(first - second);
        }
        if (mas[1].equals("умножить")) {
            if ((first * second < 10) & (first * second >= 0))
                System.out.print(first * second);
        }
        if (mas[1].equals("разделить")) {
            if ((first / second < 10) & (first / second >= 0))
                System.out.print(first / second);
        }

    }
}
