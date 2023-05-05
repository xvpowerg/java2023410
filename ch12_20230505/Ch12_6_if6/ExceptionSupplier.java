/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20230505.Ch12_6_if6;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class ExceptionSupplier implements Supplier<StringLenException>{
    public StringLenException  get(){
        return new StringLenException("String Length Exception!!");
    }
}
