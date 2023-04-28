/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20230428.ch9_3_override2;

/**
 *
 * @author xvpow
 */
public class Ch9_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Student st1 = new Student("Ken",16);
      Student st2 = new Student("Ken",16);
      Student st3 = new Student("Vivin",25);
      System.out.println(st1);
     System.out.println(st2);
          System.out.println(st3);
      System.out.println(st1.equals(st2));
      System.out.println(st1.equals(st3));
      System.out.println(st1.equals(null));
      Object obj = new Object();
      System.out.println(st1.equals(obj));
      
    }
    
}
