/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20230517.Ch17_3_map2;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch17_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashMap<String,Integer> map = new HashMap();
        map.put("Lucy", 92);
        map.put("Iris", 88);
        map.put("Lindy", 76);
        map.put("Vivin", 63);
        //key存在 呼叫BIF 回傳值更新map
        map.merge("Iris", 20, (v1,v2)->{
        System.out.println(v1+":"+v2);
        return v1+v2;
        });
        System.out.println(map);
        // //key存在 不呼叫BIF 回傳值新增於map
        map.merge("Joy",62,(v1,v2)->{
            System.out.println(v1+":"+v2);
        return v2;
        });
          System.out.println(map);
    }
    
}
