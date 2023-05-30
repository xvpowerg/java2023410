/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20230529.Ch22_5_io5;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch22_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File f1 = new File("c:\\mydir\\mymsg.txt");
       try(FileReader read = new FileReader(f1)){
           int data = -1;
           while((data = read.read()) != -1){
               System.out.print((char)data);
           }
           
       }catch(FileNotFoundException ex){
           System.out.println(ex);
       }catch(IOException ex){
            System.out.println(ex);
       }
    }
    
}
