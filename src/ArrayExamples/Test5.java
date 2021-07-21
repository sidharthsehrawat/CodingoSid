package ArrayExamples;

import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<String, String>();
        map.put("abc","abc");
        Set<String> set=new HashSet<>();
        map.put("def","def");
        map.put("xyz","xyz");
        map.get("abc");
       Iterator<Map.Entry<String,String>> entry = map.entrySet().iterator();
        while (entry.hasNext()){

        }
        for (Map.Entry<String,String> entry1: map.entrySet()){

        }
    }
}
