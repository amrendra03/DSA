package Threading;


class ThreadClass extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("From " + i);
        }
    }
}


public class MyThreading {
    public static void main(String[] args) {
        ThreadClass ob = new ThreadClass();
        ThreadClass ob2 = new ThreadClass();

        ob.start();
        ob2.start();
    }
}
