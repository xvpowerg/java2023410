/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20230529.Ch22_6_stream;
import java.util.ArrayList;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */
public class Ch22_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList();
       list.add("A");
       list.add("B");
       list.add("C");
       list.add("D");
       
      String msg =  list.stream().collect(Collectors.joining(",", "Title:", "."));
      System.out.println(msg);
    }
    
}

