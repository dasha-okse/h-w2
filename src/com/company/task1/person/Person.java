package com.company.task1.person;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private FullName fullName;

    {
        fullName = new FullName();
    }

    private Date birthDate;
    private String phoneNumber;
    private String city;
    private String country;
    private HomeAddress homeAddress;

    {
        homeAddress = new HomeAddress();
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }
    public FullName getFullName() {
        return fullName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public Date getBirthDate() {
        return birthDate;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }

    public void setHomeAddress(HomeAddress homeAddress) {
        this.homeAddress = homeAddress;
    }
    public HomeAddress getHomeAddress() {
        return homeAddress;
    }

    public void input() {
        fullName.input();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter birth date: ");
            String inputDate = scanner.nextLine();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            try {
                birthDate = dateFormat.parse(inputDate);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (birthDate == null);

        do {

            System.out.print("Enter phone number: ");
            String phone = scanner.nextLine();


            Pattern pattern = Pattern.compile("\\d{10}");
            Matcher matcher = pattern.matcher(phone);

            if (matcher.matches()) {
                phoneNumber = phone;
            } else {
                System.out.println("Incorrect phone number.");
            }

        }while (phoneNumber == null);

        System.out.print("Enter city: ");
        city = scanner.nextLine();

        System.out.print("Enter country: ");
        country = scanner.nextLine();

        homeAddress.input();

    }

    public void showInfo() {
        System.out.println(fullName + "\nPhone number: " + phoneNumber + "\nCity: " + city +
                "\nCountry: " + country + "\n" + homeAddress);
    }

}
