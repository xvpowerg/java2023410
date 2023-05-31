/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20230531.ch23_2_io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch23_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //反序列化 Unserialization
              File f1 = new File("c:\\mydir\\msg.obj");
              try(ObjectInputStream objIn = 
                      new ObjectInputStream(new FileInputStream(f1))){
                 String msg =  objIn.readObject().toString();
                 System.out.println("msg:"+msg);
              }catch(IOException | ClassNotFoundException ex){
                  System.out.println(ex);
              }
    }
    
}
