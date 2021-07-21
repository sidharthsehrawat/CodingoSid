package multithreading;

public class Line {

    public void getLine() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(" " + i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Train extends Thread {
    Line line;

    Train(Line line) {
        this.line = line;
    }

    @Override
    public void run() {
        line.getLine();
    }
}

class Main {
    public static void main(String[] args) {
        Line line = new Line();
        Train th1 = new Train(line);
        Train th2 = new Train(line);
        th1.start();
        th2.start();
    }
}
