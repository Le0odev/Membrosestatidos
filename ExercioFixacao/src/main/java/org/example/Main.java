package org.example;

import CurrencyConverter.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("Enter the current dollar price:");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double dollarBought = sc.nextDouble();

        double result$ = converter.converter(dollarPrice, dollarBought);
        System.out.printf("Amount to be paid in $(REAL): %.2f%n ", result$);
    }
}
