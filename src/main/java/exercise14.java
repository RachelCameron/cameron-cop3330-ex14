/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the order amount?");
        double orderamount = input.nextDouble();
        System.out.println("What is the state?");
        String state = input.next();
        final double tax = .055;
        if(state.equalsIgnoreCase("WI")) {
            System.out.printf("The subtotal is $%.2f\n", orderamount);
            System.out.printf("The tax is $%.2f\n", orderamount * tax);
            System.out.printf("The total is $%.2f\n", orderamount + (orderamount * tax));
            return;
        }
        double total = orderamount + tax;
        System.out.printf("The total is $%.2f\n", orderamount);
    }
}
