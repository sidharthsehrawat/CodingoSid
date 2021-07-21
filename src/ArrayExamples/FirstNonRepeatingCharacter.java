package ArrayExamples;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
   static HashMap<Character, CountIndex> map = new HashMap<Character, CountIndex>(255);
   static int max=Integer.MAX_VALUE;
    public static void firstNonRepeatCharacter(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.get(str.charAt(i)).incCount();
            } else {
                map.put(str.charAt(i), new CountIndex(i));
            }
        }
        for(Map.Entry<Character,CountIndex> entry: map.entrySet()){
            int index=entry.getValue().index;
            int count=entry.getValue().count;

            if(count==1 && index<max){
                max=index;
            }
        }
        System.out.println("Answer is "+  max);
    }

    public static void main(String[] args) {
        String str = "aacbedb";
        FirstNonRepeatingCharacter.firstNonRepeatCharacter(str);

    }
}

class CountIndex {
    int count;
    int index;

    CountIndex(int index) {
        this.index = index;
        this.count = 1;
    }

    public void incCount() {
        this.count++;
    }

}
