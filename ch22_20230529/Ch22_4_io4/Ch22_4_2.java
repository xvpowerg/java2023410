/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20230529.Ch22_4_io4;

/**
 *
 * @author xvpow
 */
public class Ch22_4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try(TestAutoClose tc1 = new TestAutoClose("TC1");
            TestAutoClose tc2 = new TestAutoClose("TC2",true);){
             System.out.println("Body!!!");
         }catch(Exception ex){
             System.out.println(ex);
         }
         
         
         
        
    }
    
}
