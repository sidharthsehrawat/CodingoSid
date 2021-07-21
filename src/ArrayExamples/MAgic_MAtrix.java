package ArrayExamples;

import java.util.ArrayList;
import java.util.List;

public class MAgic_MAtrix {
    static int formingMagicSquare(int[][] s) {
        int sum = 0, finalSum = 32767, k = 0, auxSum = 0,z=0,sud=0;
        int[] result=new int[10];
        for(int p=0;p<s.length;p++){
            for(int q=0;q<s.length;q++){
                result[s[p][q]]+=1;

            }
        }

        List<List<Integer>> matList = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>();
        List<Integer> list6 = new ArrayList<>();
        List<Integer> list7 = new ArrayList<>();
        List<Integer> list8 = new ArrayList<>();

// //         6 1 2
//            7 2 6
//            5 6 2
        list1.add(8);list1.add(6);list1.add(1);list1.add(3);list1.add(5);list1.add(7);list1.add(4);list1.add(9);list1.add(2);

        list2.add(6);
        list2.add(1);
        list2.add(8);
        list2.add(7);
        list2.add(5);
        list2.add(3);
        list2.add(2);
        list2.add(9);
        list2.add(4);

        list3.add(4);
        list3.add(9);
        list3.add(2);
        list3.add(3);
        list3.add(5);
        list3.add(7);
        list3.add(8);
        list3.add(1);
        list3.add(6);

        list4.add(2);
        list4.add(9);
        list4.add(4);
        list4.add(7);
        list4.add(5);
        list4.add(3);
        list4.add(6);
        list4.add(1);
        list4.add(8);

        list5.add(8);
        list5.add(3);
        list5.add(4);
        list5.add(1);
        list5.add(5);
        list5.add(9);
        list5.add(6);
        list5.add(7);
        list5.add(2);

        list6.add(4);
        list6.add(3);
        list6.add(8);
        list6.add(9);
        list6.add(5);
        list6.add(1);
        list6.add(2);
        list6.add(7);
        list6.add(6);

        list7.add(6);
        list7.add(7);
        list7.add(2);
        list7.add(1);
        list7.add(5);
        list7.add(9);
        list7.add(8);
        list7.add(3);
        list7.add(4);

        list8.add(2);
        list8.add(7);
        list8.add(6);
        list8.add(9);
        list8.add(5);
        list8.add(1);
        list8.add(4);
        list8.add(3);
        list8.add(8);

        matList.add(list1);
        matList.add(list2);
        matList.add(list3);
        matList.add(list4);
        matList.add(list5);
        matList.add(list6);
        matList.add(list7);
        matList.add(list8);


        for (List<Integer> listItem : matList) {
            List<Integer> listdata = listItem;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    if (s[i][j] != listdata.get(k)) {
                        sum = s[i][j] - listdata.get(k);
                        if (sum < 0) {
                            sum = sum * -1;
                        }

                        auxSum +=sum;

                    }
                    k++;
                }
            }
            k = 0;
            if (auxSum < finalSum) {
                finalSum = auxSum;
            }

            auxSum = 0;
        }
      /*  for(int m=0;m<result.length;m++){
            System.out.println(result[m]);
            if(result[m]>2){
                sud++;
            }
        }*/
    // finalSum=finalSum-sud;
        return finalSum;
    }


    public static void main(String[] args) {
        int[][] mat = {{6, 1, 2}, {7, 2, 6}, {5, 6, 2}  //6 1 2 7 2 6 5 6 2
        };

        System.out.println( formingMagicSquare(mat));;
    }

}
