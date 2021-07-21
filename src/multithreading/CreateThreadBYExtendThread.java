package multithreading;

public class CreateThreadBYExtendThread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
           /* try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            /*System.out.println("Threads " + Thread.currentThread().getName()
                    + " " + Thread.currentThread().getId()
                    + " " + Thread.currentThread().getPriority());*/
        }
    }
    public static void main(String[] args) {
       // for (int i = 0; i < 10; i++) {
            CreateThreadBYExtendThread myThread = new CreateThreadBYExtendThread();
            CreateThreadBYExtendThread myThread2=new CreateThreadBYExtendThread();
           // myThread.setName("Sidharth");
            myThread.start();
            myThread2.start();
            //myThread.setPriority(2);
       // myThread2.setName("Sidharth2");
       // myThread2.setPriority(1);
        }
    //}
}
