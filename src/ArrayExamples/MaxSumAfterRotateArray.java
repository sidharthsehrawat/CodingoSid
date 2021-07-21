package ArrayExamples;

public class MaxSumAfterRotateArray {
    static int max = Integer.MIN_VALUE;

    static int maxSum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (findSum(rotateArray(arr)) > max) {
                max = findSum(rotateArray(arr));
            }
        }
        return max;
    }

    static int findSum(int[] arr) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + j * arr[j];
        }
        return sum;
    }

    static int[] rotateArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 20, 2, 10};

        System.out.println(MaxSumAfterRotateArray.maxSum(arr));
    }
}
