package org.example.e188;

import java.util.TreeSet;

public class E188Set {

    public static void main(String[] args) {
        TreeSet<String> countriesName=new TreeSet<>();
        countriesName.add("India");
        countriesName.add("Australia");
        countriesName.add("South Africa");
        countriesName.add("India");
        countriesName.add("America");
        countriesName.add("America");
        System.out.println(countriesName);    }

}
