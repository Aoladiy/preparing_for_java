package Task_1_SQl_menu;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHandler extends Configs {
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connection = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connection, dbUser, dbPass);
        return dbConnection;
    }

    public void addDigit(Float digit) throws ClassNotFoundException, SQLException {
        String insert = "INSERT INTO " + Const.DIGIT_TABLE + " VALUES " +"(?);";
        PreparedStatement prst = getDbConnection().prepareStatement(insert);
        prst.setFloat(1, digit);
        prst.executeUpdate();
    }

}
