package ArrayExamples;

public class QuickRotateLeftArray {
    static void quickRotateArray(int[] arr,int k){
        int index;
        for (int i=k;i<arr.length+k;i++){
            index=i%arr.length;
            System.out.println(" " + arr[index]);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=2;
        QuickRotateLeftArray.quickRotateArray(arr,k);
    }
}
