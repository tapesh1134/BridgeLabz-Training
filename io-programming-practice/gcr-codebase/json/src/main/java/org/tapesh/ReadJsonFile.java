package org.tapesh;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadJsonFile {
    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("src/main/java/org/tapesh/student.json")));
            JSONObject json = new JSONObject(content);
            System.out.println("Name: " + json.getString("Name"));
            System.out.println("Email: " + json.getString("Email"));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
