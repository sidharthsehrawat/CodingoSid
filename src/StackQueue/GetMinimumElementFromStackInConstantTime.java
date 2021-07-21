package StackQueue;

public class GetMinimumElementFromStackInConstantTime {
    public static StackNode root;
    int min = Integer.MAX_VALUE;

    private class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    private StackNode push(int data) {
        if (data < min) {
            min = data;
        }
        StackNode newNode = new StackNode(data);

        if (root == null) {
            root = newNode;
        } else {

            newNode.next = root;
            root = newNode;

        }

        return root;
    }

    private int pop() {
        if (root == null) {
            System.out.println("Stack is Empty...");
            return -1;
        }
        StackNode temp = root;
        root = root.next;
        int popValue = temp.data;
        temp.next = null;
        if (popValue == min) {
            min = Integer.MAX_VALUE;
            StackNode current = root;
            while (current != null) {
                if (current.data < min) {
                    min = current.data;
                    current = current.next;
                } else {
                    current = current.next;
                }
            }
        }
        return popValue;
    }

    private int getMin() {
        return min;
    }

    private void display() {
        StackNode current = root;
        while (current != null) {
            System.out.println(" " + current.data + "-->");
            current = current.next;
        }
    }

    private int peek() {
        return root.data;
    }

    public static void main(String[] args) {
        GetMinimumElementFromStackInConstantTime getMinimumElementFromStackInConstantTime = new GetMinimumElementFromStackInConstantTime();
        getMinimumElementFromStackInConstantTime.push(20);
        //System.out.println(getMinimumElementFromStackInConstantTime.peek());
        getMinimumElementFromStackInConstantTime.push(45);
        //System.out.println(getMinimumElementFromStackInConstantTime.peek());
        getMinimumElementFromStackInConstantTime.push(40);
        //System.out.println(getMinimumElementFromStackInConstantTime.peek());
        getMinimumElementFromStackInConstantTime.push(15);
        getMinimumElementFromStackInConstantTime.push(10);
        getMinimumElementFromStackInConstantTime.push(30);
        //System.out.println(getMinimumElementFromStackInConstantTime.peek());
        getMinimumElementFromStackInConstantTime.display();
        System.out.println(" min element in stack is " + getMinimumElementFromStackInConstantTime.getMin());
        getMinimumElementFromStackInConstantTime.pop();
        getMinimumElementFromStackInConstantTime.pop();
        System.out.println("Aftr pop minimim element is " + getMinimumElementFromStackInConstantTime.getMin());

    }

}
