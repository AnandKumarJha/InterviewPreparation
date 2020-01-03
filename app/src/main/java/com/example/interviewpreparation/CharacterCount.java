package com.example.interviewpreparation;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CharacterCount {

    public static void main(String[] args) {

        String myName = "Anand kumar jha";
        TreeMap<Character, Integer> stringCount = new TreeMap<>();
        char c;
        int count;

        for (int i = 0; i < myName.length(); i++) {
            c = myName.charAt(i);
            if (stringCount.containsKey(c)) {
                count = stringCount.get(c);
                stringCount.put(c, count + 1);
            } else {
                stringCount.put(c, 1);
            }
        }
        Set set = stringCount.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry);
        }
    }

    public static class CharacterCount {

        public static void main(String[] args) {

            String myName = "Anand kumar jha";
            TreeMap<Character, Integer> stringCount = new TreeMap<>();
            char c;
            int count;

            for (int i = 0; i < myName.length(); i++) {
                c = myName.charAt(i);
                if (stringCount.containsKey(c)) {
                    count = stringCount.get(c);
                    stringCount.put(c, count + 1);
                } else {
                    stringCount.put(c, 1);
                }
            }
            Set set = stringCount.entrySet();
            Iterator iterator = set.iterator();
            while (iterator.hasNext()){
                Map.Entry entry = (Map.Entry) iterator.next();
                System.out.println(entry);
            }
        }

    }
}
