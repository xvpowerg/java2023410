/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20230529.Ch22_2_io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author xvpow
 */
public class Ch22_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File src = new File("C:\\mydir\\netbeans-17-bin.zip");
       System.out.println(src.exists());
       File target = new File("C:\\mydir\\netbeans_copy.zip");
       FileInputStream fin = null;
       FileOutputStream fOut = null;
       try{
            fin = new FileInputStream(src);
            fOut = new FileOutputStream(target);
           int index = -1;
           byte[] buffer = new byte[1024*1024];
           while( (index = fin.read(buffer)) != -1 ){
               fOut.write(buffer, 0, index);
           }          
       }catch(FileNotFoundException ex){
            System.out.println(ex);
       }catch(IOException ex){
           System.out.println(ex);
       }finally{
           try{
                fOut.close();
                fin.close();    
           }catch(IOException ex){
               System.out.println(ex);
           }
           
       }
    }
    
}
