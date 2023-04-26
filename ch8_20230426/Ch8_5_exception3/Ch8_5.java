/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20230426.Ch8_5_exception3;
import java.io.IOException;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Ch8_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestException2 tex2 = new TestException2();
        try{
             tex2.test1(true, true);
        }catch(IOException ex){
            System.out.println(ex);
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
        try{
              tex2.test2(true, true);
        }catch(IllegalArgumentException ex){
            System.out.println(ex);
        }catch(NullPointerException ex){
            System.out.println(ex);
        }
      
       
    }
    
}
