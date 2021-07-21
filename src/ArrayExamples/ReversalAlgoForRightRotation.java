package ArrayExamples;

public class ReversalAlgoForRightRotation {
    static void reverseAlgoforLeftRotation(int[] arr,int d){
        reverseforLR(arr,0,d-1);
        reverseforLR(arr,d,arr.length-1);
        reverseforLR(arr,0,arr.length-1);
    }

    static void reverseAlgoforRightRotation(int[] arr,int d){
        reverseforRR(arr,0,arr.length-d-1);
        reverseforRR(arr,arr.length-d,arr.length-1);
        reverseforRR(arr,0,arr.length-1);
    }
    static void reverseforRR(int[] arr,int d,int n){
        int temp;
        while (d<n){
            temp=arr[d];
            arr[d]=arr[n];
            arr[n]=temp;
            d++;
            n--;
        }

    }

    static void reverseforLR(int[] arr,int d ,int n){
        int temp;
        while (d<n){
            temp=arr[d];
            arr[d]=arr[n];
            arr[n]=temp;
            d++;
            n--;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int d=2;
        ReversalAlgoForRightRotation.reverseAlgoforLeftRotation(arr,d);
        //ReversalAlgoForRightRotation.reverseAlgoforRightRotation(arr,d);
    }
}
