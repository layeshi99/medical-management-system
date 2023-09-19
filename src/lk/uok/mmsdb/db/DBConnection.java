package lk.uok.mmsdb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class DBConnection {
    private static DBConnection dBConnection;
    private Connection connection;
    private DBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mmsdb", "root", "mysql");
        System.out.println("Success");
    }
    public Connection getConnection(){
        return connection;
    }
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        if(dBConnection==null){
            dBConnection=new DBConnection();
        }
        return dBConnection;
    }
}
