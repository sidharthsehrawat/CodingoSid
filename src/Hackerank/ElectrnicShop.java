package Hackerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElectrnicShop {
    public static void main(String[] args) {
        int[] a={3 ,1};
        int [] b={5 ,2 ,8};
        getMoneySpent(a , b ,10);

    }
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int min=Integer.MIN_VALUE;
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<keyboards.length;i++){
            list.add(keyboards[i]);
        }
        for(int i=0;i<drives.length;i++){
            list.add(drives[i]);
        }
        int start=0,end=list.size()-1,sum=0;
        while(start<end){
            if(list.get(start)+list.get(end)<=b){
                sum=list.get(start)+list.get(end);
                start++;
                if(sum>min){
                    min=sum;
                }

            }else if(list.get(start)+list.get(end)>=b){
                end--;
            }
        }

        if(min==Integer.MIN_VALUE){
            return -1;
        }
        return min;
    }
}

