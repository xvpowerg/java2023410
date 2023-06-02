/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20230602.Ch24_1_io1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author xvpow
 */
public class Ch24_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        Book b1 = new Book("Java",12345);
        Student st1 = new Student("Ken",b1);
        File f1 = new File("c:\\mydir\\student.obj");
        try(ObjectOutputStream ot = 
                new ObjectOutputStream(new FileOutputStream(f1))){
            ot.writeObject(st1);
        }
            
        
    }
    
}
