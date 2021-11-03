package org.example;

public class Cat {
    private String name;
    private int appetite;
    private int satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = 0;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.getAmountFood() < appetite) {
            System.out.println("Тарелка пуста, необходимо выбрать другую тарелку");
        } else {
            plate.food(appetite);
            satiety += appetite;
            System.out.println("В тарелке осталось " + plate.getAmountFood() + " еды");


        }

    }

    public void satiety() {
        boolean bool = satiety >= appetite;
        System.out.println(bool? name + " сыт":name + " голоден");
    }
}
