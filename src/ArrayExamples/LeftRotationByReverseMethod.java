package ArrayExamples;

public class LeftRotationByReverseMethod {
    static void LeftRotate(int[] arr,int d){
     if(d==0)
         return;

     rotate(arr,0,d-1);
     rotate(arr,d,arr.length-1);
     rotate(arr,0,arr.length-1);
    }

    static void rotate(int[] arr,int start,int end){
        int temp;
        while (start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
   static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int d=2;
        LeftRotationByReverseMethod.LeftRotate(arr,d);
        LeftRotationByReverseMethod.printArray(arr);
    }
}
