package org.tapesh;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ParseJSON {
    public static void main(String[] args) {
        Person p1 = new Person("Tapesh",21);
        Person p2 = new Person("Ankit",26);
        Person p3 = new Person("Sam",27);
        Person p4 = new Person("Raj",22);
        List<Person> personList= Arrays.asList(p1,p2,p3,p4);

        JSONArray jsonArray = new JSONArray();
        for(Person p : personList){
            JSONObject json = new JSONObject();
            json.put("Name",p.getName());
            json.put("Age",p.getAge());
            jsonArray.put(json);
        }

        JSONArray filterJson = new JSONArray();
        for(int i = 0;i<jsonArray.length();i++){
            JSONObject j = jsonArray.getJSONObject(i);
            if(j.getInt("Age") > 25){
                filterJson.put(j);
            }
        }
        System.out.println("Main JSON");
        System.out.println(jsonArray);
        System.out.println("\nFiltered JSON");
        System.out.println(filterJson);
    }
}
