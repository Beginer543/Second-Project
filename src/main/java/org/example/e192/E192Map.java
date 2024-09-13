package org.example.e192;

import java.util.Map;
import java.util.TreeMap;

public class E192Map {
    public static void main(String[] args){
        TreeMap<String, String> IDs=new TreeMap<>();
        IDs.put("1 item","apple");
        IDs.put("2 item","banana");
        IDs.put("3 item","pear");
        IDs.put("4 item","tomato");
        IDs.put("5 item","mango");
        IDs.put("6 item","kiwi");
for (Map.Entry<String, String> entry:IDs.entrySet()){
    System.out.println("Key is "+entry.getKey() + " and value is "+ entry.getValue());
}
    }

}