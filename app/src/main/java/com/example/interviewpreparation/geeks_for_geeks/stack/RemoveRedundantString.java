package com.example.interviewpreparation.geeks_for_geeks.stack;

import java.util.ArrayList;

public class RemoveRedundantString {
    public static void main(String[] args) {
        String s = "Hello World World Hello";
//        List<String> strings = Arrays.asList(s.split(" "));
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("World");
        strings.add("Hello");
//        strings.add("Hello");
        int size = strings.size();
        for (int i = 0; i < size; ) {
            if (i + 1 < size && strings.get(i).equals(strings.get(i + 1))) {
                strings.remove(i);
                strings.remove(i);
                size = size - 2;
                if (i > 0)
                    i--;
            } else {
                i++;
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
