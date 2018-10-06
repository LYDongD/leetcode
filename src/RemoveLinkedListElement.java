public class RemoveLinkedListElement {

//    Remove all elements from a linked list of integers that have value val.
//
//            Example:
//
//    Input:  1->2->6->3->4->5->6, val = 6
//    Output: 1->2->3->4->5

    private static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode removeElements(ListNode head, int val) {

        ListNode cursor = head;
        ListNode lastCursor = null;
        while (cursor != null){

            ListNode nextCursor = cursor.next;

            //node to be removed
            if (cursor.val == val){

                //remove first node
                if (lastCursor == null){
                    head = cursor.next;
                }else {
                    lastCursor.next = cursor.next;
                }

                //ready for gc
                cursor.next = null;
            }else {
                lastCursor = cursor;
            }

            cursor = nextCursor;
        }

        return head;
    }


}
