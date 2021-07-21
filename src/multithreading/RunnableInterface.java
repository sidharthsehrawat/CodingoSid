package multithreading;

public class RunnableInterface implements Runnable {
    @Override
    public void run() {
        System.out.println("thread " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        //System.out.println("name of main Thread" +Thread.currentThread().getName());
        RunnableInterface obj = new RunnableInterface();
       // RunnableInterface obj2=new RunnableInterface();
        Thread thread1 = new Thread(obj);
        thread1.start();
        Thread thread2=new Thread();
        thread2.start();
    }
}
