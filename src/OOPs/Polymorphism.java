package OOPs;

public class Polymorphism {
    public static void main(String[] args) {
        A obj = new B();
        obj.fun();
    }
}

class A {

    public static void fun() {
        System.out.println("fun in A");
    }


}

class B extends A {
    public static void fun() {
        System.out.println("fun in B");
    }
}