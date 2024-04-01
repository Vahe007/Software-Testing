package org.example;

public class Rectangle {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Width and height must be non-negative.");
        }
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }

    public double getDiagonalLength() {
        return Math.sqrt(width * width + height * height);
    }
}