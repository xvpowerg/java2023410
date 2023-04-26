/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20230426.Ch8_4_exception2;

/**
 *
 * @author xvpow
 */
public class Ch8_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //IOException
        //SQLException
        //FileNotFoundException
       TestException tex = new TestException();
       try{
           tex.test1(true);
       }catch(Exception ex){
           System.out.println(ex);
       }
       //NullPointerException
       // ArithmeticException
       // IllegalArgumentException
       // IndexOutOfBoundsException
       try{
            tex.test2(true);
       }catch(RuntimeException ex){
           System.out.println(ex);
       }
      
       
    }
    
}
