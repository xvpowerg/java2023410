/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20230515.Ch16_4_set4;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch16_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student st1 = new Student("Ken",75);
       Student st2 = new Student("Iris",83);
       Student st3 = new Student("Lucy",95);
       Student st4 = new Student("Vivin",65);
       Student st5 = new Student("Landy",83);
       TreeSet<Student> treeSet = new TreeSet<>();
       treeSet.add(st1);
       treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);
    }
    
}

