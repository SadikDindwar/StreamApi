package multithreading.day01;


//Demonstration of yield() method


public class Day01_E {
    public static void main(String[] args) {
        Thread t1 = new Thread(()-> {
           for(int i=0; i<10; i++){
               if(i == 5){
                   Thread.yield();
               }
               System.out.print(i+" ");
           }
        });
        Thread t2 = new Thread(()-> {
            for(int i=0; i<5; i++){
                System.out.print("a");
            }
        });
        t1.start();
        t2.start();

    }
}
