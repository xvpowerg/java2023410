/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20230517.Ch17_2_map1;
import java.util.HashMap;
public class Ch17_2 {
    public static void main(String[] args) {
        //Key 身份證  value: 人
        //Key 地址    value:一群人
        
        HashMap<String,Integer> map = new HashMap();
        map.put("Lucy", 92);
        map.put("Iris", 88);
        map.put("Lindy", 76);
        map.put("Vivin", 63);
       System.out.println(map.get("Iris"));
        
       for (String key :  map.keySet()){
           System.out.println(key+":"+map.get(key));
       }
       System.out.println("==========================");
       map.forEach((k,v)->System.out.println(k+":"+v));
         System.out.println("==========================");
       System.out.println(map.containsKey("Iris"));
        System.out.println(map.containsKey("Ken"));
        map.put("Iris", 72);
        System.out.println(map); 
        
        System.out.println(map.get("Ken"));        
        System.out.println(map.getOrDefault("Ken",-1));
        map.putIfAbsent("Vivin", 96);
        System.out.println(map);
    }
    
}
