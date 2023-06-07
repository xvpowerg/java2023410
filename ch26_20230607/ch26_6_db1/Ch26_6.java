/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20230607.ch26_6_db1;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
public class Ch26_6 {
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/db20230607";
        String user = "qwer";
        String password = "12345";
       try( Connection con =
               DriverManager.getConnection(url, user, password);
             Statement stm =   con.createStatement();){
          int count = 0;
          int id = 2;
          count =  stm.executeUpdate("INSERT INTO student(id,st_name,score) "
                          + "VALUES("+id+",'VIvin',93)");//新增 刪除 修改
          if (count > 0 ){
              System.out.println("OK!!!");
          }
       
       }catch(SQLException ex){
           System.out.println(ex);
       }
          
        
    }
    
}
