/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20230531.ch23_6_io6;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author xvpow
 */
public class Ch23_6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
            File file = new File("c:\\mydir\\item.obj");
            //如果父類別無實作Serializable 可能發生錯誤
            //除非父類別提供預設建構式
           try(ObjectInputStream objIn = 
                    new ObjectInputStream( new FileInputStream(file));){
               Item item = (Item)objIn.readObject();
               System.out.println(item);
           } 
    }
    
}
