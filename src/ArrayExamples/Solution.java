package ArrayExamples;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String evenStr="";
        String oddStr ="";
        Scanner scan=new Scanner(System.in);
        int number =scan.nextInt();
        String[] strArray=new String[number];
        for(int n=0;n<number;n++){
            strArray[n] =scan.next();
            for(int i=0;i<strArray[n].length();i++){
                if(i%2==0){
                    evenStr+=strArray[n].charAt(i);
                }else{
                    oddStr+=strArray[n].charAt(i);
                }
            }
            System.out.println(evenStr + " " + oddStr);

        }


    }
}
