package com.example.interviewpreparation.geeks_for_geeks.stack;

import java.util.Stack;

public class RedundantBracketOrNot {

    private static boolean isRedundantParenthesis(String input) {
        Stack<Character> stack = new Stack<>();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (c == ')') {
                char top = stack.peek();
                stack.pop();
                boolean isRedundant = true;
                while (top != '(') {
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        isRedundant = false;
                    }
                    top = stack.peek();
                    stack.pop();
                }
                if (isRedundant)
                    return isRedundant;
            } else {
                stack.push(c);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String input = "((a+b))";
        System.out.println(isRedundantParenthesis(input));

        input = "(a+(b)/c)";
        System.out.println(isRedundantParenthesis(input));

        input = "(a+b*(c-d))";
        System.out.println(isRedundantParenthesis(input));
    }
}
