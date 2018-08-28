public class DeleteDuplicates {
//    Given a sorted linked list, delete all duplicates such that each element appear only once.
//
//    Example 1:
//
//    Input: 1->1->2
//    Output: 1->2
//    Example 2:
//
//    Input: 1->1->2->3->3
//    Output: 1->2->3


    //ListNode definition
    private static class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }


    public static ListNode buildListNode(int nums[]) {


        ListNode head = null;
        ListNode cursor = null;
        for (int i = 0; i < nums.length; i++) {

            if (head == null) {
                head = new ListNode(nums[i]);
                cursor = head;
            } else {
                cursor.next = new ListNode(nums[i]);
                cursor = cursor.next;
            }

        }

        return head;
    }

    public static void printListNode(ListNode head) {

        ListNode cursor = head;
        while (cursor.next != null) {
            System.out.print(cursor.val);
            cursor = cursor.next;
            System.out.print("->");
        }

        System.out.print(cursor.val);

    }


    public static ListNode deleteDuplicates(ListNode head) {


        ListNode cursor = head;
        while (cursor != null &&  cursor.next != null) {
            ListNode duplicateCursor;
            if (cursor.val == cursor.next.val) {
                duplicateCursor = cursor.next;
                cursor.next = duplicateCursor.next;
            }else {
                cursor = cursor.next;
            }

        }


        return head;
    }

    public static void main(String args[]) {
        int nums[] = new int[]{1,1,2,3,4,4,5};
        ListNode head = buildListNode(nums);
        printListNode(deleteDuplicates(head));
    }

}
