/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20230519.Ch18_5_generic2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch18_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Student<ArrayList<Integer>> st = 
              new Student("Ken",new ArrayList());
      st.addScore(58);
      st.addScore(71);
      st.addScore(63);
      st.addScore(88);
      st.foreach(v->System.out.println(v));
    }
    
}
