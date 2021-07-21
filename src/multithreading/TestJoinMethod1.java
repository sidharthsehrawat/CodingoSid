package multithreading;

public class TestJoinMethod1 extends Thread{

    public void run(){
        for(int i=1;i<=3;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        TestJoinMethod1 th1=new TestJoinMethod1();
        TestJoinMethod1 th2=new TestJoinMethod1();
        TestJoinMethod1 th3=new TestJoinMethod1();
        th1.start();
        try {th1.join();
        } catch (InterruptedException e) {e.printStackTrace(); }
        th2.start();
        try {
            th2.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th3.start();
    }
}
