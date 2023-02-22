//15.2 Create a multithreaded program as in the previous exercise by creating the MyThread subclass of Thread.
// But create threads as objects of the class MyClass, which is not a subclass of Thread.
// My Class will implement the runnable interface and objects of
// MyClass will be executed as threads by passing them as arguments to the Thread constructor.


public class MyClass implements Runnable {
    public void run() {
        System.out.println("Một ngày mới nắng lên, Em dang tay chào đón");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Thread t1 = new Thread(myClass);
        Thread t2 = new Thread(myClass);

        t1.start();
        t2.start();
    }
}
