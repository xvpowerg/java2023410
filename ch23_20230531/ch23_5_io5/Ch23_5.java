/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20230531.ch23_5_io5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch23_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Item it = new Item("MyItem1");
        System.out.println(it);
        File file = new File("c:\\mydir\\item.obj");
        try(ObjectOutputStream out = 
               new  ObjectOutputStream(new FileOutputStream(file))){
            out.writeObject(it);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    
}
