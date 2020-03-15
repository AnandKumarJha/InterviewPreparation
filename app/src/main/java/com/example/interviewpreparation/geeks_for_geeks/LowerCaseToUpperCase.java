package com.example.interviewpreparation.geeks_for_geeks;

public class LowerCaseToUpperCase {
    public static void main(String[] args) {
        String input = "Hello World";
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                charArray[i] = (char) (charArray[i] - 'a' + 'A');
            }
        }
        System.out.println(String.valueOf(charArray));

        String s1 = "hello world";
        String s2 = "HELLO WORLD";
        System.out.println(s1 + " isLower : " + isLower(s1) + " isUpper : " + isUpper(s1));
        System.out.println(s2 + " isLower : " + isLower(s2) + " isUpper : " + isUpper(s2));

        System.out.println("Converting to upper : " + toUpper(s1));
        System.out.println("Converting to lower : " + toLower(s2));
        System.out.println("Upper lower and lower upper : " + convertUpperToLowerAndLowerToUpper(input));
        System.out.println("ConvertToGoogleCase : " + convertToGoogleCaseStrings(input));
        System.out.println("CamelCaseForSentence : " + camelCaseForSentence("I get intern at geeksforgeeks"));
        countOccuranceOfChars();
        System.out.println();
        System.out.println(javaVarToCppVar("myJavaVar"));
        System.out.println(cppVarToJavaVar("my_cpp_var"));
    }

    private static boolean isLower(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                return false;
            }
        }
        return true;
    }

    private static boolean isUpper(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                return false;
            }
        }
        return true;
    }

    private static String toUpper(String input) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                charArray[i] = (char) (charArray[i] - 'a' + 'A');
            }
        }

        //both method can be used here
//        for (int i = 0; i < charArray.length; i++) {
//            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
//                charArray[i] = (char) ((int)charArray[i] - 32);
//            }
//        }
        return String.valueOf(charArray);
    }

    private static String toLower(String input) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                charArray[i] = (char) (charArray[i] - 'A' + 'a');
            }
        }
        return String.valueOf(charArray);
    }

    private static String convertUpperToLowerAndLowerToUpper(String input) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                charArray[i] = (char) (charArray[i] - 'a' + 'A');
            } else if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                charArray[i] = (char) (charArray[i] - 'A' + 'a');
            }
        }
        return String.valueOf(charArray);
    }

    private static String convertToGoogleCaseStrings(String input) {
        String[] strings = input.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(" " + convertToGoogleCase(strings[i]));
        }
        return stringBuilder.toString().trim();
    }

    private static String convertToGoogleCase(String input) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i == 0 && (charArray[i] >= 'A' && charArray[i] <= 'Z')) {
                charArray[i] = (char) (charArray[i] - 'A' + 'a');
            } else if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                charArray[i] = (char) (charArray[i] - 'a' + 'A');
            }
        }
        return String.valueOf(charArray);
    }

    private static String camelCaseForSentence(String input) {
        String[] strings = input.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(convertFirstCap(strings[i]));
        }
        return stringBuilder.toString().trim();
    }

    private static String convertFirstCap(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 && (chars[i] >= 'a' && chars[i] <= 'z')) {
                chars[i] = (char) (chars[i] - 'a' + 'A');
            } else if (i > 0 && (chars[i] >= 'A' && chars[i] <= 'Z')) {
                chars[i] = (char) (chars[i] - 'A' + 'a');
            }
        }
        return String.valueOf(chars);
    }

    private static void countOccuranceOfChars() {
        String input = "geeksforgeeks";
        int[] count = new int[26];
        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i) - 'a']++;
        }
        for (int i = 0; i < input.length(); i++) {
            while(count[input.charAt(i) - 'a']!=0) {
                System.out.print(input.charAt(i));
                count[input.charAt(i) - 'a']--;
            }
        }
    }

    private static String javaVarToCppVar(String input){
        //myJavaVar
//        StringBuilder stringBuilder = new StringBuilder();
//        char[] chars = input.toCharArray();
//        for(int i=0; i<chars.length; i++){
//            if(chars[i]>='A' && chars[i]<='Z'){
//                char c = (char)(chars[i]-'A'+'a');
//                stringBuilder.append("_"+c);
//            }else{
//                stringBuilder.append(chars[i]);
//            }
//        }
//        return stringBuilder.toString();
        return input.replaceAll("([A-Z])", "_$1").toLowerCase();
    }

    private static String cppVarToJavaVar(String input){
        //my_cpp_var
        //another method with splitting with _

        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)=='_'){
                stringBuilder.append((char)(input.charAt(i+1)-'a'+'A'));
                i++;
            }else{
                stringBuilder.append(input.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
    //()
}

