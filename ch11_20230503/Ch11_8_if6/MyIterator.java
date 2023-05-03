/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch11_20230503.Ch11_8_if6;
import java.util.List;
/**
 *
 * @author xvpow
 */
public interface MyIterator {
    List<String>  getData();
    
    default void foreach(){
        List<String> list = getData();
        for (String v : list){
            System.out.println(v);
        }
    }
}
