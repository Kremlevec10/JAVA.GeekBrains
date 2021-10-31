package org.example;

 abstract public class Animal {

    String name;

    static int counter = 0;

    Animal(String name) {
        this.name = name;
        counter++;
    }
    abstract void run(int distance);

    abstract void swing(int distance);






    public String getName() {
        return name;
    }
}
