package com.company.task1.person;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FullName {
    private String surname;
    private String name;
    private String middleName;

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getMiddleName() {
        return middleName;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        do{

            System.out.print("Enter surname: ");
            String surname = scanner.nextLine();

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter middle name: ");
            String middleName = scanner.nextLine();

            Pattern pattern = Pattern.compile("([A-Z][a-z']+)(\\s)");
            Matcher matcher = pattern.matcher(surname + " " + name + " " + middleName);

            if(matcher.find()) {
                this.name = name;
                this.surname = surname;
                this.middleName = middleName;
            } else {
                System.out.println("The full name is incorrect. Try again");
            }

        }while(this.name == null);
    }

    @Override
    public String toString() {
        return "Full name: " + surname + " " + name + " " + middleName;
    }
}
