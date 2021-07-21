package ArrayExamples;

public class Encryption {
    private static String method(String s) { StringBuilder sb=new StringBuilder();
        StringBuilder sv=new StringBuilder();
        int n=0;
        int number=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            }
        }
        if(sb.length()==1){
            return s;

        }
        int length=sb.length();
        for(int j=1;j*j<=length;j++){
            number=j;
        }
        int row=number;
        int column=number+1;

        if ((number*number)==sb.length()) {
            row=column=number;
        }
        if((row*column)<s.length()){
            row=row+1;
        }
        for(int m=0;m<column;m++){    // chillout
            sv.append(sb.charAt(m));
            for(n=m;n<=sb.length();++n){      //  hae and via ecy
               if(n!=m){
                   n=n+column-1;
               }else {
                   n=n+column;
               }
                if(n<sb.length()){
                    sv.append(sb.charAt(n));
                }else{
                    sv.append(' ');
                }
            }
        }

        return sv.toString();
    }
    public static void main(String[] args) {
    String str= "haveaniceday";
        System.out.println(method(str));
    }


}
