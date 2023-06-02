/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20230602.Ch24_2_io2;
import java.time.LocalDateTime;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class Ch24_2 {
    public static void main(String[] args)throws Exception {
    LocalDateTime now =   LocalDateTime.now();
    User user = new User("Vivin",now.toString());
    System.out.println(user);
    File src = new File("c:\\mydir\\user.obj");
    try(ObjectOutputStream outStr = 
            new ObjectOutputStream(new FileOutputStream(src))){
        outStr.writeObject(user);
    }
    
    }
    
}
