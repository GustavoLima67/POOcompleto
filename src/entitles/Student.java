
package entitles;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Integer age;
    private Date bithDate;
    
    private static SimpleDateFormat sdf = new SimpleDateFormat();
    
    public Student(){
    }
    public Student(String name,Integer age,Date bithDate){
        this.name = name;
        this.age = age;
        this.bithDate = bithDate;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public Date getBihtDate(){
        return bithDate;
    }
    public void setBihtDate(Date bithDate){
        this.bithDate = bithDate;
    }
    public String toString(){
        return "Student: "+name+", Age: "+age+", BirthDate:"+sdf.format(bithDate);
    }
     
}
