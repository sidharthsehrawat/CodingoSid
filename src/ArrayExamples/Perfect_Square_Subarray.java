package ArrayExamples;

import java.util.HashMap;

public class Perfect_Square_Subarray {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr = {2, 1, 6, 4, 4, 5};
        map.put(0,1);
        for(int i=0;i<arr.length;i++){

        }

    }
}





//================================================================================================================
    /*
    static boolean checkPerf(int num) {
        for (int j = 0; j * j <= num; j++) {
            if (j * j == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {  // O(n)^2
        int[] arr = {2, 1, 6, 4, 4, 5};
        int sum = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = i; k < arr.length; k++) {
                sum = sum + arr[k];
                if (checkPerf(sum)) {
                    count++;
                }
            }
            sum = 0;
        }
        System.out.println(count);
    }*/

