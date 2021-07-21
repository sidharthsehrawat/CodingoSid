package LinkedListExample;

public class CheckPalindromeUsingRecursion {
    static ListNode heads;
    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    private static ListNode insertAtEnd(ListNode head, int data) {
        ListNode current = head;
        ListNode newNode = new ListNode(data);
        if (current == null) {
            return newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = null;
        }
        return head;
    }

    private static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.println(" " + current.data + "-->");
            current = current.next;
        }
    }

    private static boolean checkPalindrome(ListNode head) {
        ListNode left = heads;
        ListNode current = head;
        if (current == null) {
            return true;
        }
        Boolean nodeResult = checkPalindrome(current.next);

        if (left.data != current.data) {
            return false;
        }else {
            left = left.next;
        }
        return true;
    }

    public static void main(String[] args) {
         heads = CheckPalindromeUsingRecursion.insertAtEnd(null, 10);
        ListNode head1 = CheckPalindromeUsingRecursion.insertAtEnd(heads, 20);
        ListNode head2 = CheckPalindromeUsingRecursion.insertAtEnd(head1, 30);
        ListNode head3 = CheckPalindromeUsingRecursion.insertAtEnd(head2, 20);
        ListNode head4 = CheckPalindromeUsingRecursion.insertAtEnd(head3, 10);
        display(head4);
       // ListNode left = heads;
        Boolean res = checkPalindrome(head4);
        System.out.println(res);
    }
}
