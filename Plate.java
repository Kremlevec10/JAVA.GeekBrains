package org.example;

public class Plate {
    private int amountFood;

    public Plate(int amountFood) {
        this.amountFood = amountFood;
    }

    public int getAmountFood() {
        return amountFood;
    }

    public void setAmountFood(int amountFood) {
        this.amountFood = amountFood;
    }

    public int food( int food ) {
        amountFood = amountFood - food;
        return amountFood;
    }

    public void fillingFood ( int fillingFood) {
        amountFood += fillingFood;
        System.out.println("Тарелка наполнена, теперь в тарелке " + amountFood + " еды");
    }
}
