package org.example.e175;

import java.util.ArrayList;

public class E175List {
    public static void main(String[] args){
        ArrayList<Integer> productQuantities=new ArrayList<>();
//Product1
        productQuantities.add(111);
productQuantities.add(111);
productQuantities.add(111);

//Product2
productQuantities.add(999);
productQuantities.add(999);
productQuantities.add(999);

       // for (int i = 0; i < productQuantities.size(); i++) {
           // System.out.println(productQuantities.get(i));

        for (int quality:productQuantities){
    System.out.println(quality);
}


        }


  }

