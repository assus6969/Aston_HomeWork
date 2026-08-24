package org.example.TASK2;

public enum Color {
    RED("Красный"),
    BLUE("Синий"),
    GREEN("Зеленый"),
    YELLOW("Желтый"),
    ORANGE("Оранжевый"),
    PURPLE("Фиолетовый"),
    BLACK("Черный"),
    WHITE("Белый"),
    GRAY("Серый"),
    PINK("Розовый");

    private String russianName;

    Color(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }
}
