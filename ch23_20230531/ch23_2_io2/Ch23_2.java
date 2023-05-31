/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20230531.ch23_2_io2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class Ch23_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //序列化 Serialization
        File f1 = new File("c:\\mydir\\msg.obj");
        String msg = "Ken";
        try(FileOutputStream fout = new FileOutputStream(f1);
            ObjectOutputStream obj = new ObjectOutputStream(fout)){            
            obj.writeObject(msg);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
        
      
        
        
    }
    
}
