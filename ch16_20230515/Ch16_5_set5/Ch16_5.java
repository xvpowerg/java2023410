/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20230515.Ch16_5_set5;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch16_5 {
    //o1 大於 o2 回傳正數
    //o1 小於 o2 回傳負數
    //o1 等於 o2 回傳0
    private static class MyComparator implements Comparator<Product> {
        public int compare(Product o1, Product o2){
                int cmpName = 0;
                if (o1.getPrice() > o2.getPrice()){
                    return 1;
                }else if (o1.getPrice() < o2.getPrice()){
                    return -1;
                }else if (   (cmpName = o1.getName().compareTo(o2.getName()) ) != 0 ){
                    return cmpName;
                }
                
            return o1.getLocation().compareTo(o2.getLocation());
        }
    }
    public static void main(String[] args) {
        MyComparator comp = new MyComparator();
        TreeSet<Product> pSet = new TreeSet(comp);
        Product p1 = new Product("A","AA",85);
        Product p2 = new Product("B","BB",76);
        Product p3 = new Product("C","CC",66);
        Product p4 = new Product("D","DD",61);
        Product p5 = new Product("G","DD",76); 
        Product p6 = new Product("C","GG",66); 
        
        pSet.add(p1);
        pSet.add(p2);
        pSet.add(p3);
        pSet.add(p4);
        pSet.add(p5);
        pSet.add(p6);
        
        System.out.println(pSet);
    }
    
}
