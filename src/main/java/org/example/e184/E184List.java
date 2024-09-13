package org.example.e184;

import java.util.LinkedList;
import java.util.List;


public class E184List {

    public static List<String> removeCountriesStartingWithA(List<String> countries) {
countries.removeIf(country ->country.startsWith("A"));
return countries;}

    public static void main(String[] args) {
        LinkedList<String> countries=new LinkedList<>();
        countries.add("USA");
countries.add("Argentina");
countries.add("Kazakhstan");
countries.add("Australia");
countries.add("Pakistan");
countries.add("Russia");
        List<String> updatedCountries = removeCountriesStartingWithA(countries);
        System.out.println(updatedCountries);
    }
}
