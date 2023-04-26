/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20230426.Ch8_6_exception4;

/**
 *
 * @author xvpow
 */
public class Ch8_6 {

       static void testEx(boolean b1){
           if (b1){
               throw new RuntimeException();
           }
       } 
       
       static int testFinally(){
                try{
                  System.out.println("testFinally");
                   return 20; 
                }finally{
                  System.out.println("Close");
                }        
        }
    public static void main(String[] args) {      
        try{
         testEx(true);
       
        }catch(RuntimeException ex){
            System.out.println(ex);
        }finally{
              System.out.println("Close");
        }
        
        testFinally();
    
            
        
    }
    
}
