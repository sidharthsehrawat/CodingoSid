package ArrayExamples;

public class SearchElementinSortedRotatedArray {
    public static void main(String[] args) {
        //int[] arr1={1,2,3,4,5,6};
        // rotated array
        int min = Integer.MIN_VALUE, pivot = 0;
        int[] arr = {-6, -5, -4, -3, -7, -8};
        int start = 0, end = arr.length - 1, mid, search = -4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i];
            } else {
                pivot = i;
                break;
            }
        }
        if (arr[pivot - 1] == search) {
            System.out.println("element found at index " + --pivot);
            return;
        } else if (arr[start] < search) {
            end = pivot - 1;
            while (start < end) {
                mid = (start + end) / 2;
                if (arr[mid] == search) {
                    System.out.println("element found at index: " + mid);
                    return;
                } else if (arr[mid] < search) {
                    start = mid + 1;
                } else if (arr[mid] > search) {
                    end = mid - 1;
                }
            }
        } else {// checking 2nd subArray------
            start = pivot;
            end = arr.length - 1;
            while (start < end) {
                mid = (start + end) / 2;
                if (arr[mid] == search) {
                    System.out.println("element found at indez: " + mid);
                    return;
                } else if (arr[mid] < search) {
                    start = mid + 1;
                } else if (arr[mid] > search) {
                    end = mid - 1;
                }
            }
        }
    }
}
