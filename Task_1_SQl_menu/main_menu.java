//1. У словие: «Реализовать программу для выполнения следующих математических операций с целочисленным, байтовым и вещественным типами данных: сложение, вычитание, умножение, деление, деление по модулю (остаток), модуль числа, возведение в степень. Все данные вводятся с клавиатуры (класс Scanner, System.in, nextint).» По данному условию необходимо реализовать программу с интерактивным консольным меню, (т.е. вывод списка действий по цифрам. При этом при нажатии на цифру у нас должно выполняться определенное действие). При этом в программе данные пункты должны называться следующим образом:
//        1. Вывести все таблицы из MySQL.
//        2. Создать таблицу в MySQL.
//        3. Сложение чисел, результат сохранить в MySQL с последующим выводом в консоль.
//        4. Вычитание чисел, результат сохранить в MySQL с последующим выводом в консоль. 5. Умножение чисел, результат сохранить в MySQL с последующим выводом в консоль. 6. Деление чисел, результат сохранить в MySQL с последующим выводом в консоль.
//        7. Деление чисел по модулю (остаток), результат сохранить в MySQL с последующим
//        выводом в консоль.
//        8. Возведение числа в модуль, результат сохранить в MySQL с последующим выводом в
//        консоль.
//        9. Возведение числа в степень, результат сохранить в MySQL с последующим выводом в
//        консоль.
//        экран. 10. Сохранить все данные (вышеполученные результаты) из MySQL в Excel и вывести на


package Task_1_SQl_menu;

import java.sql.SQLException;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class main_menu {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        float digit_3_1, digit_3_2;


        int choice = 0;
        while (true) {
            System.out.println("1.  Вывести все таблицы из MySQL.");
            System.out.println("2.  Создать таблицу в MySQL.");
            System.out.println("3.  Сложение чисел, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("4.  Вычитание чисел, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("5.  Умножение чисел, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("6.  Деление чисел, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("7.  Деление чисел по модулю (остаток), результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("8.  Возведение числа в модуль, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("9.  Возведение числа в степень, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("10. Сохранить все данные (вышеполученные результаты) из MySQL в Excel и вывести на экран");
            System.out.print("Введите выбор: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("dfgdfgdf");
            }
            if (choice == 2) {
                System.out.println("dfgdfgdf");
            }
            if (choice == 3) {
                digit_3_1 = sc.nextFloat();
                digit_3_2 = sc.nextFloat();
                System.out.println(digit_3_1 + digit_3_2);
                DatabaseHandler dbHandler = new DatabaseHandler();
                dbHandler.addDigit(digit_3_1 + digit_3_2);
            }
            if (choice == 4) {
                digit_3_1 = sc.nextFloat();
                digit_3_2 = sc.nextFloat();
                System.out.println(digit_3_1 - digit_3_2);
                DatabaseHandler dbHandler = new DatabaseHandler();
                dbHandler.addDigit(digit_3_1 - digit_3_2);
            }
            if (choice == 5) {
                digit_3_1 = sc.nextFloat();
                digit_3_2 = sc.nextFloat();
                System.out.println(digit_3_1 * digit_3_2);
                DatabaseHandler dbHandler = new DatabaseHandler();
                dbHandler.addDigit(digit_3_1 * digit_3_2);
            }
            if (choice == 6) {
                digit_3_1 = sc.nextFloat();
                digit_3_2 = sc.nextFloat();
                System.out.println(digit_3_1 / digit_3_2);
                DatabaseHandler dbHandler = new DatabaseHandler();
                dbHandler.addDigit(digit_3_1 / digit_3_2);
            }
            if (choice == 7) {
                digit_3_1 = sc.nextFloat();
                digit_3_2 = sc.nextFloat();
                System.out.println(digit_3_1 % digit_3_2);
                DatabaseHandler dbHandler = new DatabaseHandler();
                dbHandler.addDigit(digit_3_1 % digit_3_2);
            }
            if (choice == 8) {
                digit_3_1 = sc.nextFloat();
                System.out.println(abs(digit_3_1));
                DatabaseHandler dbHandler = new DatabaseHandler();
                dbHandler.addDigit(abs(digit_3_1));
            }
            if (choice == 9) {
                digit_3_1 = sc.nextFloat();
                digit_3_2 = sc.nextFloat();
                System.out.println(pow(digit_3_1, digit_3_2));
                DatabaseHandler dbHandler = new DatabaseHandler();
                dbHandler.addDigit((float) pow(digit_3_1, digit_3_2));
            }
            if (choice == 10) {
                digit_3_1 = sc.nextFloat();
                digit_3_2 = sc.nextFloat();
                System.out.println(pow(digit_3_1, digit_3_2));

            }


        }
    }
}
