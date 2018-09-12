import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

//    Given a linked list, determine if it has a cycle in it.
//
//    Follow up:
//    Can you solve it without using extra space?


    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
            this.next = null;
        }
    }

    //use hash set to judge duplicate
    public static boolean hasCycle1(ListNode head){

        if (head == null) return false;

        Set<ListNode> nodeSet = new HashSet<>();

        ListNode current = head;

        //cycle will never come to null
        while (current != null){

            if (nodeSet.contains(current)){
                return true;
            }

            nodeSet.add(current);
            current = current.next;
        }

        return false;
    }

    public static boolean hasCycle2(ListNode head){

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }

        }

        return false;


    }

}
