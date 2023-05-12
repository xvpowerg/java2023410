/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20230512.ch15_3_collections1;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch15_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList();
        list.add(16);
        list.add(50);
        list.add(6);
        list.add(15);
        list.add(18);
        
        System.out.println(list.get(2));
        
        for (int i = 0; i < list.size();i++){
            System.out.println(i+":"+list.get(i));
        }
        System.out.println("====================");
        
        for (int v : list){
            System.out.println(v);
        }
        System.out.println("====================");
        list.forEach(v->System.out.println(v));
        
    }
    
}
