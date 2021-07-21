package GeneralQuestion;

public class Test2 {
    static boolean foo(char c) {
        System.out.print(c);
        return true;
    }
    public static void main(String[] argv) {
        int i = 0;
        for (foo('A'); (i < 2); foo('C')) {
            i++;
            foo('D');
        }

        /*for (foo('A'); foo('B') && (i < 2); foo('C')) {
            i++;
            foo('D');
        }*/
    }
}
