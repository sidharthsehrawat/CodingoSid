package StackQueue;

public class StackImplementation {

    public static StackNode root;

    private static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    private int displayStack() {
        int len = 0;
        StackNode current = root;
        while (current != null) {
            len++;
            System.out.print(" " + current.data );
            current = current.next;
        }
        return len;
    }

    private static StackNode push(int data) {
        StackNode newnode = new StackNode(data);
        if (root == null) {
            root = newnode;
        } else {
            StackNode current = root;
            newnode.next = current;
            root = newnode;
        }
        return root;
    }

    private int pop() {
        if (root == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        StackNode temp = root;
        root = root.next;
        int poppedValue = temp.data;
        temp.next = null;
        return poppedValue;
    }

    private int peek() {
        return root.data;
    }

    public static void main(String[] args) {
        StackImplementation stackImplementation = new StackImplementation();

        //push
        StackImplementation.push(10);
        StackImplementation.push(20);
        StackImplementation.push(30);
        StackImplementation.push(40);

        // pop
        System.out.println("pop start method");
        System.out.println("deleted node"+stackImplementation.pop());

        //peek
        System.out.println("peek Node");
        System.out.println(stackImplementation.peek());

        // length
        System.out.println("length od Stack");
        System.out.println(stackImplementation.displayStack());
        stackImplementation.push(50);
        stackImplementation.push(60);

        System.out.println(stackImplementation.displayStack());

    }
}
