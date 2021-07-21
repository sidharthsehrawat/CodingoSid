package StringExample;

public class LongestPalindromInString {
    public static void main(String[] args) {
        String str = "abc";

        // find all possible substring then extract longest palindrome
        //  String str="aababbabm";  // aba, bab, abba
        // Method 1
       /*
        long start = System.currentTimeMillis();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i,j));
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("=========takes " +
                (end - start) + "ms");
*/


        // Method 2
        // using StringBuilder
        long start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        int j;
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            System.out.println(sb);
            for (j = i + 1; j < str.length(); j++) {
                sb.append(str.charAt(j));
                System.out.println(sb);
            }
            //System.out.println(sb);
            sb.delete(0, j);
        }
        long end = System.currentTimeMillis();
        System.out.println("=========takes " +
                (end - start) + "ms");

        // Method 3 recursive call

        recursive(str, new StringBuffer());

    }

    public static void recursive(String str, StringBuffer sb) {
        if (str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                System.out.println(sb);
            }
            sb.delete(0, str.length());
            recursive(str.substring(str.length() - (str.length() - 1), str.length()), sb);


        }

    }
}
