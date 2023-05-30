/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20230529.Ch22_7_io6;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch22_7 {
    public static void main(String[] args) {
       File file = new File("c:\\mydir\\myfile.txt");
       try(FileWriter fw = new FileWriter(file)){
           fw.write("Hello!!");
       }catch(IOException ex){
           System.out.println(ex);
       }
    }
    
}
