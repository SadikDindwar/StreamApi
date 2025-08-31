package multithreading.day01;

public class Day01_G {
    public static void main(String[] args) throws Exception {
        exe();
        exe2();

    }

    // demonstration of isAlive() , getState() , setName() and getName() methods
    public static void exe() throws InterruptedException{
        Thread t1 = new Thread(()-> {
           for(int i=0; i<10; i++){
               System.out.print(i +" ");
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });
        t1.start();
        t1.setName("Thread X ");
        System.out.println(t1.getName());
        Thread.sleep(2000);
        System.out.println(t1.isAlive());
        System.out.println(t1.getState());
        Thread.sleep(10000);
        System.out.println(t1.isAlive());
        System.out.println(t1.getState());

    }
    public static void exe2(){
        Thread t1 = new Thread(()-> {
            for(int i=0; i<100; i++){
                System.out.println(i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(()-> {
            for(int i=0; i<100; i++){
                System.out.println("A");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
