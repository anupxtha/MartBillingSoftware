/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Anup-Xtha
 */
public class DBConnection {
    static Connection con;
    public static Connection getConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BillingSoftware?" + "autoReconnect=true&useSSL=false","root","root");
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return con;
    }
}
