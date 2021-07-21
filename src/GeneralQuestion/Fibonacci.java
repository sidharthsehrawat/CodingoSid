package GeneralQuestion;

public class Fibonacci {

    static void Fibonacci(int num) {
        int next = 0,first = 0,second;
        for (int i = 0; i < num; i++) {
            if(i==0 || i==1){
                System.out.print(" "+i);
                next=i;
            }else {
                second = first;
                first = next;

                next = first + second;
                System.out.print(" " + next);
            }
        }
    }

    public static void main(String[] args) {
        int num = 8;
        Fibonacci.Fibonacci(num);
    }
}
