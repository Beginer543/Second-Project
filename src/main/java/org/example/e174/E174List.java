package org.example.e174;

import java.util.ArrayList;

public class E174List {
    public static void main(String[] args){
        ArrayList<Integer> IDsList =new ArrayList<>();
IDsList.add(1011);
IDsList.add(1022);
IDsList.add(1033);
IDsList.add(1044);
IDsList.add(1055);
IDsList.add(1066);



        // Step 3: Retrieve specific  IDs (1st, 3rd, and 5th) and print them
        System.out.println(IDsList.get(0));//First product (index 0)
        System.out.println(IDsList.get(2));// Third product (index 2)
        System.out.println(IDsList.get(4));// Fifth product (index 4)
    }
    }


