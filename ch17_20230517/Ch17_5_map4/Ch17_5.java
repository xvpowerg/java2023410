/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20230517.Ch17_5_map4;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
public class Ch17_5 {
    public static void main(String[] args) {       
        Random ran = new Random();        
        ArrayList<Integer> list = new ArrayList();
        HashMap<Integer,Integer> groupMap = new HashMap();
        for (int i =1 ; i <= 200;i++){
            int v = ran.nextInt(50) + 1;
           // System.out.println(v);
            list.add(v);
        }
//        for (int v : list){
//            int count = 0;
//            if (groupMap.containsKey(v)){
//                count = groupMap.get(v);
//            }
//            count++;
//            groupMap.put(v,count);
//        }
    for (int v : list){
         groupMap.computeIfPresent(v, (k,c)->c+1);
         groupMap.computeIfAbsent(v, (k)->1);
        }
      System.out.println(groupMap);
    }
    
}
