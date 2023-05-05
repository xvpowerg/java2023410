/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20230505.Ch12_6_if6;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class Ch12_6 {

    /**
     * @param args the command line arguments
     */
    
    //>0  <= 5
    static void printLen(String str,Supplier<StringLenException> exp)throws Exception{
        if (str == null || str.length() <1 || str.length() > 5){
            throw exp.get();
        }
        System.out.println(str.length());
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        String st1 = "qwertas";
        ExceptionSupplier es = new ExceptionSupplier();
        try{
            printLen(st1,es);
        }catch(Exception ex){
            System.out.println(ex);
        }
        
    }
    
}
