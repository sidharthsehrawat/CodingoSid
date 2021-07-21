package LinkedListExample;

public class FindKthNodeFromLast {
    private static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
        }
    }
    private static void display(ListNode head){
        ListNode current=head;
        while (current!=null){
            System.out.println(" " + current.data+ "-->");
            current=current.next;
        }
    }

    private static ListNode insertAtEndofLinkedList(ListNode head,int data){
        ListNode newnode=new ListNode(data);
        if(head==null){
            return newnode;
        }else {
            ListNode current=head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=newnode;
            newnode.next=null;
        }
        return head;
    }
    private static int findLength(ListNode head){
       int count=0;
        while (head!=null){
            count++;
            head=head.next;
        }
    return count;
    }

    private  static int FindKthNode(ListNode head,int k){
        int len=findLength(head);
        ListNode current=head;
        int count=1;
        while (count<len-k+1){
            count++;
            current=current.next;
        }
        System.out.println("Kth Node from end is "+ current.data);
        return current.data;
    }

    private static int FindKthNodeUsingTwoCounter(ListNode head,int k){
        ListNode current=head;
        int count=0;
        while (count!=k){
            count++;
            current=current.next;
        }
        ListNode end=current;
        ListNode start=head;
        while (end!=null){
            end=end.next;
            start=start.next;
        }
        System.out.println("Kth element form last is " +start.data);
        return start.data;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(10);
        ListNode h1=FindKthNodeFromLast.insertAtEndofLinkedList(head,20);
        ListNode h2=FindKthNodeFromLast.insertAtEndofLinkedList(head,30);
        ListNode h3=FindKthNodeFromLast.insertAtEndofLinkedList(head,40);
        FindKthNodeFromLast.display(h3);
        //FindKthNodeFromLast.FindKthNode(h3,3);
        FindKthNodeFromLast.FindKthNodeUsingTwoCounter(h3,2);
    }
}
