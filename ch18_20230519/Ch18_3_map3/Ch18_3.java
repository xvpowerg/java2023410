/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20230519.Ch18_3_map3;
import java.util.TreeMap;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch18_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Comparator<Item> comp = Comparator.comparing(it->it.getPrice());
        TreeMap<Item,String> treeMap = new TreeMap(comp);
        Item i1 = new Item("A",10);
        Item i2 = new Item("B",20);
        Item i3 = new Item("C",6);
        Item i4 = new Item("D",5);
        treeMap.put(i1, i1.getName());
        treeMap.put(i2, i2.getName());
        treeMap.put(i3, i3.getName());
        treeMap.put(i4, i4.getName());
        System.out.println(treeMap);
    }
    
}
