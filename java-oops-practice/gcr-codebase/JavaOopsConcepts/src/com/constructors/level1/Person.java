package com.constructors.level1;

public class Person
{
    private String name;
    private int age;

    // Parameterized constructor
    Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person personCopy) 
    {
        this.name = personCopy.name;
        this.age = personCopy.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        // Original object
        Person p1 = new Person("Suhani", 22);
        p1.display();

        // Cloned object using copy constructor
        Person p2 = new Person(p1);
        p2.display();
    }
}
