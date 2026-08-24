package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ЗАДАНИЕ 1: Животные ===\n");

        Dog dogBobik = new Dog("Бобик");
        Dog dogRex = new Dog("Рекс");
        Cat catMurzik = new Cat("Мурзик");
        Cat catBarsik = new Cat("Барсик");
        Cat catTom = new Cat("Том");

        System.out.println("--- Бег ---");
        dogBobik.run(150);     // Бобик пробежал 150 м.
        dogBobik.run(600);     // Бобик не может пробежать 600 м.
        catMurzik.run(150);    // Мурзик пробежал 150 м.
        catMurzik.run(250);    // Мурзик не может пробежать 250 м.

        System.out.println("\n--- Плавание ---");

        dogBobik.swim(5);      // Бобик проплыл 5 м.
        dogBobik.swim(15);     // Бобик не может проплыть 15 м.
        catMurzik.swim(5);     // Мурзик не умеет плавать

        System.out.println("\n--- Подсчет животных ---");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());

        System.out.println("\n=== ЗАДАНИЕ 2: Коты и миска ===\n");

        Bowl bowl = new Bowl(30);
        bowl.displayInfo();

        System.out.println("\n--- Добавление еды ---");
        bowl.addFood(20);      // Добавляем еще 20 еды
        bowl.displayInfo();

        System.out.println("\n--- Коты кушают ---");

        Cat[] cats = {catMurzik, catBarsik, catTom};

        catMurzik.eatFromBowl(bowl, 15);  // Мурзик съедает 15
        catBarsik.eatFromBowl(bowl, 20);  // Барсик пытается съесть 20 (не хватает)
        catTom.eatFromBowl(bowl, 10);     // Том съедает 10

        System.out.println("\n--- Состояние миски после кормления ---");
        bowl.displayInfo();

        System.out.println("\n--- Сытость котов ---");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + (cat.isFull() ? "Да" : "Нет"));
        }

        System.out.println("\n--- Добавляем еду и пробуем снова ---");
        bowl.addFood(15);
        bowl.displayInfo();

        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eatFromBowl(bowl, 15);
            }
        }

        System.out.println("\n--- Итоговое состояние ---");
        bowl.displayInfo();
        System.out.println("\n--- Итоговая сытость котов ---");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + (cat.isFull() ? "Да" : "Нет"));
        }
    }
}