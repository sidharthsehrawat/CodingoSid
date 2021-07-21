package ArrayExamples;

import java.util.HashMap;
import java.util.Map;

public class AnamGram {
    public static void main(String[] args) {
        String str1="ccdgz";
        String str2="dca";
        int freq=1;
        int diff=0;
        int newdiff=0;
        int steps=0;
        HashMap<Character,Integer> map1 =new HashMap<Character, Integer>();
        HashMap<Character,Integer> map2 =new HashMap<Character, Integer>();
            char[] ch1=str1.toCharArray();
            char[] ch2=str2.toCharArray();
            for(int i=0;i<ch1.length;i++){
                if(!map1.containsKey(ch1[i])){
                    map1.put(ch1[i],1);
                }else {
                    map1.put(ch1[i],map1.get(ch1[i])+1);
                }
            }

        for(int j=0;j<ch2.length;j++){
            if(!map2.containsKey(ch2[j])){
                map2.put(ch2[j],1);
            }else {
                map2.put(ch2[j],map2.get(ch2[j])+1);
            }
        }
        for (Map.Entry<Character,Integer> entry : map1.entrySet())
            if (!map2.containsKey(entry.getKey())){

               diff=diff+1;
                steps=steps+diff;
            }
        for (Map.Entry<Character, Integer> entry1 : map2.entrySet())
            if (map1.containsKey(entry1.getKey())){
                if(map1.get(entry1.getKey())!=entry1.getValue()){
                    newdiff=map1.get(entry1.getKey())-entry1.getValue();
                     if(newdiff<0){
                         newdiff= newdiff*-1;
                     }
                    steps=steps+newdiff;
                }

            }else{
               steps= diff=diff+1;
            }

        System.out.println(steps);
     }
}
