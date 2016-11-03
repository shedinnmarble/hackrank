import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * https://www.hackerrank.com/challenges/ctci-balanced-brackets
 */
public class BalancedBraces {
    public static boolean isBalanced(String expression) {
        //if(expression.length()%2!=0) return false;
        Stack<Character> s=new Stack();
        char[] chars=expression.toCharArray();
        for(char c:chars){
            switch (c){
                case '[':
                    s.push(']');
                    break;
                case '(':
                    s.push(')');
                    break;
                case '{':
                    s.push('}');
                    break;
                default:
                    if(s.isEmpty()||c!=s.peek())
                        return false;
                    s.pop();
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
