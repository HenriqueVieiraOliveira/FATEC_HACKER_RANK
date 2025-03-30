/*
Task

Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.*/

package org.aula;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();

        scan.close();

        if (1 <= N && N <= 100) {
            if(N % 2 == 0){
                if(2 <= N && N <= 5){
                    System.out.println("Not Weird");
                }
                else if(6 <= N && N <= 20){
                    System.out.println("Weird");
                }
                else if(N > 20){
                    System.out.println("Not Weird");
                }
            }
            else{
                System.out.println("Weird");
            }  
        }
        
    }
}
