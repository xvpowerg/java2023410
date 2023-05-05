/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20230505.Ch12_8_if8;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class Increment implements UnaryOperator<Integer>{
     private int n = 5;
    public Increment(){
        
    }
    public Increment(int n){
        this.n = n;
    }
   
    public Integer apply(Integer v){
        return v + n;
    }
}
