package edu.java.practice;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Dewei on 11/24/2016.
 */
public class JavaStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String input = sc.next();
            if (isValid(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

    public static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();
        //Complete the code
        if (input.isEmpty()) {
            return true;
        }

        for (int i = 0; i < input.length(); i++) {
            Character character = input.charAt(i);
            switch (character) {
                case '{':
                    stack.push('{');
                    break;
                case '[':
                    stack.push('[');
                    break;
                case '(':
                    stack.push('(');
                    break;
                case '}':
                    if (stack.size() == 0 || !stack.pop().equals('{')) {
                        return false;
                    }

                    break;

                case ']':
                    if (stack.size() == 0 || !stack.pop().equals('[')) {
                        return false;
                    }

                    break;

                case ')':
                    if (stack.size() == 0 || !stack.pop().equals('(')) {
                        return false;
                    }

                    break;

            }
        }
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
