/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20230602.Ch24_2_io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author xvpow
 */
public class Ch24_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
         File src = new File("c:\\mydir\\user.obj");
         try(ObjectInputStream objIn = new  ObjectInputStream(new FileInputStream(src))){
             User user = (User)  objIn.readObject();
             System.out.println(user);
         }
    }
    
}
