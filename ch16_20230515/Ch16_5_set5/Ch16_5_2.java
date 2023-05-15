/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20230515.Ch16_5_set5;
import java.util.TreeSet;
import java.util.Comparator;

public class Ch16_5_2 {
    public static void main(String[] args) {
          Comparator<Product> cmp = 
                  Comparator.comparing(p->p.getPrice());
        cmp = cmp.thenComparing(p->p.getName()).
                thenComparing(p->p.getLocation());
        TreeSet<Product> pSet = new TreeSet(cmp);
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
