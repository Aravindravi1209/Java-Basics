package org.example;

public class Sample {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Person person = new Person("Arav",25);
    }

    public static class Person
    {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
