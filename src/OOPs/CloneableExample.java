package OOPs;

class CloneableExample implements Cloneable
{
    int a;

    CloneableExample cloning()
    {
        try
        {
            return (CloneableExample) super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("CloneNotSupportedException is caught");
            return this;
        }
    }
}

class demo
{

    public static void main(String args[])
    {
        CloneableExample obj1 = new CloneableExample();
        CloneableExample obj2;
        obj1.a = 10;
        obj2 = obj1.cloning();
        obj2.a = 20;

        System.out.println("obj1.a = " + obj1.a);
        System.out.println("obj2.a = " + obj2.a);
    }
}