package com.company.human;

public class Person{
    String name;
    int age;
    int height;
    String occupation;
    String habit;

    public Person(String name, int age, int height, String occupation, String habit) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.occupation = occupation;
        this.habit = habit;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
