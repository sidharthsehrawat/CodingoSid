package ArrayExamples;

import java.util.HashSet;

public class RearrangeAnArrayWithSameValueAsIndex {
    static int[] arrangeMethod(int[] arr){
        HashSet<Integer> set =new HashSet<>();
        for (int val:arr){
            set.add(val);
        }
        for(int i=0;i<arr.length;i++) {
            if (!set.contains(i)) {
                arr[i] = -1;
            }else {
                arr[i]=i;
            }
        }
        System.out.println(arr);
    return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,-1,1,6,8,9,-1,-1,1};
       int[] arra= RearrangeAnArrayWithSameValueAsIndex.arrangeMethod(arr);
       for (int p:arra){
           System.out.print(" "+p);
       }
    }
}
