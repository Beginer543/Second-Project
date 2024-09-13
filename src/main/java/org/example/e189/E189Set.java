package org.example.e189;

import java.util.LinkedHashSet;

public class E189Set {
    public static void main(String[] args) {
        LinkedHashSet<String>addresses=new LinkedHashSet<>();
        addresses.add("null");
        addresses.add("john.doe@example.com");
        addresses.add("jane.smith@example.com");
        addresses.add("john.doe@example.com");
        addresses.add("admin@event.com");
        addresses.add("info@company.com");
        System.out.println("Email List using For-Each:");
for (String email:addresses)      {
    System.out.println(email);
}

    }

}
