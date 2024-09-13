package org.example.e183;

import java.util.LinkedList;

public class E183List {

    public static void main(String[] args) {
        LinkedList<Integer>sales=new LinkedList<>();
        sales.add(11100);
        sales.add(12200);
        sales.add(13300);
        sales.add(14400);
        sales.add(15500);
        sales.add(16600);
int totalSales=0;
        for (Integer monthlySales:sales){
            totalSales += monthlySales;

        }
        System.out.println("Total sales for the year: "+totalSales);
    }

}