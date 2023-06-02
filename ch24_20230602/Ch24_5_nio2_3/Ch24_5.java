/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20230602.Ch24_5_nio2_3;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch24_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Path p1 =  Paths.get("c:","mydir","dir1","dir1_1");
       Path p2 = Paths.get("c:", "mydir");
       Path p3 =  p1.relativize(p2);
       System.out.println(p3);
       
       Path p4 =  Paths.get("c:","mydir");
       Path p5 =  Paths.get("d:","mydir");
       p4.relativize(p5);//has different root 因為root不同
    }
    
}
