/*
Given a string , print Yes if it is a palindrome, print No otherwise.
 */

package org.aula;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String a = scan.next();

        scan.close();

        String reverso = palindrome(a);     

        if(a.equals(reverso)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static String palindrome(String s) {

        StringBuilder builder = new StringBuilder(s);
        builder.reverse();
        String reverso = builder.toString();

        return reverso;
    }
}