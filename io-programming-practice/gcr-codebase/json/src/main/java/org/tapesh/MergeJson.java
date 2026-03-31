package org.tapesh;

import org.json.JSONObject;

import java.util.Arrays;

public class MergeJson {
    public static void main(String[] args) {
        JSONObject json1 = new JSONObject();
        JSONObject json2 = new JSONObject();
        json1.put("Name","Tapesh");
        json1.put("Age",21);
        json2.put("Subjects", Arrays.asList("Maths,java"));
        json2.put("City","Delhi");

        JSONObject mergedJson = new JSONObject();
        for(String key: json1.keySet()){
            mergedJson.put(key,json1.get(key));
        }
        for(String key: json2.keySet()){
            mergedJson.put(key,json2.get(key));
        }
        System.out.println("Merged Json");
        System.out.println(mergedJson);
    }
}
