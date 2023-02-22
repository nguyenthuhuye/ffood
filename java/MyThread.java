//15.1 Create a multithreaded program by creating a subclass of Thread and then creating, initializing,
// and staring two Thread objects from your class. The threads will execute concurrently
// and display Java is hot, aromatic, and invigorating to the console window.

public class MyThread extends Thread {
    public void run() {
        System.out.println("Một ngày mới nắng lên, Em dang tay chào đón");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}

