/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20230517.Ch17_1_set1;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch17_1 {
    
    private static class MyComparator implements Comparator<Student>{
          int sortType = 1;
        public int compare(Student st1,Student st2){
            int cmp = 0;
            if (st1.getScore1() > st2.getScore1()){
                cmp = 1;
            }else if(st1.getScore1() < st2.getScore1()){
                cmp = -1;
            }else if(st1.getScore2() > st2.getScore2()){
                cmp = 1;
            }else if(st1.getScore2() < st2.getScore2()){
               cmp = -1;  
            }else{
               cmp =  st1.getName().compareTo(st2.getName());
            }            
            return cmp * sortType;
        }
        public void asc(){
            sortType = -1;
        }
           public void desc(){
            sortType = 1;
        }
    }
    
    public static void main(String[] args) {
       Student st1  = new Student("Ken",82,71);
       Student st2  = new Student("Vivin",82,65);
       Student st3  = new Student("Lucy",52,81);
       Student st4  = new Student("Iris",82,71);
       Student st5  = new Student("Joy",82,93);
       MyComparator cmp = new MyComparator();
       cmp.desc();
       //預設是小到大 desc
       //建立一個方法 asc() 變為大到小
       TreeSet<Student> set = new TreeSet(cmp);
       set.add(st1);
       set.add(st2);
       set.add(st3);
       set.add(st4);
       set.add(st5);
       System.out.println(set);
    }
    
}

