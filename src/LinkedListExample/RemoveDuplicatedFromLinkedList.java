package LinkedListExample;

import java.util.HashMap;

public class RemoveDuplicatedFromLinkedList {
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
        if (head == null) {
            return newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
        }
        current.next = newNode;
        newNode.next = null;
        return head;
    }

    private static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.println(" " + current.data + "-->");
            current = current.next;
        }
    }

    // for sorted LL
    private static ListNode removeDuplicatesFromSortedLL(ListNode head) {
        ListNode previos = null;
        ListNode current = head;
        int dataValue = 0;
        while (current != null) {
            if (current.data == dataValue) {
               // ListNode next = current.next;
                previos.next = current.next;
               // current.next = null;
               // previos = next;
               // current = previos;
                //dataValue = current.data;
                //current = current.next;

            }else {
                dataValue = current.data;
                previos = current;

            }
            current = current.next;
        }
        return head;
    }

    private static ListNode removeDuplicateUnsortedArray(ListNode head) {
        if (head == null) {
            return head;
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        ListNode previous = null;
        ListNode next = null;
        ListNode current = head;
        while (current != null) {
            int curVal=current.data;

            if (map.containsKey(curVal)) {
               // next = current.next;
                previous.next = current.next;
               /* current.next=null;
                //previous=next;
                current=next;
                map.put(current.data, 1);
                current = current.next;
*/
            }else {
                map.put(curVal, 1);
                previous = current;

            }
            current = current.next;

        }
    return head;
    }


    public static void main(String[] args) {
        ListNode head = RemoveDuplicatedFromLinkedList.insertAtEnd(null, 10);
        ListNode head1 = RemoveDuplicatedFromLinkedList.insertAtEnd(head, 20);
        ListNode head2 = RemoveDuplicatedFromLinkedList.insertAtEnd(head1, 20);
        ListNode head3 = RemoveDuplicatedFromLinkedList.insertAtEnd(head2, 30);
        ListNode head4 = RemoveDuplicatedFromLinkedList.insertAtEnd(head3, 40);
        ListNode head5 = RemoveDuplicatedFromLinkedList.insertAtEnd(head4, 40);
        ListNode head6 = RemoveDuplicatedFromLinkedList.insertAtEnd(head4, 50);
        display(head6);
        removeDuplicatesFromSortedLL(head6);
        System.out.println("====================================");
        //removeDuplicateUnsortedArray(head6);
        display(head6);


    }
}

