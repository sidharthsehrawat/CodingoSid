package ArrayExamples;

import java.util.ArrayList;
import java.util.List;

public class Chocolate_Problem {
    static int birthday(List<Integer> s, int d, int m) {
        int count=0,sum=0,index_count=0,secondIndex=0;
        if(s.size()==1 && s.get(0)==d && m==1){ // 4 5 4 5  1 2   "1 4 3 2  4 4" 3 5 2 2 5 4 3 2  3 5 2 1 5 2  3 1 2 3 3 1 2 5
            return 1;
        }else{
            for(int i=0;i<s.size();i++){  //  5 1 4 1 5 4 5 1 3 5  1 1 5 1 4 2 1  1 1 2 5
                sum=sum+s.get(i);
                index_count++;
                if(sum == d && index_count==m){
                    count++;
                    sum=0;
                    index_count=0;
                    i=++secondIndex-1;
                }else if(sum == d){
                    i=++secondIndex-1;
                    sum=0;
                    index_count=0;
                }else if(sum > d){
                    i=++secondIndex-1;
                    sum=0;
                    index_count=0;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();  // 4 5 4 5  1 2 1 4 3 2  4 4 3 5 2 2 5 4 3 2  3 5 2 1 5 2  3 1 2 3 3 1 2 5
        list.add(5);                           //  5 1 4 1 5 4 5 1  3 5   "1 1 5 1 4 2 1 1 1 2 5
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(5);

        list.add(1);
        list.add(1);
        list.add(5);
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(5);


        System.out.println(birthday(list,15,7));
    }
}
