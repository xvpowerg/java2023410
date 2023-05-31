/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20230531.ch23_4_io4;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch23_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File outF = new File("c:\\myfile\\listNumber.obj");
        
        try(ObjectInputStream objIn = 
                new ObjectInputStream(new FileInputStream(outF))){
          ArrayList<Integer> objList = (ArrayList)objIn.readObject();
          System.out.println(objList.get(5));
        }catch(IOException | ClassNotFoundException ex){
            System.out.println(ex);
        }
    }
    
}
//5303897