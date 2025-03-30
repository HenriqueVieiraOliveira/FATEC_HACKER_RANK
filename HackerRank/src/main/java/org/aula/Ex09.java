/*
Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
 */

package org.aula;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s1 = scan.next();
            int x1 = scan.nextInt();

            String s2 = scan.next();
            int x2 = scan.nextInt();
            
            String s3 = scan.next();
            int x3 = scan.nextInt();
            scan.close();
            
            System.out.println("================================");
            System.out.printf("%-15s%03d%n", s1, x1);
            System.out.printf("%-15s%03d%n", s2, x2);
            System.out.printf("%-15s%03d%n", s3, x3);
            System.out.println("================================");
    }
}