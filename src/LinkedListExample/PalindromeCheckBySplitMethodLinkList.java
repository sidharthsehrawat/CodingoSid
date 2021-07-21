package LinkedListExample;

public class PalindromeCheckBySplitMethodLinkList {

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    private static ListNode insertAtEbd(ListNode head,int data){
        ListNode newNode;
        if(head==null){
        return newNode=new ListNode(data);
        }
        ListNode current =head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=newNode=new ListNode(data);
        newNode.next=null;
    return head;
    }

    private static int display(ListNode head){
       int count=0;
        while (head!=null){
            System.out.print(" " + head.data+ "-->");
            count++;
            head=head.next;
        }
        return count;
    }
    private static ListNode splitLinkedList(ListNode head){
        int lenght=display(head);
        ListNode secondStart = null;
        int mid;
        if(lenght%2!=0){
            mid=lenght/2+1;
        }else {
            mid=lenght/2;
        }
        ListNode current=head;
        int counter=0;
        ListNode previous=head;
        while (current!=null) {

            if (counter < mid - 1) {
                counter++;
                 previous=current;
                current = current.next;
            }
            else {
                if(lenght%2!=0){
                    counter++;
                    ListNode temp=previous;

                     secondStart=temp.next.next;
                    previous.next=null;
                    // reverse 2nd LinkedList
                    ListNode secHead=reverseMethod(secondStart);
                    // iterate 1st and 2nd LinkedList ....
                    Boolean res=checkBothLL(head,secHead);
                    System.out.println(res);
                    return secondStart;
                }else {
                   counter++;
                   ListNode temp=previous.next;
                   previous.next=null;
                    secondStart=temp.next;
                    // reverse 2nd LinkedList
                    ListNode secHead=reverseMethod(secondStart);
                    // iterate 1st and 2nd LinkedList ....
                    Boolean res=checkBothLL(head,secHead);
                    System.out.println(res);
                   return secondStart;
                }
            }
        }

        return null;
    }
    private static Boolean checkBothLL(ListNode head,ListNode secHead){
        while (head!=null && secHead!=null){
            if(head.data==secHead.data){
                head=head.next;
                secHead=secHead.next;
            }else {
                return false;
            }
        }
        return true;
    }
    private static ListNode reverseMethod(ListNode secHead){
        ListNode current=secHead;
        ListNode previous=null;
        ListNode next=null;
        while (current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }

    public static void main(String[] args) {
       ListNode head= PalindromeCheckBySplitMethodLinkList.insertAtEbd(null,10);
        ListNode head1= PalindromeCheckBySplitMethodLinkList.insertAtEbd(head,20);
        ListNode head2= PalindromeCheckBySplitMethodLinkList.insertAtEbd(head1,30);
        ListNode head3= PalindromeCheckBySplitMethodLinkList.insertAtEbd(head2,30);
        ListNode head4= PalindromeCheckBySplitMethodLinkList.insertAtEbd(head3,20);
        ListNode head5= PalindromeCheckBySplitMethodLinkList.insertAtEbd(head4,300);
        PalindromeCheckBySplitMethodLinkList.display(head4);
        PalindromeCheckBySplitMethodLinkList.splitLinkedList(head4);





    }
}
