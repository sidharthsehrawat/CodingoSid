package LinkedListExample;

public class DetectLoopInSinglyLinkedList {
    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    public static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.println(" " + current.data + "-->");
            current = current.next;
        }
    }

    private static ListNode insertAtEnd(ListNode head, int data) {
        ListNode current = head;
        ListNode newnode = new ListNode(data);
        if (head == null) {
            return newnode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
        }
        current.next = newnode;
        newnode.next = null;
        return head;
    }

    private static ListNode DetecLoop(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        ListNode current2 = head.next;
        while (current != null && current2 != null && current2.next != null) {
            current = current.next;
            current2 = current2.next.next;
            if (current == current2) {
                ListNode start = head;
                while (start != current) {
                    current = current.next;
                    start = start.next;
                }
                System.out.println("loop detected at node " + start.data);
                countLoopCount(start);
                return start;
            }
        }

        return null;
    }

    private static int mergePointofTwoLL(ListNode head1, ListNode head2){
        ListNode current=head1;
        ListNode current2=head2;
        //find length of both Linked List...
        int l1= length(current);
        int l2= length(current2);
        if(l1>l2){
            int diff=l1-l2,count=0;
            while(count<diff){
                current=current.next;
                count++;
            }
        }else{
            int diff=l2-l1,count=0;
            while(count<diff){
                current2=current2.next;
                count++;
            }
        }
        int ans=0;
        while(current!=null && current2!=null){
            if(current.data==current2.data){
                ans=current.data;
            }
            current=current.next;
            current2=current2.next;
        }
        return ans;
    }

    static int  length(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }

    public static ListNode removeDuplicates(ListNode head) {

        ListNode curr=head;
        while (curr!=null){
            ListNode temp=curr;
            while (temp!=null && temp.data==curr.data){
                temp=temp.next;
            }
            curr.next=temp;
            curr=curr.next;

        }
        return head;
    }

    private static int countLoopCount(ListNode start){
        ListNode current=start.next;
        int count=1;
        while (current!=start){
            count++;
            current=current.next;
        }
        System.out.println("loop count is " + count);
        return count;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode h1 = DetectLoopInSinglyLinkedList.insertAtEnd(head, 1);
        ListNode h2 = DetectLoopInSinglyLinkedList.insertAtEnd(h1, 1);
        ListNode h3 = DetectLoopInSinglyLinkedList.insertAtEnd(h2, 1);
        ListNode h4 = DetectLoopInSinglyLinkedList.insertAtEnd(h3, 1);
        ListNode h5 = DetectLoopInSinglyLinkedList.insertAtEnd(h4, 1);
        //h4.next.next.next.next.next = h4.next;
        ListNode head1=DetectLoopInSinglyLinkedList.removeDuplicates(h5);

        DetectLoopInSinglyLinkedList.display(head1);
        DetectLoopInSinglyLinkedList.DetecLoop(h4);


    }
}
