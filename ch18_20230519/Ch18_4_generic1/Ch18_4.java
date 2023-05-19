/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20230519.Ch18_4_generic1;

/**
 *
 * @author xvpow
 */
public class Ch18_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        MyList list = new MyList();
        list.add("Ken");
        list.add("Vivin");
        list.add("Lucy");
        
        list.foreach(c->System.out.println(c));
        
          MyList<Integer> list2 = new MyList();
          list2.add(10);
          list2.add(26);
          list2.add(18);
          list2.foreach(v->System.out.println(v));
    }
    
}
