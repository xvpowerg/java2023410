/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20230503.Ch11_2_Report;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Employee {
    private String name;
    private ArrayList<Integer> score = new ArrayList();
    Employee(String name){
        this.name = name;
    }
    public void appendScore(int s){
        score.add(s);
    }
    
    public String toString(){
        return name+":"+score;
    }
}
