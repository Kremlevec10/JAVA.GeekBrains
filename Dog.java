package org.example;

public class Dog extends Animal {

    static int counter = 0;

    Dog(String name) {
        super(name);
        counter++;
    }

    @Override
    void run(int distance) {
        if (distance < 500) {
            System.out.printf("%s пробежал %d м\n", getName(), distance);
        } else {
            System.out.printf("%s не может пробежать %d м, так как устанет\n", getName(), distance);
        }
    }

    @Override
    void swing(int distance) {
        if (distance < 10) {
            System.out.printf("%s проплыл %d м\n", getName(), distance);
        } else {
            System.out.printf("%s не может проплыть %d м, так как устанет\n", getName(), distance);
        }
    }
}
