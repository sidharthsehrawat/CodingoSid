package Hackerank;

public class FindDigits {
    public static void main(String[] args) {
        System.out.println(findDigits(106108048));
        String s="abc";
        StringBuilder sb=new StringBuilder(s);

        sb.deleteCharAt(2);
        sb.append(s.charAt(0));
        System.out.println(s);
    }

    static int findDigits(int n) {
        int count = 0, num = 0,left=n;
        while (left!=0) {
            num = left % 10;
            if (num != 0 && n % num == 0) {
                count++;
            }
            left = left / 10;
        }
        return count;

    }
}