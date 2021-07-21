package ArrayExamples;

public class BinarySearchExample {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int search = 12, first = 0, mid, last = arr.length - 1;

        while (first < last) {
            mid = (first + last) / 2;
            if (arr[mid] == search) {
                System.out.println("element found in array at index: " + mid);
                return;
            } else if (arr[mid] < search) {
                first = mid + 1;
            } else if (arr[mid] > search) {
                last = mid - 1;
            }
        }
        System.out.println("element not found");
    }
}
