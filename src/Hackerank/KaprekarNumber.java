package Hackerank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KaprekarNumber {
    public static void main(String[] args) {
        kaprekarNumbers(82656,99999);


    }



    static void kaprekarNumbers(int p, int q) {
        int flag=0;

        for(int n=p;n<=q;n++) {

            long number = (long) Math.pow(n, 2);
            String s=String.valueOf(number);
            //BigInteger b=new BigInteger(s);
            int count= findDigit(n);
            int numberCount=findDigit(number);
            if(numberCount==2*count-1){
            count=count-1;
            }
            String str = String.valueOf(number);
            if(number>=10 && number!=1) {
                String st1 = str.substring(0, count);
                String st2 = str.substring(count);
                int n1 = Integer.valueOf(st1);
                int n2 = Integer.valueOf(st2);
                if ( n1 + n2 == n) {
                    flag=1;
                    System.out.print(n + " ");
                }
            }if (number==1) {
                System.out.print(1 + " ");
            }
        }
        if(flag==0){
            System.out.print("INVALID RANGE");
        }
    }

    private static int findDigit(double n) {
        int count = 1;

        if (n >= 10) {
            while (n >= 10) {
                ++count;
                n = n / 10;
            }
        }
        return count;
    }


}
