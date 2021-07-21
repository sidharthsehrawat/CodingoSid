package ArrayExamples;

public class SplitArrayAndRotateLeft {
    static void splitArray(int[] arr,int k){
         reverseArray(arr,0,k-1);
        reverseArray(arr,k,arr.length-1);
        reverseArray(arr,0,arr.length-1);
    }

    static void reverseArray(int[] arr,int start,int end){
        int temp;
        while (start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int k=2;
        SplitArrayAndRotateLeft.splitArray(arr,k);
        System.out.println(arr);
    }
}
