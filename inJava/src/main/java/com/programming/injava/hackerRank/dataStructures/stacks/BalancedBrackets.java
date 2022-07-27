package com.programming.injava.hackerRank.dataStructures.stacks;

import org.springframework.boot.SpringApplication;
import java.util.Stack;

public class BalancedBrackets {
    // URL = https://www.hackerrank.com/challenges/balanced-brackets/problem?isFullScreen=true
    public static void main(String[] args) {
        SpringApplication.run(BalancedBrackets.class, args);
        // input = "{[()]}"
            System.out.println(isBalanced("{[()]}"));
        // output = "YES"

        // input = "{[(])}"
            System.out.println(isBalanced("{[(])}"));
        // output = "NO"

        // input = "{{[[(())]]}}"
            System.out.println(isBalanced("{{[[(())]]}}"));
        // output = "YES"

        // input = "{(([])[])[]}"
            System.out.println(isBalanced("{(([])[])[]}"));
        // output = "YES"

    }

    private static String isBalanced(String s) {
        Stack<Character> sCheck = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                sCheck.push(s.charAt(i));
            } else {
                if(sCheck.isEmpty()) {
                    return "NO";
                } else {
                    char popedValue = sCheck.pop();
                    if(s.charAt(i) == ')' && popedValue != '(') {
                        return "NO";
                    } else if(s.charAt(i) == ']' && popedValue != '[') {
                        return "NO";
                    } else if(s.charAt(i) == '}' && popedValue != '{') {
                        return "NO";
                    }
                }
            }
        }
        return sCheck.isEmpty() ? "YES" : "NO";
    }
}
