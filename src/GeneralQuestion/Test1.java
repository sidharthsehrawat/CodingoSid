package GeneralQuestion;

public class Test1 {
    private static String str2 = null;
    public static void changeStr(String str) {
        str = "welcome";
    }
    public static void main(String[] args) {
        String str = "1234";
        str2 = "5678";
        changeStr(str);
        changeStr(str2);
        System.out.println(str);
        System.out.println(str2);
    }
}
