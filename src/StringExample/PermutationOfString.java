package StringExample;

import java.util.HashSet;
import java.util.Set;

public class PermutationOfString {
    public static void main(String[] args) {
        String str = "ABC";
        int len = str.length() - 1;
        Set<String> set=new HashSet<>();
        permute(str, 0, len,set);
        System.out.println(set);
    }

    private static void permute(String str, int l, int r,Set<String> set) {
        if (l == r) {
            System.out.println(str);
            set.add(str);
        } else {
            for (int i = l; i<=r; i++) {
                str=swap(str, l, i);
                permute(str, l + 1, r,set);
               str= swap(str, l, i);
            }
        }
    }

    private static String swap(String str, int i, int len) {
        char[] ch = str.toCharArray();
        char temp;
        temp = ch[i];
        ch[i] = ch[len];
        ch[len] = temp;
        return String.valueOf(ch);
    }


}
