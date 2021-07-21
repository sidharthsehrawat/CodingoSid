package ArrayExamples;

import java.util.HashMap;
import java.util.HashSet;

public class HashingPairArray {
    static void hashing(int[] arr,int target){
        int i;
        HashMap<Integer,Integer> map=new HashMap<>();
        for( i=0;i<arr.length;i++) {
            if (map.containsKey(target - arr[i])) {
                System.out.println("pair : " +  "{" +map.get(target-arr[i])+","+arr[i]+ "}");
            }
            map.put(arr[i],arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr={11,15,6,8,10,20};
        int target=16;
        HashingPairArray.hashing(arr,target);
    }
}
