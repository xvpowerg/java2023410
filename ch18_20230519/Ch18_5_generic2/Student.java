/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20230519.Ch18_5_generic2;
import java.util.Collection;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Student<T extends Collection<Integer>> {
    private String  name;
    private T score;

    public Student(String name, T score) {
        this.name = name;
        this.score = score;
    }
    public void addScore(int s){
        score.add(s);
    }
    public void foreach(Consumer<Integer> c){
        System.out.println(this.name+":");
        score.forEach(c);
    }
}
