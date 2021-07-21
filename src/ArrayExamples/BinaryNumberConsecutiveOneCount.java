package ArrayExamples;

import java.util.ArrayList;
import java.util.List;

public class BinaryNumberConsecutiveOneCount {
        public static void main(String[] args) {

            List<Integer> list=new ArrayList<Integer>();
            int reminder=0,count=0,n=439,maxCount=-32767;
            if(n<0){
                System.out.println("0");
            }
            while(n>0){
                reminder=n%2;
                list.add(reminder);
                n=n/2;
            }

            for(int num:list){
                if(num==1){
                    count++;
                }else if(count<=1){
                    count=0;
                }else{
                    if(maxCount<=count){
                        maxCount=count;
                        count=0;
                    }else
                    {
                        count=0;
                    }
                }
            }if(count==1){
                System.out.println(count);
            }else if(count>maxCount){
                maxCount=count;
                System.out.println(maxCount);
            }else{
                System.out.println(maxCount);
            }
        }
    }


