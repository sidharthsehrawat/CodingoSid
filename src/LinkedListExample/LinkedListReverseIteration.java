package LinkedListExample;

public class LinkedListReverseIteration {
    private static class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
           this.data = data;

        }

    }

    public static ListNode display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(" " + current.data + "-->");
            current = current.next;
        }
        return head;
    }

    public static ListNode insertAtEnd(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            return newNode;
        } else {
            ListNode current = head;
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
        ListNode previous = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous; //because current becomes head...
    }

    private static  ListNode mergeTwoSortedLL(ListNode head1,ListNode head2){


        ListNode current;

        ListNode s;
            if(head1.data>head2.data){
                s=head2;
                current=head2;
                head2=head2.next;
            }else{
                s=head1;
                current=head1;
                head1=head1.next;
            }

            while(head1!=null && head2!=null){
                // check for small data
                if(head1.data>=head2.data){
                    s.next=head2;
                    s=head2;
                    head2= s.next;
                }else{
                    s.next=head1;
                    s=head1;
                    head1=s.next;
                }
            }
           if(head1==null){
               s.next=head2;
           }
           else {
               s.next=head1;
           }

            return current;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode head1 = LinkedListReverseIteration.insertAtEnd(head, 5);
        ListNode head2 = LinkedListReverseIteration.insertAtEnd(head1, 6);
       // ListNode head3 = LinkedListReverseIteration.insertAtEnd(head2, 40);
       // LinkedListReverseIteration.display(head2);

        ListNode headsec = new ListNode(1);
        ListNode headsec1 = LinkedListReverseIteration.insertAtEnd(headsec, 2);
        ListNode headsec2 = LinkedListReverseIteration.insertAtEnd(headsec1, 10);
       // ListNode headsec4 = LinkedListReverseIteration.insertAtEnd(head2, 40);
        LinkedListReverseIteration.display(head2);
        System.out.println();
        LinkedListReverseIteration.display(headsec2);
        mergeTwoSortedLL(head2,headsec2);


       // ListNode head4 = LinkedListReverseIteration.reverseLinkedList(headsec3);
      //  LinkedListReverseIteration.display(head4);
    }
}
