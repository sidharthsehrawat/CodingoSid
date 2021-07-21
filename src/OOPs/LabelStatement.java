package OOPs;

import java.util.Arrays;

public class LabelStatement {
    public static void main(String[] args) {
      String str="dkhc";
        System.out.println(method(str));
    }
public static String method(String w){
    char[] ch=w.toCharArray();
    int flag=0,i;

            OUTER:
            for (i = ch.length - 1; i > 0; i--) {
               if( ch[i]>ch[i-1]) {
                   int j = ch.length - 1;
                   while (flag == 0 && j != i - 1) {
                       if (ch[i-1] - 'a' < ch[j] - 'a') {
                           char t = ch[j];
                           ch[j] = ch[i - 1];
                           ch[i - 1] = t;
                           flag = 1;
                           break OUTER;
                       }
                       j--;
                   }
               }

    }
        Arrays.sort(ch, i, ch.length);
       if(flag==0){
           return "no answer";
       }
    String s=String.valueOf(ch);
    return s;
}
}
