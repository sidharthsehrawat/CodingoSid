package multithreading;

public class ThreadJoin extends Thread {
   String name;
    public ThreadJoin(String name) {
   this.name=name;
    }

    @Override
    public void run(){
        //for (int i=0;i<3;i++){
            try { Thread.sleep(500);} catch (InterruptedException e) { e.printStackTrace();}
            System.out.println(" "+ "Started" +Thread.currentThread().getName() +name);
            System.out.println(" "+ "Ended" +Thread.currentThread().getName() +name);
       // }
    }


    public static void main(String[] args) {
        ThreadJoin th1=new ThreadJoin("sid");
        ThreadJoin th2=new ThreadJoin("Ash");
        ThreadJoin th3=new ThreadJoin("lal");
      /*  th1.start();
        System.out.println(Thread.currentThread().getName()+ " ");
        try {th1.join(); } catch (InterruptedException e) {e.printStackTrace();}
        th2.start();
        try {th2.join(); } catch (InterruptedException e) {e.printStackTrace();}
        th3.start();*/

        th1.start();
        th2.start();
        th3.start();

    }
}
