/*
1. You are given a string exp representing an expression.
2. Assume that the expression is balanced  i.e. the opening and closing brackets match with each other.
3. But, some of the pair of brackets maybe extra/needless. 
4. You are required to print true if you detect extra brackets and false otherwise.

e.g.'
((a + b) + (c + d)) -> false
(a + b) + ((c + d)) -> true

Approach

-> if stack is empty, push element in stack till first closing bracket is encountered.
-> if we found peek of stack as opening bracket, (it means there was no alpha. & opeartor) then there are duplicates else 
-> keep popping till first opening bracket is found, then pop that as well.

*/
import java.io.*;
import java.util.*;

public class Main
{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        duplicateBrackets(str);
    }

    public static void duplicateBrackets(String str) {
        Stack < Character > stack = new Stack < > ();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (stack.peek() == '(') {
                    System.out.println(true);
                    return;
                } else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
        System.out.println(false);
    }
}

