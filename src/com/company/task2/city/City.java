package com.company.task2.city;

import java.util.Scanner;

public class City {

    private String city;
    private String region;
    private String country;
    private long population;
    private String postalCode;
    private int phoneCode;

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter city name: ");
        city = scanner.nextLine();

        System.out.print("Enter region name: ");
        region = scanner.nextLine();

        System.out.print("Enter country name: ");
        country = scanner.nextLine();

        do {

            System.out.print("Enter population: ");
            population = scanner.nextLong();
            scanner.nextLine();

        }while (population <= 0);

        System.out.print("Enter postal code: ");
        postalCode = scanner.nextLine();

        do {
            System.out.print("Enter phone code: ");
            phoneCode = scanner.nextInt();
            scanner.nextLine();
        }while (phoneCode <= 0);
    }

    public void showInfo() {
        System.out.println("City: " + city +
                "\nRegion: " + region +
                "\nCountry: " + country +
                "\nPopulation: " + population +
                "\nPostal code: " + postalCode +
                "\nPhone code: " + phoneCode);
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    public String getRegion() {
        return region;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
    public long getPopulation() {
        return population;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getPostalCode() {
        return postalCode;
    }

    public void setPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
    }
    public int getPhoneCode() {
        return phoneCode;
    }

}
