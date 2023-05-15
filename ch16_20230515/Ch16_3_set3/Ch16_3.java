/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20230515.Ch16_3_set3;
import java.util.TreeSet;
public class Ch16_3 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet();
        //預設小到大 遞增排序
        treeSet.add(20);
        treeSet.add(18);
        treeSet.add(25);
        treeSet.add(6);
        treeSet.add(11);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        
        System.out.println(treeSet.ceiling(11));//找set中 >= 11
        System.out.println(treeSet.higher(11));//找set中 剛好 > 11
                
       System.out.println(treeSet.floor(11));//找set中 <= 11
      System.out.println(treeSet.lower(11));//找set中 剛好 < 11
    }
    
}
