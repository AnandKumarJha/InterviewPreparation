package com.example.interviewpreparation;

public class CppVarToJavaVar {

    public static void main(String[] args) {
        String var1 = "myFirstVar";
        String var2 = "my_first_var";

        System.out.println(getJavaVar(var2));
        System.out.println(getCppVariable(var1));

    }

    public static String getCppVariable(String var1) {
        return var1.replaceAll("([A-Z])", "_$1").toLowerCase();
    }

    public static String getJavaVar(String var2) {
        StringBuilder sb = new StringBuilder();
//        int startIndex = 0, length = var2.length();
//        for (int i = 0; i < length; i++) {
//            if (var2.charAt(i) == '_') {
//                sb.append(var2.substring(startIndex, i) + var2.substring(i + 1, i + 2).toUpperCase());
//                startIndex = i + 2;
//            }
//        }
//        sb.append(var2.substring(startIndex, length));
//        return sb.toString();

        String[] arr = var2.split("_");
        sb.append(arr[0]);
        for(int i=1; i<arr.length; i++){
            sb.append(arr[i].substring(0,1).toUpperCase()+arr[i].substring(1, arr[i].length()));
        }
        return sb.toString();


//        return var2.replaceAll("(_.)", "$1").toLowerCase();
    }
}
