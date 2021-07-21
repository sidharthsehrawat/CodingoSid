package ArrayExamples;

public class MinimumElementFromSortedArray {
    static void getMinimumElem(int [] arr){
       int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }else {
                System.out.println("min element: = " +arr[i]);
                break;
            }
            if(i==arr.length-1){
                System.out.println("min element: = "+ arr[0]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        MinimumElementFromSortedArray.getMinimumElem(arr);

    }
}
