/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20230512.ch15_5_collections3;
import java.util.LinkedList;
public class Ch15_5 {

    public static void main(String[] args) {
        LinkedList <String> list = new  LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        
        list.forEach(v->System.out.print(v+" "));
        System.out.println();
        list.addFirst("1");
        list.addLast("2");
        System.out.println(list);
        
        String v = list.pop();
        System.out.println(v);
         v = list.pop();
         System.out.println(v);
        System.out.println(list);
    }
    
}
