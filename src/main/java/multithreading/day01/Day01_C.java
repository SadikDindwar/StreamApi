package multithreading.day01;

//Creating Thread by Lambda

public class Day01_C {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("The custom Thread has completed its Execution.");
        } ;
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("The main thread completed its execution.");

    }
}
