/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20230426.Ch8_7_exception5;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch8_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Connection con =null;  
        try{
          con = new Connection();
          con.conn(true);
        }catch(IOException ex){
            System.out.println(ex);
        }finally{
            con.close();
        }
        
        
    }
    
}
