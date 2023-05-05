/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20230505.Ch12_5_if5;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Ch12_5 {

    static void foreach(Consumer<String> c,String ... values){
        for (String v : values){
            c.accept(v);
        }
        
    }
    public static void main(String[] args) {
        // Consumer<T> accept​(T t)
        //Supplier<T> T get()
        //Function<T,​R> R apply​(T t)
        //UnaryOperator<T> T apply​(T t)
        //Predicate<T> boolean	test​(T t)
        PrintStyle psty = new PrintStyle();
        foreach(psty,"A","B","C","D");
        PrintStyle2 psty2 = new PrintStyle2();
        foreach(psty2,"A","B","C","D");
    }
    
}
