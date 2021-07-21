package Hackerank;

import java.util.HashMap;
import java.util.Map;

public class MinimunDistance {
    public static void main(String[] args) {

    }

    static int minimumDistances(int[] a) {
        Map<Integer,Integer> map=new HashMap<>();
        int diff=0,min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            map.put(a[i],i);
        }

        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                int lastIndex=map.get(a[i]);
                diff=lastIndex-i;
                if(diff!=0 && diff<min){
                    min=diff;
                }
            }
        }
        return min;

    }
}
