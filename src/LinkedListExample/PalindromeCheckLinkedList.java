package LinkedListExample;

public class PalindromeCheckLinkedList {
    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    public static StackNode root;

    private static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    private static StackNode push(int data) {
        StackNode newNode = new StackNode(data);
        if (root == null) {
            root = newNode;
        } else {
            StackNode current = root;
            newNode.next = current;
            root = newNode;
        }
        return root;
    }


    private static int pop() {
        StackNode temp = root;
        root = root.next;
        int popValue = temp.data;
        temp.next = null;
        return popValue;
    }

    private static int peek() {
        return root.data;
    }

    private static int length() {
        int count = 0;
        while (root != null) {
            root = root.next;
        }
        return count;
    }


    private static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(" " + current.data + "-->");
            current = current.next;
        }
    }

    private static ListNode insertAtEnd(ListNode head, int data) {
        ListNode current = head;
        if (head == null)
            return new ListNode(data);

        while (current.next != null) {
            current = current.next;
        }
        ListNode newNode = new ListNode(data);
        current.next = newNode;
        newNode.next = null;
        return head;
    }

    private static Boolean checkPalindrome(ListNode head) {
        if (head == null) {
            System.out.println("Linked list is empty....");
            return false;
        }
        ListNode current = head;
        int count = 0, mid;
        while (current != null) {
            current = current.next;
            count++;
        }
        // odd
        if (count % 2 != 0) {
            mid = (count + 1) / 2;
        } else { // even
            mid = count / 2;
        }
        int counter = 0;
        while (head != null) {
            if (counter < mid - 1) {
                PalindromeCheckLinkedList.push(head.data);
                head = head.next;
                counter++;
            } else {
                if (counter == mid - 1) {
                    if (count % 2 != 0) {
                        head = head.next;
                        counter++;
                        continue;
                    } else {
                        head = head.next.next;
                        counter = counter + 2;
                        continue;
                    }
                }
                if (PalindromeCheckLinkedList.pop() == head.data) {
                    head = head.next;
                    counter++;
                    if (counter == count) {
                        System.out.println("Palindrome");
                        return true;
                    }
                } else {
                    System.out.println("Not Palindrome");
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = PalindromeCheckLinkedList.insertAtEnd(null, 100);
        ListNode head1 = PalindromeCheckLinkedList.insertAtEnd(head, 20);
        ListNode head2 = PalindromeCheckLinkedList.insertAtEnd(head1, 30);
        ListNode head3 = PalindromeCheckLinkedList.insertAtEnd(head2, 30);
        ListNode head4 = PalindromeCheckLinkedList.insertAtEnd(head3, 20);
        ListNode head5 = PalindromeCheckLinkedList.insertAtEnd(head3, 100);
        PalindromeCheckLinkedList.display(head5);

        PalindromeCheckLinkedList.checkPalindrome(head5);

    }
}
