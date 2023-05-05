/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch12_20230505.Ch12_2_if2;

/**
 *
 * @author xvpow
 */
public interface TestIF3 extends TestIF1,TestIF2 {
  //  TestIF1 與 TestIF2抽象方法名稱可重複
  //  TestIF1 與 TestIF2 default方法名稱不可重複
    //如果重複解決方法如下:
    //修改default方法名稱
    //TestIF2 繼承 TestIF1
    //TestIF3 複寫 default方法
//   default void testDefault(){
//         System.out.println("TestIF3 "
//                 + "testDefault");
//   }
}
