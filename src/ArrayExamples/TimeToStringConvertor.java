package ArrayExamples;

public class TimeToStringConvertor {
    public static void main(String[] args) {
        int h=1;
        int m=1;
        System.out.println( method(h,m));
    }

    private static String method(int h, int m) {
        String msg = null;
        String hourMsg = null;
        String minuteMsg = null;
        String finalmessage=null;

        int minFirstDigit = 0;
        int minSecondDigit = 0;
        if(m<10 && m>0){
            minFirstDigit=m;
            minSecondDigit=m/10;
            if(m==1){
                msg="minute past";
            }else {
                msg = "minutes past";

            }}else if(m<30 && m>=10 && m!=15) {
            minSecondDigit =m%10;
            minFirstDigit =m/10;
            msg="minutes past";
        }else if(m>30){
            m=60-m;
            minSecondDigit = m % 10;
            minFirstDigit = m / 10;
            if(m==15) {
                msg = "quarter to";
                h = h + 1;
            }else{
                msg = "minutes to";
                h = h + 1;
            }
        }else if(m==30){
            msg="half past";
        }else if(m==0 ){
            msg= "o' clock";
        }else if(m==15){
            msg="quarter past";
        }else if(m==45){
            msg="quarter to";
        }
        // hour condition switch

        if(h==1){
            hourMsg= "one";
        }else if(h==2){
            hourMsg= "two";
        }else if(h==3){
            hourMsg= "three";
        }else if(h==4){
            hourMsg= "four";
        }else if(h==5){
            hourMsg= "five";
        }else if(h==6){
            hourMsg= "six";
        }else if(h==7){
            hourMsg= "seven";
        }else if(h==8){
            hourMsg= "eight";
        }else if(h==9){
            hourMsg= "nine";
        }else if(h==10){
            hourMsg= "ten";
        }else if(h==11){
            hourMsg= "eleven";
        }else if(h==12){
            hourMsg= "twelve";
        }

        if(m==1){
            minuteMsg="one";
        }else if(minFirstDigit==0 && minSecondDigit==2){
            minuteMsg="two";
        }else if(minFirstDigit==0 && minSecondDigit==3){
            minuteMsg="three";
        }else if(minFirstDigit==0 && minSecondDigit==4){
            minuteMsg="four";
        }else if(minFirstDigit==0 && minSecondDigit==5){
            minuteMsg="five";
        }else if(minFirstDigit==0 && minSecondDigit==6){
            minuteMsg="six";
        }else if(minFirstDigit==0 && minSecondDigit==7){
            minuteMsg="seven";
        }else if(minFirstDigit==0 && minSecondDigit==8){
            minuteMsg="eight";
        }else if(minFirstDigit==0 && minSecondDigit==9){
            minuteMsg="nine";
        }

        else if(minFirstDigit==1 &&  minSecondDigit==0 && minuteMsg==null){
            minuteMsg="ten";
        }else if(minFirstDigit==1 &&  minSecondDigit==1){
            minuteMsg="eleven";
        }else if(minFirstDigit==1 &&  minSecondDigit==2){
            minuteMsg="twelve";
        }else if(minFirstDigit==1 &&  minSecondDigit==3){
            minuteMsg="thirteen";
        }else if(minFirstDigit==1 &&  minSecondDigit==4){
            minuteMsg="fourteen";
        }else if(minFirstDigit==1 &&  minSecondDigit==5){
            minuteMsg="fifteen";
        }else if(minFirstDigit==1 &&  minSecondDigit==6){
            minuteMsg="sixteen";
        }else if(minFirstDigit==1 &&  minSecondDigit==7){
            minuteMsg="seventeen";
        }else if(minFirstDigit==1 &&  minSecondDigit==8){
            minuteMsg="eighteen";
        }else if(minFirstDigit==1 &&  minSecondDigit==9){
            minuteMsg="ninteen";
        }else if(minFirstDigit==2 &&  minSecondDigit==0){
            minuteMsg="twenty";
        }else if(minFirstDigit==2 &&  minSecondDigit==1){
            minuteMsg="twenty one";
        }else if(minFirstDigit==2 &&  minSecondDigit==2){
            minuteMsg="twenty two";
        }else if(minFirstDigit==2 &&  minSecondDigit==3){
            minuteMsg="twenty three";
        }else if(minFirstDigit==2 &&  minSecondDigit==4){
            minuteMsg="twenty four";
        }else if(minFirstDigit==2 &&  minSecondDigit==5){
            minuteMsg="twenty five";
        }else if(minFirstDigit==2 &&  minSecondDigit==6){
            minuteMsg="twenty six";
        }else if(minFirstDigit==2 &&  minSecondDigit==7){
            minuteMsg="twenty seven";
        }else if(minFirstDigit==2 &&  minSecondDigit==8){
            minuteMsg="twenty eight";
        }else if(minFirstDigit==2 &&  minSecondDigit==9){
            minuteMsg="twenty nine";
        }


        if(msg=="minutes past" || msg=="minute past"){
             finalmessage=minuteMsg+ " " + msg +  " " + hourMsg;

        }else if(msg=="minutes to"){
             finalmessage=minuteMsg + " " + msg + " " + hourMsg;

        }else if(msg=="half past"){
             finalmessage= msg + " " +  hourMsg;

        }else if(msg=="o' clock"){
             finalmessage=hourMsg + " " + msg;

        }else if(msg=="quarter past"){
             finalmessage=msg + " " + hourMsg;

        }else if(msg=="quarter to"){
             finalmessage=msg + " "  + hourMsg;
        }
    return finalmessage;
    }
}
