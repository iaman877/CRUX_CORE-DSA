/*
1. You are given a string exp representing an expression.
2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

e.g.
[(a + b) + {(c + d) * (e / f)}] -> true
[(a + b) + {(c + d) * (e / f)]} -> false
[(a + b) + {(c + d) * (e / f)} -> false
([(a + b) + {(c + d) * (e / f)}] -> false


-> if any of the opening brackets are encountered, push them into the stack.
-> if any of the closing brackets are encountered, peek at the stack and see if matching opening bracket is at top, if yes then pop the element else return false. 
-> if any other character, simply continue and move on to the next character till bracket is found.
-> At last, check if the stack is empty, if yes print true else return false


*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        Stack < Character > stack = new Stack < > ();
        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.size() == 0) {
                    System.out.println("false");
                    return;
                } else {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        System.out.println("false");
                        return;
                    }
                }
            } else if (ch == '}') {
                if (stack.size() == 0) {
                    System.out.println("false");
                    return;
                } else {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        System.out.println("false");
                        return;
                    }
                }
            } else if (ch == ']') {
                if (stack.size() == 0) {
                    System.out.println("false");
                    return;
                } else {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        System.out.println("false");
                        return;
                    }
                }
            } else {
                continue;
            }
        }
        if (stack.size() != 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}


