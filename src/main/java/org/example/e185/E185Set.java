package org.example.e185;

import java.util.HashSet;

public class E185Set {
    public static void main(String[] args) {
        HashSet<Integer>iDs=new HashSet<>();
        iDs.add(1001);
        iDs.add(1002);
        iDs.add(1001);
      iDs.add(1003);
        iDs.add(1002);
        iDs.add(1004);
        for (Integer customerId:iDs){
            System.out.println(customerId);
        }

    }
}

