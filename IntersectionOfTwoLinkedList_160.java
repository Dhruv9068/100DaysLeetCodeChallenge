package first_ideaprogram.src.Leetcode_100days_Challenge;

public class IntersectionOfTwoLinkedList_160 {
    public static void main(String[] args) {
        IntersectionOfTwoLinkedList_160 solution = new IntersectionOfTwoLinkedList_160();

        // Create your linked lists
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);

        ListNode list2 = new ListNode(5);
        list2.next = list1.next.next; // Creating intersection at node 3

        // Find intersection node
        ListNode intersectionNode = solution.getIntersectionNode(list1, list2);
        if (intersectionNode != null) {
            System.out.println("Intersection node value: " + intersectionNode.val);
        } else {
            System.out.println("No intersection found.");
        }
    }

     ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int length1 = 0, length2 = 0;

        while (temp1 != null) {
            length1++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            length2++;
            temp2 = temp2.next;
        }

        if (length1 > length2) {
            headA = adjustStartingPoint(headA, length1 - length2);
        } else {
            headB = adjustStartingPoint(headB, length2 - length1);
        }

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    ListNode adjustStartingPoint(ListNode head, int steps) {
        while (steps > 0 && head != null) {
            head = head.next;
            steps--;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
