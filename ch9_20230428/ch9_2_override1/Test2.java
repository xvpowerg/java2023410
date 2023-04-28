/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20230428.ch9_2_override1;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
    //不複寫
    //複寫子類的例外throws SubException
    //複寫一樣的例外throws MainException
    //RuntimeException 或 子類 不在以上限制內
    public void testException()throws SubException{
        throw new SubException();
    }
    
   public void testRuntimeEx()throws SubRuntimeEx{
       throw new SubRuntimeEx();
   }
}
