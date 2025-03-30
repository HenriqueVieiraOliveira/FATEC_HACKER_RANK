/*
Given a double-precision number, , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
 */

package org.aula;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        scan.close();

        Locale usLocale = Locale.US;
        Locale chinaLocale = Locale.CHINA;
        Locale indiaLocale = new Locale("en", "IN");
        Locale franceLocale = Locale.FRANCE;
        
        NumberFormat us = NumberFormat.getCurrencyInstance(usLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(chinaLocale);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat france = NumberFormat.getCurrencyInstance(franceLocale);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
