package ArrayExamples;

public class FindMaximumHammingDistancebyRotationArray {
   static int findHammingRotation(int[] arr) {
       int max = Integer.MIN_VALUE;
       int[] newArray=arr.clone();
       for (int i=0;i<arr.length;i++) {
           rotateArray(arr);
           int maxHammingDist=checkHammingRule(arr,newArray);
           if(maxHammingDist>max){
               max=maxHammingDist;
           }
       }
   return max;
   }
   static int checkHammingRule(int[] arr,int[] newArray){
       int count=0;
       for (int i=0;i<arr.length;i++){
           if(arr[i]!=newArray[i]){
               count++;
           }
       }
       return count;
   }

   static void rotateArray(int[] arr){
       int temp;
       int[] newArray=new int[arr.length];
       for(int i=0;i<arr.length-1;i++){
           temp=arr[i];
           arr[i]=arr[i+1];
           arr[i+1]=temp;
           newArray[i]=arr[i];
       }
       newArray[arr.length-1]=arr[arr.length-1];

   }
    public static void main(String[] args) {
       int[] arr={1,4,1};
        System.out.println(FindMaximumHammingDistancebyRotationArray.findHammingRotation(arr));
    }
}
