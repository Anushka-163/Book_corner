/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookscorner;
import java.sql.*;
/**
 *establishing the connectivity
 * @author annu
 */
public class DBconnection {
    
    static final String DB_URL="jdbc:mysql://localhost/logindb";
    static final String USER="root";
    static final String PASS="annu";
    public static Connection connectDB()
    {
        Connection conn=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }catch(Exception ex){
            System.out.println("There were errors while connecting to the databse.");
            return null;
        }
    }
}
