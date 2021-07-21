package StringExample;

import java.util.Arrays;

public class NextGreaterString {
    public static void main(String[] args) {
        String str = "abdc";
        char[] ch = str.toCharArray();
        System.out.println(solve(str));
    }


    public static String solve(String w) {
        char[] str=w.toCharArray();
        int i, flag = 0;
        loop:
        for (i = str.length - 1; i > 0; i--) {

            if (str[i] > str[i - 1]) {
                int j = str.length - 1;
                while (flag == 0 && j != i - 1) {
                    if (str[i - 1]-'a' < str[j]-'a') {
                        char t = str[j];
                        str[j] = str[i - 1];
                        str[i - 1] = t;
                        flag = 1;
                        break loop;
                    }
                    j--;
                }
            }

        }

        Arrays.sort(str, i, str.length);

        if (flag == 0)
            return "no answer";
        else
            return String.valueOf(str);


    }
}
