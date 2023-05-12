/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20230512.ch15_4_collections2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch15_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer>list = new ArrayList();
        list.add(10);
        list.add(25);
        list.add(18);
        list.add(31);
        
        list.add(2, 77);
        System.out.println(list);
        ArrayList<Integer> data = new ArrayList();
        data.add(56);
        data.add(78);
        data.add(65);
        list.addAll(data);
        System.out.println(list);        
        list.remove(Integer.valueOf(18));
        System.out.println(list);
       ArrayList<Integer> data2 = new ArrayList();
       data2.add(250);
       data2.add(360);
       data2.add(720);
       list.addAll(3, data2);
       System.out.println(list);
       //想移除360, 720, 31
        ArrayList<Integer> del = new ArrayList();
        del.add(360);
        del.add(720);
        del.add(31);
       list.removeAll(del);
        System.out.println(list);
        list.removeIf(v->v%2 == 1);
        System.out.println(list);
        list.replaceAll(v->v+5);
         System.out.println(list);
         
        int index =  list.indexOf(61);
        System.out.println(index);
        System.out.println(list.get(index));
        index =  list.indexOf(77);
        System.out.println(index); 
        
        list.set(2, 95);
        System.out.println(list);
        
       list.replaceAll(v->{
            if(v % 5 == 0) return v + 2;
            else return v;       
       });
        System.out.println(list);
    }
    
}
