package ArrayExamples;

public class RotationPerformedInSortedArray {
    static int calcRotate(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = i;
            } else {
                break;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 5};

        System.out.println(RotationPerformedInSortedArray.calcRotate(arr));
    }
}
