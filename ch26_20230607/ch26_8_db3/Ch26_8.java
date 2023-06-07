/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20230607.ch26_8_db3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author xvpow
 */
public class Ch26_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String url = "jdbc:derby://localhost:1527/db20230607";
        String user = "qwer";
        String password = "12345";
       try( Connection con =
               DriverManager.getConnection(url, user, password);
             Statement stm =   con.createStatement();){
           con.setAutoCommit(false);
          int count = 0;
          int id = 4;
          count =  stm.executeUpdate("INSERT INTO student(id,st_name,score) "
                          + "VALUES("+id+",'Lucy',93)");//新增 刪除 修改
          id = 100;
           count =  stm.executeUpdate("INSERT INTO student(id,st_name,score) "
                          + "VALUES("+id+",'Joy',76)");//新增 刪除 修改
           con.commit();
          if (count > 0 ){
              System.out.println("OK!!!");
          }
       
       }catch(SQLException ex){
           System.out.println(ex);
       }
    }
    
}
