/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20230505.Ch12_7_if7;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class StringToIntLen implements Function<String,Integer>{
    public Integer apply(String st){
        return st.length();
    }
}
