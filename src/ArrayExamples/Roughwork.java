package ArrayExamples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.*;
import java.util.HashSet;
import java.util.*;

public class Roughwork {

    public static void main(String args[]) throws Exception {
    Scanner s=new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str2 = br.readLine();
        String str3 = br.readLine();
        HashMap map=new HashMap();
        List<Integer> l=new ArrayList<>();
        Set<Integer> set=new HashSet<>();

        //String str9 = "1 2 3";
        str2=str2.replace(" ","");
        char ch = str2.charAt(0);
        int n = ch - '0';

        int[] result = new int[200];
       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String str = br.readLine();
        int num = 0;
        for (int i = 0; i < str2.length(); i++) {
            num = str2.charAt(i) - '0';
            if (result[num] >= 0) {
                result[num]++;
            }
        }

        for (int j = 0; j < result.length; j++) {
            if (result[j] >= 1) {
                System.out.println(j + ":" + result[j]);
            }
        }








     /*

        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        Scanner sc1 =new Scanner(System.in);
        String str=sc1.nextLine();
        str=str.replace(" ","");
      // int n= Integer.parseInt(str);
        Scanner sc3 =new Scanner(System.in);
        String str2=sc3.nextLine();
        str2=str2.replace(" ","");
        //String ch=sc.next();
        //float f=sc.nextFloat();
        //boolean bool=sc.nextBoolean();
        int[] a = new int[N];
        int[] b = new int[N];
        int[] sum = new int[N];
        String[] strNums;
        //strNums = br.readLine().split("\\s");
        for (int i = 0; i < N; i++) {
            a[i] = str.charAt(i)-'0';
        }
        for (int j = 0; j < N; j++) {
            //char ch= str2.charAt(j);

            //a[j] = Integer.parseInt(str2.charAt(j));
            //b[j] = Integer.parseInt(strNums[j]);
        }
        int sum1=0;
        for (int k = 0; k <N; k++) {
            // sum[k]=a[k]+b[k];
            sum1=a[k]+b[k];
            System.out.print((a[k] + b[k]) + " ");
        }
    }*/
    }
}
