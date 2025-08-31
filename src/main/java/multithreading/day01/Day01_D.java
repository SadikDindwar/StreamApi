package multithreading.day01;

//Demonstrating join() method.



public class Day01_D {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            for(int i=0; i<=5; i++){
                System.out.print(i+" ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(()-> {
            System.out.println("Thread 2 Executed.");
        });
        t1.start();
        t1.join();  // main thread will wait until t1 thread completes its execution.
        t2.start();

    }
}
