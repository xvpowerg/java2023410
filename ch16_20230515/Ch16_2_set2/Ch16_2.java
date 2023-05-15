/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20230515.Ch16_2_set2;
import java.util.HashSet;
/**
 *
 * @author xvpow
 */
public class Ch16_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<Item> set = new HashSet<>();
        Item i1 = new Item(1,"A");
        Item i2 = new Item(2,"B");
        Item i3 = new Item(3,"C");
        Item i4 = new Item(4,"D");
        Item search = new Item(3,"C");
        set.add(i1);
        set.add(i2);
        set.add(i3);
        set.add(i4);
        //System.out.println(search.equals(i3));
      System.out.println(set.contains(search));  
    }
    
}

