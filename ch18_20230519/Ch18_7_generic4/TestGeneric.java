/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20230519.Ch18_7_generic4;
import java.util.ArrayList;
import java.util.function.Function;

/**
 *
 * @author xvpow
 */
public class TestGeneric {
    private ArrayList<String> list = new ArrayList<>();
    TestGeneric(){
        list.add("AA");
        list.add("BBBB");
        list.add("DD");
        list.add("FF");
    }
   public <T> T sum(Function<ArrayList<String>,T> func){       
       return func.apply(list);          
   }
    
    
}
