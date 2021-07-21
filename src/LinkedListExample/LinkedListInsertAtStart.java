package LinkedListExample;


public class LinkedListInsertAtStart {

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;

        }
    }

    private static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.println(" " + current.data + "-->");
            current = current.next;
        }
    }

    private static ListNode insertNodeAtBeginning(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            return newNode;
        } else {

            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    private static ListNode insertAtEnd(ListNode head, int data) {
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

    private static ListNode insertAtGivenPosition(ListNode head,int data,int position){
        int count=1;
        ListNode newNode=new ListNode(data);
        if (head==null){
            return newNode;
        }else {
            ListNode current=head;
            ListNode temp=null;
            while (count<position-1){
                current=current.next;
                count++;
            }
             temp=current.next;
            current.next=newNode;
            newNode.next=temp;
        }
        return head;
    }
    /*
    * if(position==1){
         SinglyLinkedListNode head1=head;
         head=head1.next;
         head1.next=null;
         return head;
        }

    * */

    private static ListNode deleteNodeFromBegining(ListNode head){
        ListNode temp=head;
        head=temp.next;
        temp.next=null;
        return head;
    }

    private static ListNode deleteNodeFromEnd(ListNode head){
        ListNode current=head;
        while (current.next.next!=null){
            current=current.next;

        }
        current.next=null;
     return head;
    }

    private static ListNode deleteNodeFromPosition(ListNode head,int position){
       int count=1;
        ListNode current=head;
        ListNode temp=null;
        if (position==1){
            ListNode temp1=head;
            head=head.next;
            temp1=null;
            return head;
        }

        while (count<position-1){
            current=current.next;
            count++;
        }
        temp=current.next.next;
        current.next=temp;
        return head;
    }


    public static void main(String[] args) {
        ListNode head=new ListNode(10);
       /*
        // insert At Begining of Linked List     .......
        ListNode h1= LinkedListInsertAtStart.insertNodeAtBeginning(head,20);
        ListNode h2=LinkedListInsertAtStart.insertNodeAtBeginning(h1,30);
        ListNode newHead=LinkedListInsertAtStart.insertNodeAtBeginning(h2,40);
        LinkedListInsertAtStart.display(newHead);
        */
        // Insert At End of LinkedList . ... .
        ListNode h1=LinkedListInsertAtStart.insertAtEnd(head,20);
        ListNode h2=LinkedListInsertAtStart.insertAtEnd(h1,30);
        ListNode h3=LinkedListInsertAtStart.insertAtEnd(h2,40);
        //LinkedListInsertAtStart.display(h3);
       /* ListNode h4=LinkedListInsertAtStart.insertAtGivenPosition(h3,25,3);
        LinkedListInsertAtStart.display(h4);*/
       /*ListNode h4=LinkedListInsertAtStart.deleteNodeFromBegining(h3);
       LinkedListInsertAtStart.display(h4);*/

       /*ListNode nh4 =LinkedListInsertAtStart.deleteNodeFromEnd(h3);
       LinkedListInsertAtStart.display(nh4);*/
       ListNode h4=LinkedListInsertAtStart.deleteNodeFromPosition(h3,2);
       LinkedListInsertAtStart.display(h4);


    }


}
