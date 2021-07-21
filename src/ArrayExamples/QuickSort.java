package ArrayExamples;

public class QuickSort {
    static void sort(int[] arr,int low,int high){
        if(low<high){
            int p=partition(arr,low,high);
            sort(arr,low,p-1);
            sort(arr,p+1,high);
        }
    }
    static int partition(int[] arr ,int low ,int high){
        int pivot=arr[high];
        int i=low;
        int j=0;
        for(j=low;j<high;j++){
            if(arr[j]<pivot){
                swap(arr,i,j);
                  i++;
            }
        }
        swap(arr,i,j);
       return i;
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={2,4,7,12,3,8,10,9};
        int low=0;
        int high=arr.length-1;
        QuickSort.sort(arr,low,high);

    }
}
