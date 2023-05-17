/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20230517.Ch17_1_set1;

import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch17_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student st1  = new Student("Ken",82,71);
       Student st2  = new Student("Vivin",82,65);
       Student st3  = new Student("Lucy",52,81);
       Student st4  = new Student("Iris",82,71);
       Student st5  = new Student("Joy",82,93);
       
       Comparator<Student> cmp =  
               Comparator.comparing(st->st.getScore1());
        cmp = cmp.thenComparing(Student::getScore2).
               thenComparing(st->st.getName());
       cmp  = cmp.reversed();
       TreeSet<Student> set = new TreeSet(cmp);
       set.add(st1);
       set.add(st2);
       set.add(st3);
       set.add(st4);
       set.add(st5);
       System.out.println(set);
       
       
    }
    
}
