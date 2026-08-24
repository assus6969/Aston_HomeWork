package org.example.TASK2;

public class Rectangle implements Shape {
    private double width;
    private double height;
    private Color fillColor;
    private Color borderColor;

    public Rectangle(double width, double height, Color fillColor, Color borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    @Override
    public Color getBorderColor() {
        return borderColor;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}