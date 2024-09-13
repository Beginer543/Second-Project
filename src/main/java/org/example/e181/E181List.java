package org.example.e181;

import java.util.ArrayList;
import java.util.Iterator;

public class E181List {
    public static void main(String[] args) {
        // Step 1: Initialize ArrayList listA and add task statuses
        ArrayList<Boolean> listA = new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);

        // Step 2: Copy the task statuses from listA to listB
        ArrayList<Boolean> listB = new ArrayList<>(listA);

        // Step 3: Use an Iterator to print each task status from listB
        Iterator<Boolean> iterator = listB.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}
