/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20230602.Ch24_3_nio2_1;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch24_3 {

    public static void main(String[] args) {
        // TODO code application logic here
       Path path1 =  Paths.get("c:", "mydir","msg.txt");
       System.out.println(path1);
       System.out.println(path1.endsWith("msg.txt"));
       Path fName = path1.getFileName();
        System.out.println(fName);
        Path p2 = Paths.get("c:","A","B","C","D");
        System.out.println(p2.getParent());
        System.out.println(p2.getNameCount());
        System.out.println(p2.getRoot());       
        System.out.println(p2.subpath(0, 3));
        System.out.println("=========================");
       Path p3 = Paths.get("c","A","B","C","D");  
      System.out.println(p3.getNameCount());
       System.out.println(p3.subpath(0, 3));
    }
    
}
