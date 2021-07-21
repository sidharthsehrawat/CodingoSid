package ArrayExamples;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
       /* String s= "11:00:70AM";
        int number=Integer.parseInt(s.substring(0,2));
        //int finalNumber=number +12;
       if(s.charAt(s.length()-2)=='A' && number==12){
           s= s.replace(s.substring(0,2),"00");
           s= s.replace(s.substring(s.length()-2,s.length()),"");
       }
        else if(s.charAt(s.length()-2)=='P' && s!=null && number<12){
           s= s.replace(s.substring(0,2), (Integer.toString(number+12)));
           s= s.replace(s.substring(s.length()-2,s.length()),"");
        }
        System.out.println(s);*/

        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t>0){
            String ch=sc.next();
            System.out.println(ch);

            t--;
        }

       double d= 9.868936507; //
       String str=String.valueOf(d);
       String s =str.replace(".","");

       int[][] mat={
               {1,2},
               {3,4}
       };

       for(int i=0;i<mat.length;i++){

               int start=mat[i][0];
               int end=mat[i][1];

       }

    }
}
