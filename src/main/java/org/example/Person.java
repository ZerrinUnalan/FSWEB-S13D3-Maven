package org.example;

public class Person {
    public String firsName;
    public String lastName;
    public int age;

    public Person(String firsName, String lastName){
        this.firsName = firsName;
        this.lastName = lastName;
    }
    public  Person(String firsName, String lastName, int age){
        this(firsName, lastName);
        this.age = age;
    }
    public String getFirstName(){
        return firsName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return age > 12 && age < 20;
    }
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 25);
        Person person2 = new Person("Jane", "Smith", 15);
        Person person3 = new Person("Alice", "Johnson", 10);

        System.out.println(person1.getFirstName() + " " + person1.getLastName() + " is " + person1.getAge() + " years old. Teen: " + person1.isTeen());
        System.out.println(person2.getFirstName() + " " + person2.getLastName() + " is " + person2.getAge() + " years old. Teen: " + person2.isTeen());
        System.out.println(person3.getFirstName() + " " + person3.getLastName() + " is " + person3.getAge() + " years old. Teen: " + person3.isTeen());
    }
}