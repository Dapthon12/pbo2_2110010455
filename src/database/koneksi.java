/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author User
 */
public class koneksi {
    
    public static Connection konek;
    public static Statement stmt;
    public static PreparedStatement prstmt;
    
    public koneksi(){
    
        try {
            //membuat variabel
            String url="jdbc:mysql://localhost/pbo2_2110010455";
            String user="root";
            String password="";
            Class.forName("com.mysql.jdbc.Driver"); //mendaftarkan driver manager
            konek=DriverManager.getConnection(url, user, password);
            stmt=konek.createStatement();
            //bikin log
            System.out.println("Database berhasil di koneksi!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
    }
    
}
