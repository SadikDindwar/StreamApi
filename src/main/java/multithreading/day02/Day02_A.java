package multithreading.day02;

//Demonstration of race condition
public class Day02_A {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = ()->{
          for(int i=0; i<1000; i++){
              counter.increment();
          }
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Count value is : "+ counter.count);

    }

}
class Counter{
    int count=0;
     void increment(){
        count++;
    }
}

/* here the correct count value should be exact 2000 but due to race condition the count value sometimes could be
less than 2000.because two threads sometimes do not get the exact count value while incrementing it so the final
count value is inefficient.
 */

