/*
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
*/

package org.aula;

import java.util.Scanner;

public class Ex07{
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        String a = scaner.next();
        String b = scaner.next();

        scaner.close();

        int soma = a.length() + b.length();
        System.out.println(soma);
        if(a.compareTo(b) > 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(concatenar(a, b));
    }
    public static String concatenar(String a, String b){
        String s;
        char a1 = a.toUpperCase().charAt(0);
        char b1 = b.toUpperCase().charAt(0);

        String A = a.replace(a.charAt(0), a1);
        String B = b.replace(b.charAt(0), b1);
        s = (A + " " + B);
        return s;
    }

}