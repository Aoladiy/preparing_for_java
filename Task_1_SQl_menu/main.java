package Task_1_SQl_menu;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class main {
    protected static String tablename = "digit";
    protected static String mysQLUrl = "jdbc:mysql://localhost:3306/exam";
    protected static Connection con;

    static {
        try {
            con = DriverManager.getConnection(mysQLUrl, "root", "12345678");

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }


    public static void main(String[] args) throws SQLException, IOException {
        Scanner sc = new Scanner(System.in);
        Scanner sc_str = new Scanner(System.in);
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
                System.out.println("Таблицы");
                String query = "SHOW TABLES;";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.executeQuery();
                ResultSet rs1 = stmt.executeQuery("SHOW TABLES;");
                while (rs1.next()) {
                    String item = rs1.getString(1);
                    System.out.println(item);
                }
            }
            if (choice == 2) {
                System.out.println("Создать таблицу");
                System.out.println("Введите название: ");
                String name;
                name = sc_str.nextLine();


                String[] names = new String[100];
                String[] types = new String[100];
                System.out.println("Введите количество полей: ");

                int count = sc.nextInt();
                System.out.println("Введите названия полей: ");
                for (int i = 0; i < count; i++) {
                    names[i] = sc_str.nextLine();
                }
                System.out.println("Введите типы полей: ");
                for (int i = 0; i < count; i++) {
                    types[i] = sc_str.nextLine();
                }

                String insert = "";
                for (int i = 0; i < names.length; i++) {
                    insert += names[i] + " " + types[i] + " ";
                }


                String query2 = "CREATE TABLE " + name + "(" + insert + ")" + ";";
                PreparedStatement stmt2 = con.prepareStatement(query2);
                stmt2.executeUpdate();

            }
            if (choice == 3) {
                digit_3_1 = sc.nextFloat();
                digit_3_2 = sc.nextFloat();
                System.out.println(digit_3_1 + digit_3_2);
                String query3 = "INSERT INTO " + tablename + " VALUES " + "(?)";
                PreparedStatement stmt3 = con.prepareStatement(query3);
                stmt3.setFloat(1, Float.valueOf(digit_3_1 + digit_3_2));
                stmt3.executeUpdate();
                ResultSet rs = stmt3.executeQuery("SELECT * FROM " + tablename + ";");
                while (rs.next()) {
                    Float item = rs.getFloat("digit");
                    System.out.println(item);


                }
            }
            if (choice == 4) {
                digit_3_1 = sc.nextFloat();
                digit_3_2 = sc.nextFloat();
                System.out.println(digit_3_1 - digit_3_2);
                String query4 = "INSERT INTO " + tablename + " VALUES " + "(?)";
                PreparedStatement stmt4 = con.prepareStatement(query4);
                stmt4.setFloat(1, Float.valueOf(digit_3_1 - digit_3_2));
                stmt4.executeUpdate();

            }
            if (choice == 5) {
                digit_3_1 = sc.nextFloat();
                digit_3_2 = sc.nextFloat();
                System.out.println(digit_3_1 * digit_3_2);
                String query5 = "INSERT INTO " + tablename + " VALUES " + "(?)";
                PreparedStatement stmt5 = con.prepareStatement(query5);
                stmt5.setFloat(1, Float.valueOf(digit_3_1 * digit_3_2));
                stmt5.executeUpdate();

            }
            if (choice == 6) {
                digit_3_1 = sc.nextFloat();
                digit_3_2 = sc.nextFloat();
                System.out.println(digit_3_1 / digit_3_2);
                String query6 = "INSERT INTO " + tablename + " VALUES " + "(?)";
                PreparedStatement stmt6 = con.prepareStatement(query6);
                stmt6.setFloat(1, Float.valueOf(digit_3_1 / digit_3_2));
                stmt6.executeUpdate();

            }
            if (choice == 7) {
                digit_3_1 = sc.nextFloat();
                digit_3_2 = sc.nextFloat();
                System.out.println(digit_3_1 % digit_3_2);
                String query7 = "INSERT INTO " + tablename + " VALUES " + "(?)";
                PreparedStatement stmt7 = con.prepareStatement(query7);
                stmt7.setFloat(1, Float.valueOf(digit_3_1 % digit_3_2));
                stmt7.executeUpdate();

            }
            if (choice == 8) {
                digit_3_1 = sc.nextFloat();
                System.out.println(abs(digit_3_1));
                String query8 = "INSERT INTO " + tablename + " VALUES " + "(?)";
                PreparedStatement stmt8 = con.prepareStatement(query8);
                stmt8.setFloat(1, Float.valueOf(abs(digit_3_1)));
                stmt8.executeUpdate();

            }
            if (choice == 9) {
                digit_3_1 = sc.nextFloat();
                digit_3_2 = sc.nextFloat();
                System.out.println(pow(digit_3_1, digit_3_2));
                String query9 = "INSERT INTO " + tablename + " VALUES " + "(?)";
                PreparedStatement stmt9 = con.prepareStatement(query9);
                stmt9.setFloat(1, Float.valueOf((float) pow(digit_3_1, digit_3_2)));
                stmt9.executeUpdate();

            }
            if (choice == 10) {
                OutputStream outputStream = new FileOutputStream("/Users/nick/Desktop/ВУЗ/PALC/test.xls");
                PrintWriter pw = new PrintWriter(new OutputStreamWriter(outputStream, "UTF-8"));


                String query10 = "SELECT * FROM " + tablename + ";";
                PreparedStatement stmt10 = con.prepareStatement(query10);
                stmt10.executeQuery();
                ResultSet rs10 = stmt10.executeQuery("SELECT * FROM " + tablename + ";");
                while (rs10.next()) {
                    Float item = rs10.getFloat("digit");
                    System.out.println(item);
                    pw.print(item);
                    pw.println();
                }
                pw.close();

            }

        }
    }
}


