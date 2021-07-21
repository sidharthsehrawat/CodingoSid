package StringExample;

import java.util.Stack;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        String str = "My name   is Sid";
        char[] ch = str.toCharArray();
        int i = 0, start = 0;
        for (i = 0; i < str.length(); i++) {
            if (((str.charAt(i) == ' ' || i == str.length() - 1))) {
                if (i == str.length() - 1)
                    reverse(ch, start, i);
                else reverse(ch, start, i - 1);
                start = i + 1;
            }
        }
/*        while (i<str.length()){
            if(str.charAt(i)==' ' && str.charAt(start)!=' '){
                reverse(ch,start,i);
            }
            i++;
        }*/

        //String finalString = String.valueOf(ch);
       // System.out.println(finalString);

        int k=0;
        Stack<Character> stack=new Stack<>();
        for(int j=0;i<str.length();j++){
            if(str.charAt(j)!=' '){
                stack.push(ch[j]);
            }else if(ch[j]==' ') {
                while(!stack.isEmpty()){
                    ch[k]=stack.pop();
                    k++;
               }
            }
        }
       String finalString = String.valueOf(ch);
        System.out.println(finalString);


    }

    private static void reverse(char[] ch, int start, int i) {
        int last = i;
        char temp;
        while (start < last) {
            temp = ch[start];
            ch[start] = ch[last];
            ch[last] = temp;
            start++;
            last--;
        }
    }
}
