package multithreading.day01;

//Creating Thread by extending Thread.

class B extends Thread{
    @Override
    public void run(){
        System.out.println("Custom Thread has completed its execution");
    }
}
public class Day01_A {
    public static void main(String[] args) {
        System.out.println("Main Thread Executed.");
        B b = new B();
        b.start();
    }
}
