package LinkedListExample;

public class LinkedListRecursivePrint {
    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    private static ListNode insertAtEnd(ListNode head, int data) {
        ListNode newnode = new ListNode(data);
        if (head == null) {
            return newnode;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
        newnode.next = null;
        return head;
    }

    private static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(" " + current.data + "-->");
            current = current.next;
        }
    }

    private static void printReverse(ListNode head){
        ListNode current=head;
        while (current!=null){
            if(current==null){
                return;
            }
            printReverse(current.next);
            System.out.println(" " + current.data + "-->");
        }

    }

    public static void main(String[] args) {
     ListNode head =  LinkedListRecursivePrint.insertAtEnd(null,10);
        ListNode head1 =  LinkedListRecursivePrint.insertAtEnd(head,20);
        ListNode head2 =  LinkedListRecursivePrint.insertAtEnd(head1,30);
        ListNode head3 =  LinkedListRecursivePrint.insertAtEnd(head2,40);
        ListNode head4 =  LinkedListRecursivePrint.insertAtEnd(head3,50);
        LinkedListRecursivePrint.display(head4);
        LinkedListRecursivePrint.printReverse(head4);



    }
}
