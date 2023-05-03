/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20230503.Ch11_8_if6;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Student  implements MyIterator{
    private String name;
    private ArrayList<Integer> scoreList
            = new ArrayList();
    Student(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void addScore(int score){
        scoreList.add(score);
    }
    
    public List<String> getData(){
        ArrayList<String> dataList = new ArrayList();
        String dataStr = this.getName()+":";
        dataStr += scoreList;
        dataList.add(dataStr);
        return dataList;
    }
    
}
