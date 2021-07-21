package ArrayExamples;

public class QuicklyRotateArrayByKTimes {
    static void quickArray(int[] arr, int k) {
        int[] newArray = new int[2 * arr.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arr[i % (arr.length - 1)];
        }
        int start=k;
        int end=k+arr.length-1;
        while (start<end){
            System.out.print(" " + newArray[start]);
        start++;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 4;
        QuicklyRotateArrayByKTimes.quickArray(arr, k);

    }
}
