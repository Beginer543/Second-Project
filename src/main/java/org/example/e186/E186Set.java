package org.example.e186;

import java.util.HashSet;

public class E186Set {
    public static void main(String[] args) {
        HashSet<String>name=new HashSet<>();
        name.add("first");
        name.add("second");
        name.add("third");
        System.out.println(name);
        name.removeAll(name);
        System.out.println(name);
    }

}
