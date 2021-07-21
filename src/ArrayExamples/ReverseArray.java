package ArrayExamples;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a ={4,3,2,1};
        int i=0,j=a.length-1,temp=0;
        while(i<a.length/2){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j--;
            i++;

        }
        System.out.println(a);
    }
}
