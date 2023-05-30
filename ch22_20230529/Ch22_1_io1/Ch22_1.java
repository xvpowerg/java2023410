/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20230529.Ch22_1_io1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ch22_1 {
    public static void main(String[] args) {
       File src = new File("C:\\mydir\\netbeans-17-bin.zip");
       System.out.println(src.exists());
       File target = new File("C:\\mydir\\netbeans_copy.zip");
       try{
           FileInputStream fin = new FileInputStream(src);
           FileOutputStream fOut = new FileOutputStream(target);
           int index = -1;
           byte[] buffer = new byte[1024*1024];
           while( (index = fin.read(buffer)) != -1 ){
               fOut.write(buffer, 0, index);
           }
           fOut.close();
           fin.close();
       }catch(FileNotFoundException ex){
            System.out.println(ex);
       }catch(IOException ex){
           System.out.println(ex);
       }
    }
    
}
