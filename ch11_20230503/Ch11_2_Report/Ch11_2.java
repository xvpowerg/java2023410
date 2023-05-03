/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20230503.Ch11_2_Report;
import ch11_20230503.Ch11_1_ERP.ERP;
/**
 *
 * @author xvpow
 */
public class Ch11_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       Test1 t1 = new Test1();
//       System.out.println(t1);
//       
//      String msg = "Ken,75,80,60";
//      String[] arra =  msg.split(",");
//      System.out.println(arra[0]);
//      System.out.println(arra[2]);
        ERP erp = new MyRpeort();
        erp.exportReport();
        
    }
    
}
