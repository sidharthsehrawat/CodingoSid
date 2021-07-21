package ArrayExamples;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test1 {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> finallist = new ArrayList<Integer>();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < b.get(i)) {
                sum2++;
            } else {
                sum1++;
            }

        }
        finallist.add(sum1);
        finallist.add(sum2);
        return finallist;
    }

    public static int method1(List<List<Integer>> arr) {
        StringBuilder sb =new StringBuilder();
        sb.toString();

        int sum1 = 0, sum2 = 0, result = 0;
        for (int i = 0; i < arr.size(); i++) {
            // 6 4 8
            // 3 4 1
            //  4 5 7

            /*
            -1 1 -7 -8
           -10 -8 -5 -2
            0 9 7 -1
            4 4 -2 1
            *
            * */

            List<Integer> list = arr.get(i);
            for (int j = 0; j < list.size(); j++) {
                if (i == j) {
                    sum1 = sum1 + list.get(i);
                }
                if (i + j == 2) {
                    sum2 = sum2 + list.get(j);
                }
            }
        }
        result = sum1 - sum2;

        if (result < 0) {
            result = result * -1;
        }
        return result;
    }

    //  2, 3, 1, 5, 4
    // 5,5,5,5,4
    private static void method2(int[] arr) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, maxSum = 0, minSum = 0, sum = 0;
        for (int number : arr) {
            if (number >= max) {
                max = number;
            }
            if (number <= min) {
                min = number;
            }
            sum = sum + number;
        }
        maxSum=sum-min;
        minSum=sum-max;
        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) throws IOException {

        int[] ar = {5,-5,4,-4,4};
        method2(ar);
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();


        final int length = ar.length;
        list1.add(11);
        list1.add(2);
        list1.add(4);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list3.add(10);
        list3.add(8);
        list3.add(-12);

        list3.get(0);

        finalList.add(list1);
        finalList.add(list2);
        finalList.add(list3);

        System.out.println(method1(finalList));
        compareTriplets(list1, list2);

    }


}
