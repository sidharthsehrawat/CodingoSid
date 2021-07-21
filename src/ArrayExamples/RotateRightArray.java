package ArrayExamples;

public class RotateRightArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        int temp;
        while (d > 0) {
            for (int i = arr.length - 1; i > 0; i--) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
                d--;
            }


        }
    }
