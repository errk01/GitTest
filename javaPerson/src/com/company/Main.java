package com.company;

import com.company.human.Athlete;
import com.company.human.Person;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {

    public static void main(String[] args) {

        Person firstPerson = new Person();
        firstPerson.setName("Erik");
        firstPerson.setAge(11);

        Person secondPerson = new Person();
        secondPerson.setName("");
        secondPerson.setAge(16);

        Athlete runner = new Athlete();
        runner.run("running ");


        System.out.println(firstPerson.getName());
        System.out.println(runner);
    }
}
