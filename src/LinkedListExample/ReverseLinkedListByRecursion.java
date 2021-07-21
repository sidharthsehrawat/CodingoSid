package LinkedListExample;

public class ReverseLinkedListByRecursion {
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

    private static ListNode reverseLinkedList(ListNode head) {
        ListNode current = head;
        ListNode newHead;
        if(head==null){
            return head;
        }
        if (current.next == null) {
            return current;
        } else {
            newHead= reverseLinkedList(current.next);
            current.next.next = current;
            current.next=null;
        }
        return newHead;
    }

    private static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(" " + current.data + "-->");
            current = current.next;
        }
    }

    private static void PrintReverseLL(ListNode head) {
        ListNode current = head;
        if (current == null) {
            return;
        }
        PrintReverseLL(current.next);
        System.out.println(" " + current.data + "-->");
        return;
    }

    public static void main(String[] args) {
        ListNode head = insertAtEnd(null, 10);
        ListNode head1 = insertAtEnd(head, 20);
        ListNode head2 = insertAtEnd(head1, 30);
        ListNode head3 = insertAtEnd(head2, 40);
        ListNode head4 = insertAtEnd(head3, 50);
        display(head4);
        //  PrintReverseLL(head4);
        ListNode rev = reverseLinkedList(head4);
        display(rev);


    }
}
