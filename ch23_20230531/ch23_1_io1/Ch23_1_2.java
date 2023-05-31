/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20230531.ch23_1_io1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author xvpow
 */
public class Ch23_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                    File f1 = new File("c:\\mydir\\msg.txt");
            try(MyFileReader inr = 
                    new MyFileReader(f1,"big5");){
                int data = -1;
                while( (data = inr.read()) != -1){
                    System.out.print((char)data);
                }
                
            }catch(FileNotFoundException ex){
                System.out.println(ex);
            }catch(IOException ex){
                System.out.println(ex);
            }
    }
    
}
