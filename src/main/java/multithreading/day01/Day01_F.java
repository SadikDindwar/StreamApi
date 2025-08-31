package multithreading.day01;

//Demonstrating interrupt() method
public class Day01_F {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()-> {
          for(int i=0;i<10; i++){
              if(i == 5){
                  try {
                      Thread.sleep(100000);
                  } catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
              }
              System.out.println(i+" ");
          }
        });
        t1.start();
        t1.interrupt(); // This will interrupt sleep(100000)

    }
}
