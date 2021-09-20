/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orpis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class ConnectionManager {
    private static Connection con;
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
       
            Class.forName("com.mysql.cj.jdbc.Driver");
            
                con = DriverManager.getConnection("jdbc:mysql://sql452.main-hosting.eu:3306/u159657273_bspoint","u159657273_user2","Bspoints@1234");
            
        return con;
    }
}
