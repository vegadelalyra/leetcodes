package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import DataStructs.ListNode;

public class MergeTwoSortedListsTest {

    @Test
    public void testMergeTwoLists() {
        MergeTwoSortedLists mergeLists = new MergeTwoSortedLists();

        // Test Case 1: Both lists are non-empty
        ListNode l1_1 = createList(new int[]{1, 2, 4});
        ListNode l2_1 = createList(new int[]{1, 3, 4});
        ListNode merged1 = mergeLists.mergeTwoLists(l1_1, l2_1);
        assertEquals("1->1->2->3->4->4", listToString(merged1));

        // Test Case 2: One list is empty
        ListNode l1_2 = createList(new int[]{1});
        ListNode l2_2 = createList(new int[]{2, 3, 4});
        ListNode merged2 = mergeLists.mergeTwoLists(l1_2, l2_2);
        assertEquals("1->2->3->4", listToString(merged2));

        // Test Case 3: Both lists are empty
        ListNode l1_3 = null;
        ListNode l2_3 = null;
        ListNode merged3 = mergeLists.mergeTwoLists(l1_3, l2_3);
        assertEquals("", listToString(merged3));

        // Test Case 4: One list is empty
        ListNode l1_4 = null;
        ListNode l2_4 = createList(new int[]{0});
        ListNode merged4 = mergeLists.mergeTwoLists(l1_4, l2_4);
        assertEquals("0", listToString(merged4));

        // Test Case 5: Both lists have the same elements
        ListNode l1_5 = createList(new int[]{2, 5, 7});
        ListNode l2_5 = createList(new int[]{2, 5, 7});
        ListNode merged5 = mergeLists.mergeTwoLists(l1_5, l2_5);
        assertEquals("2->2->5->5->7->7", listToString(merged5));
    }

    // Helper method to create a linked list from an array
    private ListNode createList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to convert a linked list to a string for easy comparison
    private String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            if (sb.length() > 0) sb.append("->");
            sb.append(head.val);
            head = head.next;
        }
        return sb.toString();
    }
}
