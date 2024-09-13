package org.example.e180;

import java.util.Collections;
import java.util.LinkedList;

public class E180List {
    public static void main(String[] args){
        LinkedList<Integer>ages=new LinkedList<>();
        ages.add(60);  // Changed from 25 to 60
        ages.add(30);
        ages.add(35);
        ages.add(40);
        ages.add(45);
        ages.add(50);
        ages.add(55);

        ages.removeIf(age->age<25||age>60);

        Collections.sort(ages);
        if (!ages.isEmpty()){
            double averageAge=ages.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0.0);
            System.out.println("Remaining ages: "+ ages);
            System.out.print( "Average age: " + averageAge);
        }else {
            System.out.println("No ages remaining after filtering.");
        }

    }

}
