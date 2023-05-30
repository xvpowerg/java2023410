/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20230529.Ch22_5_io5;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ch22_5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f1 = new File("c:\\mydir\\mymsg.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(f1))){
            String data = null;
            while((data = br.readLine()) != null){
                System.out.println(data);
            }
          
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
    
}
