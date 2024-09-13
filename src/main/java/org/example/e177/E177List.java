package org.example.e177;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class E177List {
    public static void main(String[] args){
        ArrayList<String> chatMessages=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Remaining messages:");
        for (int i = 0; i < 5; i++) {
          chatMessages.add(scanner.nextLine());
        }

chatMessages.remove(4);
        chatMessages.remove(2);
        chatMessages.remove(0);

        for (String message:chatMessages){
    System.out.print(message+" ");
}

    }


}
