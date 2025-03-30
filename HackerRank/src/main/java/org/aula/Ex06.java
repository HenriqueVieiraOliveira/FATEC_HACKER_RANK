/*
In this challenge, we're going to use loops to help us do some simple math.

Task
Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.
 */

package org.aula;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        scan.close();

        for (int i = 0; i < 10; i++) {
            System.out.println(num + " x " + (i+1) + " = " + num*(i+1));   
        }
    }
}
