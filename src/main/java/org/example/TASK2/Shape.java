package org.example.TASK2;

public interface Shape {

    double calculateArea();
    double calculatePerimeter();
    Color getFillColor();
    Color getBorderColor();

    default void displayInfo() {
        System.out.println("=== Информация о фигуре ===");
        System.out.println("Тип: " + getShapeType());
        System.out.println("Площадь: " + String.format("%.2f", calculateArea()) + " кв. ед.");
        System.out.println("Периметр: " + String.format("%.2f", calculatePerimeter()) + " ед.");
        System.out.println("Цвет заливки: " + getFillColor().getRussianName());
        System.out.println("Цвет границы: " + getBorderColor().getRussianName());
        System.out.println("=============================");
    }

    default String getShapeType() {
        return this.getClass().getSimpleName();
    }
}
