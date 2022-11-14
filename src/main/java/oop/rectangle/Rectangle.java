package oop.rectangle;

public class Rectangle {

    private final int height;
    private final int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int calculatePerimeter() {
        return 2 * (this.getWidth() + this.getHeight());
    }

    public int calculateArea() {
        return this.getHeight() * this.getWidth();
    }
}
