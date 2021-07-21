package Hackerank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumber {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(3);l.add(3);l.add(3);l.add(3);l.add(3);l.add(3);

        System.out.println( pickingNumbers(l));
    }

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        List<Integer> l = new ArrayList<>();
        Collections.sort(a);
        l.add(a.get(0));
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < a.size(); i++) {
            if (l.get(0) - a.get(i) == 1 || l.get(0) - a.get(i) == 0 || l.get(0) - a.get(i) == -1) {

                l.add(a.get(i));
            } else {
                if (l.size() > max) {
                    max = l.size();
                }
                l.remove(0);
                l.add(a.get(i));
            }


        }
        if (max==Integer.MIN_VALUE) {
            return a.size();
        }
        return max;
    }
}
