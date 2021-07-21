package LinkedListExample;

public class BinarySearchOnLinkedList {
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

    public static ListNode insertAtEndOfLinkedList(ListNode head, int data) {
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

    public static ListNode findNodeInLinkList(ListNode head, ListNode tail, int value) {
        while (tail == null || tail != head) {
            ListNode middleNode = middleNode(head, tail);
            if (middleNode.data == value) {
                return middleNode;
            } else if (middleNode.data < value) {
                head = middleNode;
            } else if (middleNode.data > value) {
                tail = middleNode.next;
            }
        }
        return null;
    }

    public static ListNode middleNode(ListNode head, ListNode tail) {

        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != tail) {
            fast = fast.next;
            if (fast != tail) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode tail = null;
        int value = 30;
        ListNode head = new ListNode(10);
        ListNode h1 = BinarySearchOnLinkedList.insertAtEndOfLinkedList(head, 20);
        ListNode h2 = BinarySearchOnLinkedList.insertAtEndOfLinkedList(h1, 30);
        ListNode h3 = BinarySearchOnLinkedList.insertAtEndOfLinkedList(h2, 40);
        BinarySearchOnLinkedList.display(h3);
        ListNode node = BinarySearchOnLinkedList.findNodeInLinkList(h3, tail, value);
        if (node.data == value) {
            System.out.println("node found successfull !");
        } else {
            System.out.println("Not Found!");
        }
    }
}
