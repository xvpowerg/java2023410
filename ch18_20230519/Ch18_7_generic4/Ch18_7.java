/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20230519.Ch18_7_generic4;

/**
 *
 * @author xvpow
 */
public class Ch18_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestGeneric tg = new TestGeneric();
        Integer result = tg.sum(list->{
                int sum = 0;
                for (String v :list){
                    sum += v.length();
                }
               return sum; 
        });
        
        System.out.println("result:"+result);
        
       String msg =  tg.<String>sum(list->{
            String v = "";
            for (String s : list){
                v += s;
            }
            return v;
        });
      System.out.println("msg:"+msg);
    }
    
}
