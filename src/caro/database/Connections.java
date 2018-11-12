package caro.database;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nhan Nguyen
 */
public class Connections {
    static String userName = "sa";
    static String passWord = "12345678";
    static String dbUrl = "jdbc:sqlserver://127.0.0.1:1433;databaseName=caro";

    //static String dbUrl = "jdbc:odbc:Driver={SQL Server};Server=CAO_KY\\SQLEXPRESS;Database=caro;UserName=sa;Password=sa";

    //static String dbUrl="jdbc:sqlserver//localhost:1433;databaseName=caro;UserName=sa;Password=12345678";

    public static Connection Newconnect() {
        Connection con = null;
        try {
            //String url = "sun.jdbc.odbc.JdbcOdbcDriver";
            String url = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(url);
            con = DriverManager.getConnection(dbUrl,userName,passWord);
        } catch (Exception ex) {
            System.out.println("Conection fail!");
        }
        return con;
    }
}
