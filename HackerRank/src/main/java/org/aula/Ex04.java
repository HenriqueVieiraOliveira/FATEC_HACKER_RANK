/*
You are given an integer , you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".

 can range between  to  inclusive.
 */
package org.aula;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String s = Integer.toString(num);

        if(Integer.parseInt(s) == num){
            System.out.println("Good job");
        }
        else{
            System.err.println("Wrong answer");
        }
    }
}
