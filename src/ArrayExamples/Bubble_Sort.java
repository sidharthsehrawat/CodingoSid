package ArrayExamples;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] a={3,2,1};
        int count=0,temp=0;
        for(int i=0;i<a.length;i++){

            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    count++;
                }
            }
            System.out.println("Array is sorted in " + count + " swaps.");
            System.out.println("First Element: " + a[0]);
            System.out.println("Last Element: " + a[a.length-1]);
        }
    }
}
