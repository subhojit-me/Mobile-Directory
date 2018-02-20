/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonedirectory;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Subhojit
 */
public class JavaConnect {
    
    Connection conn=null;
    public static Connection ConnectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn= DriverManager.getConnection("jdbc:sqlite:PhonebookDatabase.sqlite");
            
            return conn;
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
        }     
    }
    
}