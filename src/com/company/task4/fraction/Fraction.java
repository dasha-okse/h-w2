package com.company.task4.fraction;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            throw new IllegalArgumentException("Denominator can't be zero.");
        }
    }
    public int getDenominator() {
        return denominator;
    }

    public void showFraction() {
        System.out.println(numerator + "/" + denominator);
    }

    public void inputFraction() throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int newDenominator = scanner.nextInt();

        if (newDenominator != 0) {
            denominator = newDenominator;
        } else {
            throw new IllegalArgumentException("Denominator can't be zero.");
        }
    }

    private int commonDenominator(int num1, int num2) {
        int den = Math.min(num1, num2);

        for(int i = den; i >= 1; i--) {

            if(num1 % i ==0 && num2 % i ==0) {
                den = i;
                break;
            }
        }

        return den;
    }

    public Fraction add(Fraction other) {
        Fraction fraction = new Fraction();

        if(this.denominator == other.denominator) {
            fraction.setNumerator(this.numerator + other.numerator);
            fraction.setDenominator(this.denominator);
        }
        else {
            fraction.setNumerator(this.numerator * other.denominator + other.numerator * this.denominator);
            fraction.setDenominator(this.denominator * other.denominator);
        }

        int commonDen = commonDenominator(fraction.getNumerator(), fraction.getDenominator());

        fraction.setNumerator(fraction.getNumerator() / commonDen);
        fraction.setDenominator(fraction.getDenominator() / commonDen);

        return fraction;
    }

    public Fraction subtract(Fraction other) {
        Fraction fraction = new Fraction();

        if(this.denominator == other.denominator) {
            fraction.setNumerator(this.numerator - other.numerator);
            fraction.setDenominator(this.denominator);
        }
        else {
            fraction.setNumerator(this.numerator * other.denominator - other.numerator * this.denominator);
            fraction.setDenominator(this.denominator * other.denominator);
        }

        int commonDen = commonDenominator(fraction.getNumerator(), fraction.getDenominator());

        fraction.setNumerator(fraction.getNumerator() / commonDen);
        fraction.setDenominator(fraction.getDenominator() / commonDen);

        return fraction;
    }

    public Fraction multiply(Fraction other) {
        Fraction fraction = new Fraction();

        fraction.setNumerator(this.numerator * other.numerator);
        fraction.setDenominator(this.denominator * other.denominator);

        int commonDen = commonDenominator(fraction.getNumerator(), fraction.getDenominator());

        fraction.setNumerator(fraction.getNumerator() / commonDen);
        fraction.setDenominator(fraction.getDenominator() / commonDen);

        return fraction;
    }

    public Fraction divide(Fraction other) throws ArithmeticException {
        Fraction fraction = new Fraction();

        if (other.numerator != 0) {
            fraction.setNumerator(this.numerator * other.denominator);
            fraction.setDenominator(this.denominator * other.numerator);

            int commonDen = commonDenominator(fraction.getNumerator(), fraction.getDenominator());

            fraction.setNumerator(fraction.getNumerator() / commonDen);
            fraction.setDenominator(fraction.getDenominator() / commonDen);

            return fraction;
        } else {
            throw new ArithmeticException("Can't be divided by zero ");
        }
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator ;
    }
}
