package org.example;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull; // сытость кота

    public Cat(String name) {
        super(name, 200, 0); // кот: бег 200 м, плавание 0 (не умеет)
        this.isFull = false; // по умолчанию голоден
        catCount++;
    }

    public void eatFromBowl(Bowl bowl, int amount) {
        if (bowl.getFoodAmount() >= amount) {
            bowl.decreaseFood(amount);
            isFull = true;
            System.out.println(name + " поел " + amount + " еды. Теперь сыт!");
        } else {
            System.out.println(name + " не смог поесть. В миске недостаточно еды (нужно " + amount + ", доступно " + bowl.getFoodAmount() + ")");
        }
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }
}