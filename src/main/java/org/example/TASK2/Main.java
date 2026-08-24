package org.example.TASK2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== РАСЧЕТ ПАРАМЕТРОВ ГЕОМЕТРИЧЕСКИХ ФИГУР ===\n");

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5.0, Color.RED, Color.BLACK);

        shapes[1] = new Rectangle(4.0, 6.0, Color.BLUE, Color.GRAY);

        shapes[2] = new Triangle(3.0, 4.0, 5.0, Color.GREEN, Color.BLACK);

        for (Shape shape : shapes) {
            shape.displayInfo();
            System.out.println();
        }

        System.out.println("=== ДОПОЛНИТЕЛЬНЫЕ ФИГУРЫ ===\n");

        Shape[] moreShapes = {
                new Circle(3.5, Color.YELLOW, Color.RED),
                new Rectangle(7.0, 3.0, Color.PURPLE, Color.GREEN),
                new Triangle(5.0, 5.0, 6.0, Color.ORANGE, Color.BLUE),
                new Circle(2.0, Color.PINK, Color.PURPLE),
                new Rectangle(8.0, 4.0, Color.WHITE, Color.BLACK)
        };

        for (Shape shape : moreShapes) {
            shape.displayInfo();
            System.out.println();
        }
    }
}