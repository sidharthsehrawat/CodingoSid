package ArrayExamples;

import java.util.Arrays;

public class SortingPairfromStartAndEnd {
    static void getPair(int[] arr,int target){
        Arrays.sort(arr);
        int start=0,end=arr.length-1;
       while (start<end){
          if( arr[start]+arr[end]==target)
          {
              System.out.println("Print PAir : " +"{" + arr[start]+","+arr[end]+"}");
              start++;
              end--;
           }else if(arr[start]+arr[end]<target){
              start++;
          }else {
              end--;
          }
       }
    }
    public static void main(String[] args) {
        int arr[]={3,4,1,2,5};
        int target=7;
        SortingPairfromStartAndEnd.getPair(arr,target);
    }
}
