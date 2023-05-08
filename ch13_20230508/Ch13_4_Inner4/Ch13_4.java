/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20230508.Ch13_4_Inner4;
import java.util.ArrayList;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class Ch13_4 {

    static void filter(ArrayList<String> msgList,Predicate<String>p){
        
        for (String s : msgList){
            if (p.test(s)) System.out.println(s);
        }
        
    }
    public static void main(String[] args) {
      ArrayList<String> msgList = new ArrayList();
      msgList.add("Ken");
      msgList.add("Vivin");
      msgList.add("Lucy");
      msgList.add("Tom");
      msgList.add("Iris");
      filter(msgList,new Predicate<String>(){
          public boolean test(String str){
              return str.length() > 3;
          }
      });
    }
    
}
