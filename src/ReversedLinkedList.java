public class ReversedLinkedList {

//    Reverse a singly linked list.
//
//            Example:
//
//    Input: 1->2->3->4->5->NULL
//    Output: 5->4->3->2->1->NULL
//    Follow up:
//
//    A linked list can be reversed either iteratively or recursively. Could you implement both?

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }

    public ListNode reverseListIteratively(ListNode head) {

        if (head == null) return null;

        ListNode cursor = head;
        ListNode prevCursor = null;
        while (cursor != null){
            ListNode succeedCursor = cursor.next;
            cursor.next = prevCursor;
            prevCursor = cursor;
            cursor = succeedCursor;
        }
        head = prevCursor;
        return head;
    }

    public ListNode reverseListRecursively(ListNode head) {
        return reverse(null, head);
    }

    private ListNode reverse(ListNode prevCursor, ListNode cursor){
        if (cursor == null){
            return prevCursor;
        }

        ListNode succceedCursor = cursor.next;
        cursor.next = prevCursor;
        return reverse(cursor, succceedCursor);
    }
}
