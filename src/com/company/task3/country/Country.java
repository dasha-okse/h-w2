package com.company.task3.country;

import java.util.ArrayList;
import java.util.Scanner;

public class Country {
    private String name;
    private String continent;
    private long population;
    private int phoneCode;
    private String capital;
    private ArrayList<String> cities;

    {
        cities = new ArrayList<String>();
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
    public String getContinent() {
        return continent;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
    public long getPopulation() {
        return population;
    }

    public void setPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
    }
    public int getPhoneCode() {
        return phoneCode;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
    public String getCapital() {
        return capital;
    }

    public void addCity(String city) {
        cities.add(city);
    }
    public ArrayList<String> getCities() {
        return cities;
    }

    public void showInfo() {
        System.out.println("Country name: " + name +
                "\nContinent: " + continent +
                "\nPopulation: " + population +
                "\nPhone code: " + phoneCode +
                "\nCapital: " + capital +
                "\nCities: " + cities.toString());
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the country name: ");
        name = scanner.nextLine();

        System.out.print("Enter the continent name: ");
        continent = scanner.nextLine();

        do {

            System.out.print("Enter population: ");
            population = scanner.nextLong();
            scanner.nextLine();

        }while (population <= 0);

        do {

            System.out.print("Enter phone code: ");
            phoneCode = scanner.nextInt();
            scanner.nextLine();

        }while (phoneCode <= 0);

        System.out.print("Enter the capital name: ");
        capital = scanner.nextLine();

        System.out.println("Enter the city name (to finish enter 'complete'): ");
        String city = scanner.nextLine();

        while (!city.equals("complete")) {

            cities.add(city);
            city = scanner.nextLine();

        }
    }
}
