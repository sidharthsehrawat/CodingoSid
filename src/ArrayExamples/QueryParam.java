package ArrayExamples;

import java.util.HashMap;

public class QueryParam {
    public static void main(String[] args) {

        String[] strings = {"def", "de", "fgh"};
        String[] queries = {"de", "lmn", "fgh"};

        HashMap<String, Integer> map = new HashMap<>();
        int[] res = new int[queries.length];
        int initialValue = 0;
        int prev = 1, itr = 0;
        for (String i : strings) {
            if (map.containsKey(i)) {
                prev = map.get(i);
                map.put(i, prev + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (String j : queries) {
            if (map.containsKey(j)) {

                res[itr] = map.get(j);
                itr++;
            }else{

                res[itr] = 0;

            }
        }




    }
}
