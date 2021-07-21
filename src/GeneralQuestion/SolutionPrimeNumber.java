package GeneralQuestion;

import java.util.Scanner;

public class SolutionPrimeNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);
        int testCases=sc.nextInt();
        int[] arr=new int[testCases];
        for(int i=0;i<testCases;i++){
            arr[i] =sc.nextInt();

        }

        for(int j=0;j<arr.length;j++){
            isPrime(arr[j]);
        }


    }

    public static void isPrime(int num){
        if(num<=1){
            System.out.println("Not prime");
        }
        else if(num==2){
            System.out.println("Prime");
        }else{
            int count=0;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    count=1;
                    break;
                }
            }
            if(count==0){
                System.out.println("Prime");
            }
        }
    }
}
