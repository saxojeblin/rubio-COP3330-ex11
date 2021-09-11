/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        double euros, exchange_rate, us_dollar, round_off;
        String strEuros, strExchangeRate;
        Scanner sc = new Scanner (System.in);

        System.out.print("How many euros are you exchanging? ");
        strEuros = sc.nextLine();
        System.out.print("What is the exchange rate? ");
        strExchangeRate = sc.nextLine();

        euros = Double.parseDouble(strEuros);
        exchange_rate = Double.parseDouble(strExchangeRate);

        us_dollar = exchange_rate * euros;
        round_off = Math.round(us_dollar * 100.0)/100.0;

        System.out.println(euros + " euros at an  exchange rate of " + exchange_rate + " is \n" + round_off + " U.S. dollars.");
    }
}
