package multithreading.day01;

// Creating Thread by implementing Runnable Interface.


class C implements Runnable{

    @Override
    public void run() {
        System.out.println("Custom Thread has completed its execution.");
    }
}
public class Day01_B {
    public static void main(String[] args) {
        System.out.println("The Main Thread has Executed.");
        C c = new C();
        Thread thread = new Thread(c);
        thread.start();

    }
}
