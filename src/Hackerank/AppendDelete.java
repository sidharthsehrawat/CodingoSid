package Hackerank;

public class AppendDelete {
    public static void main(String[] args) {
        String s="zzzzz";
        String t="zzzzzzz";

        int k=4;

        System.out.println(appendAndDelete(s,t,k));

    }

    static String appendAndDelete(String s, String t, int k) {
        StringBuilder sb=new StringBuilder(s);
        int i;
        if(s.length()==0 || t.length()==0){
            if(k==s.length()||k==t.length()){
                return "Yes";
            }else{
                return "No";
            }
        }
        for(i=0;i<s.length();i++){

            if(i>t.length()-1 || s.charAt(i)!=t.charAt(i)){
                break;
            }

        }

        for(int j=s.length()-1;j>=i;j--){
            sb.deleteCharAt(j);

        }

        for(int m=i; m<t.length();m++){
            sb.append(t.charAt(m));
        }

        if(s.length()<t.length()){
            k=k-i;
        }

        k=k-(s.length()-i);

        if(t.length()-i==k || (t.length()-i)%2==0){

            return "Yes";
        }else{
            return "No";
        }

    }
}
