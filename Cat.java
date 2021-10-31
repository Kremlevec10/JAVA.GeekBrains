package org.example;

public class Cat extends Animal {

    static int counter = 0;

    Cat(String name) {

        super(name);
        counter++;
    }

    @Override
    void run(int distance) {
        if (distance < 200) {
            System.out.printf("%s пробежал %d м\n", getName(), distance);
        } else {
            System.out.printf("%s не может пробежать %d м, так как устанет\n", getName(), distance);
        }
    }

    @Override
    void swing(int distance) {
        System.out.printf("%s не умеет плавать\n", getName());
    }

}
