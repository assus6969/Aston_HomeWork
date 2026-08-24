package org.example;

public class Bowl {
    private int foodAmount;

    public Bowl() {
        this.foodAmount = 0;
    }

    public Bowl(int foodAmount) {
        if (foodAmount < 0) {
            this.foodAmount = 0;
        } else {
            this.foodAmount = foodAmount;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("В миску добавлено " + amount + " еды. Всего: " + foodAmount);
        } else {
            System.out.println("Нельзя добавить отрицательное количество еды");
        }
    }

    public void decreaseFood(int amount) {
        if (amount > 0 && amount <= foodAmount) {
            foodAmount -= amount;
        } else if (amount > foodAmount) {
            System.out.println("Ошибка: недостаточно еды в миске!");
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void displayInfo() {
        System.out.println("В миске " + foodAmount + " еды.");
    }
}