package Hackerank;


public class RepeatedString {
    public static void main(String[] args) {

        String s = "a";
        long n = 100000000;



        long countForSubstring = 0;
        long totalCount = 0;

        //Determines how many a's are in a substring
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'a')
            {
                countForSubstring++;
            }
        }


        //Determines how many complete substrings we will analyze
        long divisor = n / s.length();

        totalCount += divisor * countForSubstring;


        //Determines how many characters in we will analyze towards the end of our n range
        long remainder = n % s.length();

        for(int i = 0; i < remainder; i++)
        {
            if(s.charAt(i) == 'a')
            {
                totalCount++;
            }
        }

        System.out.println(totalCount);

        // My Solution
      /*  StringBuilder sb=new StringBuilder();
        long count=0;
        for(int i=0;i<n;i++){
            sb.append(s.charAt(i%s.length()));
        }
        String str=sb.toString();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                count++;
            }
        }

        return count;
        */

    }
}
