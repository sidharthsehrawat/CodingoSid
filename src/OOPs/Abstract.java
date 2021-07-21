package OOPs;

class Test1
{
    static int a;

    static
    {
        a = 4;
        System.out.println ("inside static blockn");
        System.out.println ("a = " + a);
    }

    Test1()
    {
        System.out.println ("ninside constructorn");
        a = 10;
    }

    public static void func()
    {
        a = a + 1;
        System.out.println ("a = " + a);
    }

    public static void main(String[] args)
    {

        Test1 obj = new Test1();
        obj.func();

    }
}