package ArrayExamples;

public class Socks_Merchant {
    private static int method(int n, int[] ar) {

        int max = -32767, pairCount = 0, val = 0, val1 = 0;
        for (int num : ar) {
            if (num > max) {
                max = num;
            }

        }
        int[] result = new int[max + 1];
        for (int k = 0; k < n; k++) {
            result[ar[k]]++;
        }

        for (int i = 0; i < result.length; i++) {

            val = result[i];
            if (val > 1 ) {
                if (val % 2 == 0) {
                        pairCount = pairCount + (val / 2);
                } else if (val % 2 == 1) {
                    val = val / 2;
                    pairCount = pairCount + val;


                }
            }
        }
        return pairCount;

    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int n = 9;
        method(n, arr);
    }


}
