package LinkedListExample;

public class DeleteAllNodesFromLinkedList {
    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    public static void display(ListNode head) {
        if(head==null){
            System.out.println("linkedlist is empty.....");
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.println(" " + current.data + "-->");
            current = current.next;
        }
    }

    private static ListNode deleteNode(ListNode head) {
        ListNode temp;
        ListNode current = head;
        if(head==null){
            return head ;
        }

        while (current != null) {
            temp = current;
            current = current.next;
            temp.next = null;
            deleteNode(current);
        }
        return current;
    }

    private  static int countNodeOfLinkedList(ListNode head){
        if(head==null){
            return 0;
        }else {
            return 1+ countNodeOfLinkedList(head.next);
        }

    }

    private static ListNode insertNodeAtEnding(ListNode head, int data) {
        ListNode current = head;
        ListNode newNode = new ListNode(data);
        if (head == null) {
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

    private static boolean serachElementRecursively(ListNode head,int search){
        if(head==null){
            System.out.println("element not present========");
            return false;
        }
        if(head.data==search){
            System.out.println("element found=======");
            return true;
        }else {
            return serachElementRecursively(head.next,search);
        }

    }

    private static int findKthNode(ListNode head,int k){
        int count = 0;
        if(head==null){
            System.out.println("element not present head is null");
            return -1;
        }else {
            if(count==k){
                System.out.println("kth element found at index "+ k + " is " + head.data);
                return 1;
            }else {
                return findKthNode(head.next,k-1);
            }
        }
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(10);
        ListNode h1=DeleteAllNodesFromLinkedList.insertNodeAtEnding(head,20);
        ListNode h2=DeleteAllNodesFromLinkedList.insertNodeAtEnding(h1,30);
        ListNode h3=DeleteAllNodesFromLinkedList.insertNodeAtEnding(h2,40);
      //  DeleteAllNodesFromLinkedList.display(h3);
       // int count=DeleteAllNodesFromLinkedList.countNodeOfLinkedList(h3);
        //System.out.println("count of nodes=====" + count);
      //  DeleteAllNodesFromLinkedList.serachElementRecursively(h3,30);


      //  ListNode h4=DeleteAllNodesFromLinkedList.deleteNode(h3);
       // DeleteAllNodesFromLinkedList.display(h4);

        DeleteAllNodesFromLinkedList.findKthNode(h3,3);


    }
}
