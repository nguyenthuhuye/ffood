//13.1 Write a program to illustrate creation of threads using runnable class.(start method start each of the newly created thread.
// Inside the run method there is sleep() for suspend the thread for 500 milliseconds).

public class ThreadDemo implements Runnable {

    public static void main(String[] args) {
        ThreadDemo demo = new ThreadDemo();
        Thread t1 = new Thread(demo);
        Thread t2 = new Thread(demo);
        t1.start();
        t2.start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }
}

