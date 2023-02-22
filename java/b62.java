//6.2 Write a program to give example for multiple inheritance in Java.

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class b62 implements A, B {
    public void methodA() {
        System.out.println("methodA called");
    }

    public void methodB() {
        System.out.println("methodB called");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
}
