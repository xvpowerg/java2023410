/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20230607.ch26_7_db2;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author xvpow
 */
public class Ch26_7 {


    public static void main(String[] args) throws Exception{
       String url = "jdbc:derby://localhost:1527/db20230607";
        String user = "qwer";
        String password = "12345";
       try( Connection con =
               DriverManager.getConnection(url, user, password);
             Statement stm =   con.createStatement();){
           ResultSet res = stm.executeQuery("SELECT * FROM student");
           while(res.next()){
               System.out.println(res.getInt(1));
               System.out.println(res.getString("st_name"));
               System.out.println(res.getDouble(3));
               System.out.println("=========================");
           }
       }
    }
    
}
