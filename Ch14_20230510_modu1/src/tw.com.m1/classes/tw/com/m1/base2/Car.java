/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tw.com.m1.base2;

/**
 *
 * @author xvpow
 */
public class Car {
    private String company;
    private int door;
    public Car(int door,String company){
        this.company = company;
        this.door = door;
    }
    public String toString(){
        return this.company+":"+this.door;
    }
}
