package ArrayExamples;

public class PrintPairSortedRotatedArrayByUsingPivotExample {

    static void printPAir(int[] arr, int target) {
        int pivot = findPivot(arr); // find pivot====
        int start = (pivot+1)%arr.length, end = pivot ;
        while (start != end) {
            if (arr[start] + arr[end] == target) {
                System.out.println("element pair : " + "{" + arr[start]+"," + arr[end] + "}");
                end=(end-1)%arr.length;
            } else if (arr[start] + arr[end] < target) {
                start = (start + 1) % arr.length;
            } else {
                end = (end - 1) % arr.length;
            }
        }
    }

    static int findPivot(int[] arr) {
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                min = i;
            } else {
                break;
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        int target=7;
        PrintPairSortedRotatedArrayByUsingPivotExample.printPAir(arr,target);
    }
}
