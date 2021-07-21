package ArrayExamples;

public class ReArrangeArrayWithAlterPosAndNegNumAndFollowOrder {
    static int[] arrange(int arr[]){
        int j=0,temp=0;
        for(int i=0;i<arr.length-1;i++){
            j=i+1;
           if(i%2==0 && !(arr[i]<0)){
               while(j<arr.length){
                   if(arr[j]<0){
                       break;
                   }
                   j++;
               }
              temp=arr[i];
               arr[i]=arr[j];
               //call shift method;
               shiftArray(arr,j,i,temp);
           }else if(i%2!=0 && !(arr[i]>0)){
               j=i+1;
               while (j<arr.length){
                   if(arr[j]>0){
                       break;
                   }
                   j++;
               }
               temp=arr[i];
               arr[i]=arr[j];
               //call shift method;
               shiftArray(arr,j,i,temp);
           }
        }
        return arr;
    }

    static void shiftArray(int[] arr,int end,int start,int temp){
       int j;
        for (j=end;j>start;j--){
             //temp=arr[start];

             arr[j]=arr[j-1];
              }
        arr[j+1]=temp;
    }
    public static void main(String[] args) {
        int[] arr ={-1,-2,-2,5,-5,6,7,-8};

        int[] arr1=ReArrangeArrayWithAlterPosAndNegNumAndFollowOrder.arrange(arr);
       for (int k=0;k<arr1.length;k++){
           System.out.print(" " + arr1[k]);
       }

    }
}
