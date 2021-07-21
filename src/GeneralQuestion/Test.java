package GeneralQuestion;

import java.sql.Timestamp;

public class Test {
    public static void main(String[] args) {
        float a=50;
        a= a/60;



        Timestamp timestamp= Timestamp.valueOf("2020-07-09 12:30:01");

        Timestamp now= Timestamp.valueOf("2020-07-09 21:10:01");

        Boolean result = timestamp.before(now);

            if((now.equals(timestamp) || now.after(timestamp)) && (now.before(timestamp) || now.equals(timestamp))){

        }
        System.out.println(now);

    }
}
