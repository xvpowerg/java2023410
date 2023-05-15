
package ch16_20230515.Ch16_4_set4;
public class Student implements Comparable<Student>{
    private String name;
    private int score;
    
    //目前大於傳入回傳正數
    //目前小於傳入回傳負數
    //目前等於傳入回傳0
    public int compareTo(Student tmpSt){
        if (this.score > tmpSt.score){
            return 1;
        }else if (this.score < tmpSt.score){
            return -1;
        }
        return name.compareTo(tmpSt.getName());
    }
    
    
    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }
    
    public String getName(){
        return name;
    }    
    public int getScore(){
        return this.score;
    }
        
    public String toString(){
        
        return this.name+":"+this.score;
    }
    
 
}
