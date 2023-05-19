/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20230519.Ch18_1_map1;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch18_1 {

    public static void main(String[] args) {
      ArrayList<Product> list = new ArrayList();
      Product p1 = new Product("A",10);
      Product p2 = new Product("C",20);
      Product p3 = new Product("A",30);
      Product p4 = new Product("B",5);
      Product p5 = new Product("C",7);
      Product p6 = new Product("A",35);
      list.add(p1);
      list.add(p2);
      list.add(p3);
      list.add(p4);
      list.add(p5);
      list.add(p6);
      
      
      HashMap<String,List<Product>> groupMap = new HashMap();
      for (Product p : list){
          List<Product> pList = new ArrayList();
          pList.add(p);
          groupMap.merge(p.getName(), pList, (v1,v2)->{
              v1.addAll(v2);
          return v1;});
      }
        System.out.println(groupMap);
    }
    
}
