package ArrayExamples;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat={
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int r=0,c=0,N=4,row=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
              if(row==0){
                System.out.print(mat[i][j]);
                }
              else if(row==1 && N<4){
                  for(int i1=N-1;i1>1;i--){
                      System.out.print(mat[i][i1]);
                  }
              }
              else if(row==2 ){

              }

              }

            row++;


        }




    }

}
