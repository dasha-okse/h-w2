package com.company.task4;

import com.company.task4.fraction.Fraction;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Fraction fraction1 = new Fraction();

        try{
            fraction1.inputFraction();
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
            return;
        }

        Fraction fraction2 = new Fraction();

        try{
            fraction2.inputFraction();
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
            return;
        }

        fraction1.showFraction();
        fraction2.showFraction();

        System.out.println(fraction1 + " + " + fraction2 + " = " + fraction1.add(fraction2));
        System.out.println(fraction1 + " - " + fraction2 + " = " + fraction1.subtract(fraction2));
        System.out.println(fraction1 + " * " + fraction2 + " = " + fraction1.multiply(fraction2));
        try {
            System.out.println(fraction1 + " / " + fraction2 + " = " + fraction1.divide(fraction2));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
