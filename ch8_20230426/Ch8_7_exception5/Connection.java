/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20230426.Ch8_7_exception5;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Connection {
    public void conn(boolean b1)throws IOException{
        System.out.println("連線!");
        if (b1){
           throw new IOException(); 
        }
    }
    public void close(){
       System.out.println("關閉連線!");  
    }
}
