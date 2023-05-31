/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20230531.ch23_1_io1;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
/**
 *
 * @author xvpow
 */
public class MyFileReader extends InputStreamReader{
    //預設為utf-8編碼
    //可以設定編碼
    public MyFileReader(File file,String charSet)throws
            FileNotFoundException,UnsupportedEncodingException{
        super(new FileInputStream(file),charSet);
    }
      public MyFileReader(File file)throws 
              FileNotFoundException,UnsupportedEncodingException{
          super(new FileInputStream(file),"utf-8");
      }
}
