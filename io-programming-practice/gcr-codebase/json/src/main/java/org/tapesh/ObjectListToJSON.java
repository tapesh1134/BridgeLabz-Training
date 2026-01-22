package org.tapesh;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectListToJSON {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Tapesh", Arrays.asList("Math","C++","Java"));
        Student s2 = new Student(2,"Ankit", Arrays.asList("C++","Java"));
        Student s3 = new Student(3,"Sam", Arrays.asList("Math","Java"));
        List<Student> studentList = Arrays.asList(s1,s2,s3);

        JSONArray jsonArray = new JSONArray();
        
        for(Student s : studentList){
            JSONObject json = new JSONObject();
            json.put("RollNo",s.getRollNo());
            json.put("Name",s.getName());
            json.put("Subjects",s.getSubjects());
            jsonArray.put(json);
        }
        System.out.println("JSON Array");
        System.out.println(jsonArray);
    }
}
