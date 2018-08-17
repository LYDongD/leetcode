import java.util.List;
import java.util.Stack;

public class MergeList {


    //Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
    //Example:
    //Input: 1->2->4, 1->3->4
    //Output: 1->1->2->3->4->4


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {


        //定义傀儡节点
        ListNode dummy = new ListNode(0);

        //形成最终链表的指针
        ListNode current = dummy;

        //两个中有一个不为空都进行循环
        while (l1 != null || l2 != null){

            if (l2 == null || (l1 != null && l1.val < l2.val)){
                current.next = l1;
                l1 = l1.next;
                current = current.next;
            }else {
                current.next = l2;
                l2 = l2.next;
                current = current.next;
            }
        }

        //返回傀儡的下一个节点
        return dummy.next;
    }

    public void pointToCursor(ListNode mergeCursor, ListNode goalCursor){
        if (mergeCursor == null){
            mergeCursor = goalCursor;
        }else {
            mergeCursor.next = goalCursor;
            mergeCursor = mergeCursor.next;
        }
        goalCursor = goalCursor.next;
    }


    //build ListNode from int[]
    private ListNode buildListNode(int[] nums) {
        ListNode head = null;
        ListNode cursor = null;
        for (int num : nums) {
            ListNode currentNode = new ListNode(num);
            if (head == null) {
                head = currentNode;
                cursor = currentNode;
            } else {
                cursor.next = currentNode;
                cursor = currentNode;
            }
        }
        return head;
    }

    //print ListNode whith right arrow connecting nodes like '1->3->4'
    private void printListNode(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
            if (node != null){
                System.out.print("->");
            }
        }
    }

    public static void main(String args[]) {

        MergeList mergeList = new MergeList();
        ListNode l1 = mergeList.buildListNode(new int[]{1,2,4});
        ListNode l2 = mergeList.buildListNode(new int[]{1,3,4,5});
        mergeList.printListNode(mergeList.mergeTwoLists(l1, l2));
    }


}
