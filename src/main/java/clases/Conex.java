package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conex {
    private static final String URL = "jdbc:mysql://localhost:3306/prueba";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String jdbc = "com.mysql.jdbc.Driver";

    public static ResultSet query (String Sql){
        ResultSet rs=null;
        try {
            Class.forName(Conex.jdbc);
            Connection cnn = DriverManager.getConnection(URL,USER,PASS);
            Statement statement= cnn.createStatement();
            String sql="select * from producto";
            rs = statement.executeQuery(sql);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return rs;
    }
}
