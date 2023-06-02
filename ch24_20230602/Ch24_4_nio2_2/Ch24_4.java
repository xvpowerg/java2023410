/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20230602.Ch24_4_nio2_2;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch24_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Path p1 =  Paths.get("c:","mydir");
       System.out.println(p1.isAbsolute()); 
       System.out.println(p1.toAbsolutePath());  
       Path p2 = Paths.get("value","mydir");
       System.out.println(p2.isAbsolute()); 
       System.out.println(p2.toAbsolutePath()); 
       
       Path p3 = Paths.get("c:", "mydir","dir1");
       Path p4 = Paths.get("myFile.txt");
       Path newPath  = p3.resolve(p4);
       System.out.println(newPath);
       Path p5 = Paths.get("c:", "mydir","dir1");
       Path p6 = Paths.get("c:", "mydir","dir2");
       Path newPath2 = p5.resolve(p6);//p6取代p5
       System.out.println(newPath2);
       
       Path p7 = Paths.get("c:", "mydir","dir2");
       Path p8 = Paths.get("myImage.jpg");
       Path p9 = p7.resolveSibling(p8);
       System.out.println(p9);
       
    }
    
}
