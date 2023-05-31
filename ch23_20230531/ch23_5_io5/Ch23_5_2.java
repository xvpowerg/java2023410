/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20230531.ch23_5_io5;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author xvpow
 */
public class Ch23_5_2 {

    public static void main(String[] args) {
         File file = new File("c:\\mydir\\item.obj");
        try(ObjectInputStream objIn =
                new ObjectInputStream(new FileInputStream(file))){
         Item it =(Item)objIn.readObject();
         System.out.println(it);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
