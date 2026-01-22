package org.tapesh;

import org.json.JSONObject;
import java.util.Arrays;
import java.util.List;

class Student{
    private int rollNo;
    private String name;
    private List<String> subjects;
    public Student(int rollNo,String name,List<String> subjects){
        this.rollNo = rollNo;
        this.name = name;
        this.subjects = subjects;
    }
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public List<String> getSubjects(){
        return subjects;
    }
}

public class StudentJsonObject {
    public static void main(String[] args) {
        Student student = new Student(1,"Tapesh Sharma", Arrays.asList("Maths","Java","C++"));
        JSONObject json = new JSONObject();
        json.put("RollNo",student.getRollNo());
        json.put("Name",student.getName());
        json.put("Subjects",student.getSubjects());
        System.out.println("Student details");
        System.out.println(json);
    }
}
