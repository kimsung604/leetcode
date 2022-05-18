package easy.linkedlist;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(0);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(3);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        removeNthFromEnd(listNode1, 2);
    }

    private static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0, head);

        ListNode fast = start;
        ListNode slow = start;
        return null;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
