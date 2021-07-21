package ArrayExamples;

public class Surface_Area_Problem {
    static int surfaceArea(int[][] A) {       // 1 3 4
        int area=0;                           // 2 2 3
        int t=0,b=0,n=0,w=0,s=0,e=0;          // 1 2 4
        int row= A.length;
        int cubeValue=0;
        int column = A[0].length;
        if( column==1 && row ==1 ){
            return (4*A[0][0])+2;
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                cubeValue=A[i][j];
                t=b=1;
                if(i>0){
                    if(cubeValue>A[i-1][j]){
                        n= cubeValue-A[i-1][j];
                    }
                }
                else if(i==0){
                    n=cubeValue;
                }

                if(j>0){
                    if(cubeValue>A[i][j-1]){
                        w=cubeValue-A[i][j-1];
                    }
                }else if(j==0){
                    w=cubeValue;

                }
                if(i<row-1){
                    if(cubeValue>A[i+1][j]){
                        s=cubeValue - A[i+1][j];
                    }
                }else{
                    s=cubeValue;
                }
                if(j<column-1){
                    if(cubeValue > A[i][j+1]){
                        e=cubeValue-A[i][j+1];
                    }
                }else{
                    e=cubeValue;
                }
                area=area+ (t+b+n+w+s+e);
                t=b=n=w=s=e=0;
            }


        }

        return area;
    }

    public static void main(String[] args) {
        int[][] mat={{100}
                     };

        System.out.println(surfaceArea(mat));
    }
}
