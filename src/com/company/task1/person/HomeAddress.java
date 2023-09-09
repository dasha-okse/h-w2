package com.company.task1.person;

import java.util.Scanner;

public class HomeAddress {
    private String street;
    private int buildNumber;

    public void setStreet(String street) {
        this.street = street;
    }
    public String getStreet() {
        return street;
    }

    public void setBuildNumber(int buildNumber) {
        this.buildNumber = buildNumber;
    }
    public int getBuildNumber() {
        return buildNumber;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a street: ");
        street = scanner.nextLine();

        System.out.print("Enter a build number: ");
        buildNumber = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Home address: " + street + " " + buildNumber ;
    }
}
