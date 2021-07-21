package ArrayExamples;

public class Greedy_Florist {
    public static void main(String[] args) {
        int c[]={2,5,6};
        int k=3;
        int sum=0,extraFlower=0,count=1;
        for(int i=c.length-1;i>=c.length-k;i--){
            sum=sum+c[i];
        }
        if(k==c.length){
            System.out.println(sum);
            return;
        }
        extraFlower=c.length-k;
        if(extraFlower>0){
            for(int n=0;n<extraFlower;n++){
                sum=sum+c[n]*2;
            }
            System.out.println(sum);
        }else{
            for(int m=extraFlower-1;m>=0;m--){
                if(k>0){
                    sum=sum+c[m]*2;
                    k--;
                }
                else{
                    sum=sum+(c[m]*(count++ +1));
                }
            }
            System.out.println(sum);
        }

    }

}

