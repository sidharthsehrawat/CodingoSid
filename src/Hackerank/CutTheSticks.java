package Hackerank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CutTheSticks {
    public static void main(String[] args) {
    int[ ] arr={5 ,4 ,4 ,2 ,2 ,8};
        int[] res=cutTheSticks(arr);
        for(int i:res){
            System.out.println(i);
        }
    }

    static int[] cutTheSticks(int[] arr) {
        int min = Integer.MAX_VALUE, count = 0, k = 0, sum =Integer.MAX_VALUE,sum2=0;
        List<Integer> list = new ArrayList<>();
        while (sum > 0) {
            sum=0;
            min = Integer.MAX_VALUE;
            sum2=0;
            count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    if(arr[i]!=0) {
                        min = arr[i];
                    }
                }
                sum = sum + arr[i];

            }

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > 0) {
                    arr[j] = arr[j] - min;
                    sum2=sum2+arr[j];
                    count++;
                }
            }
            if(count>0)
            list.add(count);
            sum=sum-sum2;
        }
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        return a;


    }


}
