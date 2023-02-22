//5.2 Write a program to give a simple example for abstract class.

public class b52 {
    abstract class Shape {
        int x, y;

        public Shape(int x, int y) {
            this.x = x;
            this.y = y;
        }

        abstract double area();
    }

    static class Rectangle extends Shape {
        int width, height;

        public Rectangle(int x, int y, int width, int height) {
            super(x, y);
            this.width = width;
            this.height = height;
        }

        double area() {
            return width * height;
        }
    }

    static class Circle extends Shape {
        double radius;

        public Circle(int x, int y, double radius) {
            super(x, y);
            this.radius = radius;
        }

        double area() {
            return Math.PI * radius * radius;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Shape rect = new Rectangle(0, 0, 10, 20);
            Shape circle = new Circle(0, 0, 5);
            System.out.println("Rectangle Area: " + rect.area());
            System.out.println("Circle Area: " + circle.area());
        }
    }
}