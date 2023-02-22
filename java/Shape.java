//5.1 Write a program to create a class named shape.
// In this class we have three sub classes circle, triangle and square each class has two member function named draw () and erase ().
// Create these using polymorphism concepts.

public class Shape {
        public void draw() {
            System.out.println("Drawing a shape");
        }
        public void erase() {
            System.out.println("Erasing a shape");
        }
    }

    class Circle extends Shape {
        public void draw() {
            System.out.println("Drawing a circle");
        }
        public void erase() {
            System.out.println("Erasing a circle");
        }
    }

    class Triangle extends Shape {
        public void draw() {
            System.out.println("Drawing a triangle");
        }
        public void erase() {
            System.out.println("Erasing a triangle");
        }
    }

    class Square extends Shape {
        public void draw() {
            System.out.println("Drawing a square");
        }
        public void erase() {
            System.out.println("Erasing a square");
        }



        public static void main(String[] args) {
            Shape[] shapes = new Shape[3];
            shapes[0] = new Circle();
            shapes[1] = new Triangle();
            shapes[2] = new Square();

            for (Shape shape : shapes) {
                shape.draw();
                shape.erase();
            }
        }
    }


