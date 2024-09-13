package org.example.e194;

import java.util.HashMap;
import java.util.Map;

public class E194Map {
    public static void main(String[] args) {
        HashMap<Integer, String>id=new HashMap<>();
        id.put(101,"John");
        id.put(102,"Emily");
        id.put(103,"Michael");
        id.put(104,"Sarah");
        id.put(105,"David");
        System.out.println("Student IDs:");
        for (Integer key : id.keySet()) {
            System.out.println("Student ID: " + key);
        }


        System.out.println("\nStudent Names:");
        for (String value : id.values()) {
            System.out.println("Student Name: " + value);
        }

        System.out.println("\nStudent Records:");
        for (Map.Entry<Integer, String> entry : id.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Student Name: " + entry.getValue());
        }
    }
}


