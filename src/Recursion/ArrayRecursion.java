package Recursion;

public class ArrayRecursion {
    public static void recursion(int num) {
        ///print 5 number using recursion....
        if (num == 0) {
            return ;
        } else {
            System.out.println(num);
             recursion(num-1);
            System.out.println(num);
        }
    }

    private static int factorial(int num){
        if(num<1){
            return 1;
        }else {
            System.out.println(num);
             int num1=factorial(num-1);
            num=num*num1;
            System.out.println(" " + num);
        }
        return num;
    }


    public static void main(String[] args) {
        ArrayRecursion.recursion(5);
        ArrayRecursion.factorial(5);

    }



}
