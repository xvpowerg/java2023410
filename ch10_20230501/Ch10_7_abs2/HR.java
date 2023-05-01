/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20230501.Ch10_7_abs2;

/**
 *
 * @author xvpow
 */
public class HR extends Employee {
    HR(String name,int salary){
        super(name,salary);
    }
    public int getPay(){
        return 5000;
    }
}
