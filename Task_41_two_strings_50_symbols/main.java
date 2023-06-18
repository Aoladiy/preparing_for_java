package Task_41_two_strings_50_symbols;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class main {
    protected static String tablename = "task41";
    protected static String mysQLUrl = "jdbc:mysql://localhost:3307/exam";
    protected static Connection con;

    static {
        try {
            con = DriverManager.getConnection(mysQLUrl, "root", "Root-123");

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }


    public static void main(String[] args) throws SQLException, IOException {
        Scanner sc = new Scanner(System.in);
        Scanner sc_str = new Scanner(System.in);
        String str_1, str_2;


        int choice = 0;
        while (true) {
            System.out.println("1. Вывести все таблицы из MySQL.");
            System.out.println("2. Создать таблицу в MySQL.");
            System.out.println("3. Ввести две строки с клавиатуры, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("4. Подсчитать размер ранее введенных строк, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("5. Объединить две строки в единое целое, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("6. Сравнить две ранее введенные строки, результат сохранить в MySQL с последующим выводом в консоль.");
            System.out.println("7. Сохранить все данные (вышеполученные результаты) из MySQL в Excel и вывести на экран");
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
                str_1 = sc_str.nextLine();
                str_2 = sc_str.nextLine();
                System.out.println(str_1 + str_2);
                String query3 = "INSERT INTO " + tablename + " (str) VALUES " + "(?)";
                PreparedStatement stmt3 = con.prepareStatement(query3);
                stmt3.setString(1, String.valueOf(str_1 + str_2));
                stmt3.executeUpdate();
                ResultSet rs3 = stmt3.executeQuery("SELECT * FROM " + tablename + ";");
                while (rs3.next()) {
                    String item = rs3.getString("str");
                    System.out.println(item);


                }
            }
            if (choice == 4) {
                str_1 = sc_str.nextLine();
                str_2 = sc_str.nextLine();
                System.out.println(str_1.length());
                System.out.println(str_2.length());
                String query4 = "INSERT INTO " + tablename + " (str) VALUES " + "(?)";
                PreparedStatement stmt4 = con.prepareStatement(query4);
                stmt4.setString(1, String.valueOf(str_1.length() + "|" + str_2.length()));
                stmt4.executeUpdate();

            }
            if (choice == 5) {
                str_1 = sc_str.nextLine();
                str_2 = sc_str.nextLine();
                System.out.println(str_1 + str_2);
                String query5 = "INSERT INTO " + tablename + " (str) VALUES " + "(?)";
                PreparedStatement stmt5 = con.prepareStatement(query5);
                stmt5.setString(1, String.valueOf(str_1 + str_2));
                stmt5.executeUpdate();

            }
            if (choice == 6) {
                str_1 = sc_str.nextLine();
                str_2 = sc_str.nextLine();
                System.out.println(str_1.equals(str_2));
                String query6 = "INSERT INTO " + tablename + " (str) VALUES " + "(?)";
                PreparedStatement stmt6 = con.prepareStatement(query6);
                stmt6.setString(1, String.valueOf(str_1.equals(str_2)));
                stmt6.executeUpdate();

            }

            if (choice == 7) {
                OutputStream outputStream = new FileOutputStream("/Users/nick/Desktop/ВУЗ/PALC/test41.xls");
                PrintWriter pw = new PrintWriter(new OutputStreamWriter(outputStream, "UTF-8"));


                String query7 = "SELECT * FROM " + tablename + ";";
                PreparedStatement stmt7 = con.prepareStatement(query7);
                stmt7.executeQuery();
                ResultSet rs7 = stmt7.executeQuery("SELECT * FROM " + tablename + ";");
                while (rs7.next()) {
                    String item = rs7.getString("str");
                    System.out.println(item);
                    pw.print(item);
                    pw.println();
                }
                pw.close();

            }

        }
    }
}


