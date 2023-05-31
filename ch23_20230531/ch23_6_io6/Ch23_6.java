/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20230531.ch23_6_io6;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author xvpow
 */
public class Ch23_6 {

    
    public static void main(String[] args)throws Exception {
       File file = new File("c:\\mydir\\item.obj");
       Item it = new Item("B",25);
       try(ObjectOutputStream out = 
               new ObjectOutputStream(new FileOutputStream(file))){
          out.writeObject(it);
       }
    }
    
}
