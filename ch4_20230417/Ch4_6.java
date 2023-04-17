/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20230417;

/**
 *
 * @author xvpow
 */
public class Ch4_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String id = "248302";
        //字串轉整數
        int intId = Integer.parseInt(id);        
        System.out.println(intId + 2);
        Object obj = new Object();
        String b1 = Integer.toBinaryString(531);//10 轉2進位
        String oc2 = Integer.toOctalString(531);//10 轉8進位
        System.out.println(b1);
        System.out.println(oc2);
          System.out.println("====================");
        System.out.println(obj.hashCode());
        String hex3 =  Integer.toHexString(obj.hashCode());//10 轉16進位
        System.out.println(hex3);
    }
    
}
