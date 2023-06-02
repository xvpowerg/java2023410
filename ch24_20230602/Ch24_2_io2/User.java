/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20230602.Ch24_2_io2;
import java.io.Serializable;
import java.io.IOException;
import java.time.LocalDateTime;
/**
 *
 * @author xvpow
 */
public class User  implements Serializable{
    private String name;
    private String createTime;
    //序列化
    private void writeObject(java.io.ObjectOutputStream out) throws IOException{
        System.out.println("writeObject!!");
        out.writeObject(name);
        
    }
    //反序列化
    private  void readObject(java.io.ObjectInputStream in) throws IOException,ClassNotFoundException{
         System.out.println("readObject!!");
          name = in.readObject().toString();
          createTime = LocalDateTime.now().toString();
    }
    
    public User(String name, String createTime) {
        this.name = name;
        this.createTime = createTime;
    }
    
    @Override
    public String toString() {
        return "User{" + "name=" + name + ", createTime=" + createTime + '}';
    }
    
}
