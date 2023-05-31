/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20230531.ch23_3_io3;
import java.util.ArrayList;
import java.util.Random;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class C23_3 {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList();
       Random ran = new Random();
       for (int i = 1; i <= 100000;i++){
           list.add(ran.nextInt(6000000));
       }
       System.out.println(list.get(5));
       File outF = new File("c:\\myfile\\listNumber.obj");
       try(ObjectOutputStream obj =
               new ObjectOutputStream(new FileOutputStream(outF))){
           obj.writeObject(list);
       }catch(IOException ex){
           System.out.println(ex);
       }
       
    }
    
}
