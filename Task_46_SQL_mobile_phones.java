import java.sql.*;
import java.util.Scanner;

public class Task_46_SQL_mobile_phones {
    protected static String tablename = "Phones";
    protected static String mysQLUrl = "jdbc:mysql://localhost:3306/exam";

    protected static Connection con;

    static {
        try {
            con = DriverManager.getConnection(mysQLUrl, "root", "12345678");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws SQLException {
        int choice = 0;
        Scanner sc_digit = new Scanner(System.in);
        Scanner sc_str = new Scanner(System.in);


        while (true) {
            System.out.println("1 - вывести все позиции");
            System.out.println("2 - добавить телефон");
            choice = sc_digit.nextInt();
            if (choice == 1) {
                String query1 = "SELECT * FROM " + tablename + ";";
                PreparedStatement stmt1 = con.prepareStatement(query1);

                ResultSet rs = stmt1.executeQuery("SELECT * FROM " + tablename + ";");
                while (rs.next()) {
                    String item1 = rs.getString("manufacturer");
                    System.out.print(item1 + " ");
                    String item2 = rs.getString("model");
                    System.out.print(item2 + " ");
                    int item3 = rs.getInt("year_release");
                    System.out.print(item3 + " ");
                    Float item4 = rs.getFloat("diag");
                    System.out.print(item4 + " ");
                    System.out.println();

                }
            }
            if (choice == 2) {
                String query4 = "INSERT INTO " + tablename + " VALUES " + "(?,?,?,?);";
                PreparedStatement stmt4 = con.prepareStatement(query4);

                String manufacturer;
                String model;
                int year_release;
                float diag;
                System.out.println("Введите производителя: ");
                manufacturer = sc_str.nextLine();
                System.out.println("Введите модель: ");
                model = sc_str.nextLine();
                System.out.println("Введите год выпуска: ");
                year_release = sc_digit.nextInt();
                System.out.println("Введите диагональ экрана: ");
                diag = sc_digit.nextFloat();


                stmt4.setString(1, String.valueOf(manufacturer));
                stmt4.setString(2, String.valueOf(model));
                stmt4.setInt(3, Integer.valueOf(year_release));
                stmt4.setFloat(4, Float.valueOf(diag));
                stmt4.executeUpdate();
            }
            if ((choice != 1) & (choice != 2)) {
                break;
            }
        }
    }
}
