/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20230602.Ch24_6_nio2_4;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch24_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     System.out.println( Paths.get("/home",".","mydir")); 
     System.out.println( Paths.get("/home",".","mydir").normalize()); 
     
     System.out.println( Paths.get("/home","..","mydir")); 
      System.out.println( Paths.get("/home","..","mydir").normalize()); 
    }
    
}
