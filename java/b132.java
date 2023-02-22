//13.2 Write a program to create a class My Thread in this class a constructor, call the base class constructor,
// using super and starts the thread. The run method of the class starts after this.
// It can be observed that both main thread and created child thread are executed concurrently.

public class MyThread extends Thread {
    public MyThread() {
        super();
        start();
    }

    public void run() {
        System.out.println("Một ngày mới nắng lên, Em dang tay chào đón");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        System.out.println("Main thread is executing...");
    }
}

