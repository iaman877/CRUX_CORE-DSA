/*
The given program will find the maximum number of handshakes in a room. 
Suppose there are N persons in a room. We have to find the maximum number of Handshakes possible.
Given the fact that any two persons shake hand only once.
Example: N=3 namely A,B,C
A shakes hand with B and C. now B shakes hand with C.Thus total number of ways to shake hands are 2+1 = 3 ways . 

Start
user is asked to input an integer value n, representing the number of people
calculate answer as  n * (n – 1) / 2 as explained earlier .

https://www.youtube.com/watch?v=33TgLi-wp3E
*/
import java.io.*;
import java.util.*;

class Main
{
    static int maxHandshake(int n) 
    { 
        return (n * (n – 1)) / 2; 
    } 
    public static void main (String[] args) 
    { 
        Scanner sc=newScanner(System.in);
        int n = sc.nextLine(); 
        System.out.println( maxHandshake(n)); 
    } 
} 