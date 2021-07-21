package StringExample;

import java.util.ArrayList;
import java.util.List;

public class LongesrCommonSubString {
    public static void main(String[] args) {
        String s1 = "zxabcdezy";
        String s2 = "yxababcdezk";

        longest(s1, s2);
    }

    private static void longest(String s1, String s2) {
        int k = 0;
        List<String> list=new ArrayList<>();
        for (int i = k; i < s1.length(); i++) {
            for (int j = i; j < s2.length(); j++) {
                 if(s1.charAt(k)==s2.charAt(j)){
                      k++;
                  }else {
                     
                 }
            }
        }
    }
}
