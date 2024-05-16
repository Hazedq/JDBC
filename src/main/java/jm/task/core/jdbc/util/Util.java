package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private final static String URL = "jdbc:mysql://127.0.0.1:3306/test_jdbc";
    private final static String USERNAME = "jpauser";
    private final static String PASSWORD = "jpapwd";

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Соединение установлено!");
            return connection;
        } catch (SQLException e) {
            System.out.println("Ошибка. Соединение не установлено.");
            return null;
        }

    }


}
