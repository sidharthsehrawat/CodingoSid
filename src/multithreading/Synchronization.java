package multithreading;

public class Synchronization extends Thread {
    private int i = 0;

      public void increment() {
         for (int i = 0; i < 5; i++) {
             System.out.println(" " + i);
         }
     }

    @Override
    public void run() {
        //for (int i = 0; i < 4; i++) {

            increment();

        //}
    }

    private int getInfo() {
        System.out.println(" " + i);
        return i;
    }


    public static void main(String[] args) {
        Synchronization thread = new Synchronization();
        Synchronization thread2 = new Synchronization();
        thread.start();
        thread2.start();

    }
}


