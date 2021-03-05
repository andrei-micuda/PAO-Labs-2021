package com.company;

public class Person {
    String name;
    String surname;
    int age;
    long identityNumber;
    String type;

    Person(String name, String surname, int age, long identityNumber, String type) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.identityNumber = identityNumber;
        this.type = type;
    }

    Person(Person other) {
        this.name = other.name;
        this.surname = other.surname;
        this.age = other.age;
        this.identityNumber = other.identityNumber;
        this.type = other.type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(long identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
                "Surname: " + this.surname + "\n" +
                "Age: " + this.age + "\n" +
                "Identity Number: " + this.identityNumber + "\n" +
                "Type: " + this.type + "\n";
    }
}
