/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20230515.Ch16_1_set1;
import java.util.HashSet;
/**
 *
 * @author xvpow
 */
public class Ch16_1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<String> nameSet = new HashSet<>();
        nameSet.add("Joy");
        nameSet.add("Iris");
        nameSet.add("Gigi");
        nameSet.add("Ken");         
        nameSet.add("Ken");
        
      nameSet.forEach(v->System.out.println(v));
      System.out.println(nameSet.contains("Gigi"));
       System.out.println(nameSet.contains("Lucy"));
       
    }
    
}
