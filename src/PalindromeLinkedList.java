import java.util.List;

public class PalindromeLinkedList {

//    Given a singly linked list, determine if it is a palindrome.
//
//    Example 1:
//
//    Input: 1->2
//    Output: false
//    Example 2:
//
//    Input: 1->2->2->1
//    Output: true
//    Follow up:
//    Could you do it in O(n) time and O(1) space?

    private static class ListNode{
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null){
            return true;
        }

        //1 find the middle list node
        ListNode middle = findMiddleListNode(head);

        //2 reverse the last half part
        middle.next = reverse(middle.next);

        //3 compare two half
        boolean result = true;
        ListNode left = head;
        ListNode right = middle.next;
        while (left != middle){
            if (left.val != right.val){
                result = false;
                break;
            }
            left = left.next;
            right = right.next;
        }

        //4 reverse back
        middle.next = reverse(middle.next);

        return result;

    }

    private ListNode findMiddleListNode(ListNode head){

        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    private ListNode reverse(ListNode head){
        if (head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        while (head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

}
