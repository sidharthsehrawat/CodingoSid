package ArrayExamples;

public class Test4 {
   /*public static int method(int[] arr, int k){
       int count=0,num;

       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               num=arr[i]+arr[j];
               if(num%k==0){
                  count++;
               }

           }

       }
        return count;
    }*/
   public static boolean isPal(String name){
       int i=0,j=name.length()-1;
       while(i<j){
           if(name.charAt(i)!=name.charAt(j)){
               return false;
           }else{
               i++;
               j--;
           }
       }
       return true;
   }

    public static void main(String[] args) {
        String name = "aabbcbzaa";


        if(isPal(name)==true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }

}
