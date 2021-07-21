package ArrayExamples;

import java.util.*;

public class Test2 {

    // Complete the miniMaxSum function below.
    // old Answer............
    static void miniMaxSum(int[] arr) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE, maxSum=0,minSum=0,minCount = 0, maxCount = 0;
        Queue<Character> que=new LinkedList<>();
        Stack<Character> stack=new Stack<>();

        for(int number:arr){
            if(number>=max){
                max=number;
            }if(number<=min){
                min=number;
            }
            if (number == min) {
                minCount++;
            }
            if (number == max) {
                maxCount++;
            }
        }

        for(int j:arr){
            if ((minCount == maxCount) && (maxCount == arr.length)) { // 5,5,4,4,5
                maxSum = minSum = (arr.length-1) * j;
                break;
            } else {
                if (j != min) {
                    maxSum += j; //5
                }
                if (j != max) {
                    minSum += j; //5
                }
            }
        }
        System.out.print(minSum + " " + maxSum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
