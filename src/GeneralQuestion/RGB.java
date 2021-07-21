package GeneralQuestion;

import java.util.*;

public class RGB {
    public static void main(String[] args) {
        int N=4;
        String S= "RBBGRB";
        String A="130425";
        String f= "";
        Map<Character, List<Integer>> map=new HashMap<>();
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(map.containsKey(ch)){
                List<Integer> list=map.get(ch);
                char n=A.charAt(i);
                Integer n1= n -'0';
                list.add(n1);
            }else {
                List<Integer> list =new ArrayList<>();
                char n=A.charAt(i);
                Integer n1= n -'0';
                list.add(n1);
                map.put(S.charAt(i),list);
            }
        }

        for (int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            // check for value in list...
            if(map.containsKey(ch)){
               List<Integer> list= map.get(ch);
               if(list.size()>0) {
                   Collections.sort(list);
                   Integer num = list.get(list.size() - 1);
                   f = f + num;
                   list.remove(list.size() - 1);
               }
            }
        }
        System.out.println("============== " + f);
}
}
