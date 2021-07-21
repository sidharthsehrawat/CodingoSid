package multithreading;

public class Test {
    private static class RunnableJoinSequence implements Runnable {
        private Thread predecessor;

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " Started");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (predecessor != null) {
                try {
                    predecessor.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " Finished");
        }

        public void setPredecessor(Thread t) {
            this.predecessor = t;
        }

    }


    public static void main(String[] args) {
        RunnableJoinSequence task1 = new RunnableJoinSequence();
        RunnableJoinSequence task2 = new RunnableJoinSequence();
        RunnableJoinSequence task3 = new RunnableJoinSequence();

        Thread t1 = new Thread(task1, " Thread 1");
        Thread t2 = new Thread(task2, " Thread 2");
        Thread t3 = new Thread(task3, " Thread 3");

        task1.setPredecessor(t2);
        task2.setPredecessor(t3);
        t1.start();
        t2.start();
        t3.start();


    }
}
