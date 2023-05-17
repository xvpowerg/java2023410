/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20230517.Ch17_4_map3;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch17_4 {


    public static void main(String[] args) {
        
        HashMap<String,Integer> map = new HashMap();
        map.put("Lucy", 92);
        map.put("Iris", 88);
        map.put("Lindy", 76);
        map.put("Vivin", 63);
        
        //key存在會執行function 回傳值寫入map
        map.compute("Iris", (k,v)->{
            System.out.println("compute:"+k+":"+v);
        return v;
        });
        //key存在不會執行function
        map.computeIfAbsent("Iris",(k)->{
          System.out.println("computeIfAbsent:"+k);
          return 25;
        });
        System.out.println(map);
         //key存在會執行function 回傳值寫入map
        map.computeIfPresent("Iris", (k,v)->{
              System.out.println("computeIfPresent:"+k+":"+v);
            return 73;
        });
         System.out.println(map);
        
        System.out.println("===============================");
        
        
         //key不存在會執行function 回傳值寫入map
        map.compute("Tom", (k,v)->{
            System.out.println("compute:"+k+":"+v);
        return 79;
        });
        System.out.println(map);
//        //key不存在會執行function
        map.computeIfAbsent("Gigi",(k)->{
          System.out.println("computeIfAbsent:"+k);
          return 52;
        });
        System.out.println(map);
//        System.out.println(map);
//         //key不存不會執行function
        map.computeIfPresent("Ben", (k,v)->{
              System.out.println("computeIfPresent:"+k+":"+v);
            return 73;
        });
         System.out.println(map);
         
         
    }
    
}
