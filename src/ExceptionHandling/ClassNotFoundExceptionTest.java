package ExceptionHandling;

public class ClassNotFoundExceptionTest {
    public static void main(String[] args) {
        try {
            Class.forName("Test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
