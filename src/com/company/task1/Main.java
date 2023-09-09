package com.company.task1;

import com.company.task1.person.Person;


public class Main {

    public static void main(String[] args) {
        System.out.println("Create your person: ");


        Person person = new Person();

        person.input();

        person.showInfo();
    }
}
