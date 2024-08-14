package easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortedArraysTest {

    @Test
    public void testMerge() {
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();

        // Test Case 1: Normal case with both arrays having elements
        int[] nums1_1 = {1, 2, 3, 0, 0, 0};
        int m1 = 3;
        int[] nums2_1 = {2, 5, 6};
        int n1 = 3;
        mergeSortedArrays.merge(nums1_1, m1, nums2_1, n1);
        int[] expected1 = {1, 2, 2, 3, 5, 6};
        assertArrayEquals(expected1, nums1_1);

        // Test Case 2: nums2 is empty
        int[] nums1_2 = {1, 2, 3, 0, 0, 0};
        int m2 = 3;
        int[] nums2_2 = {};
        int n2 = 0;
        mergeSortedArrays.merge(nums1_2, m2, nums2_2, n2);
        int[] expected2 = {1, 2, 3};
        assertArrayEquals(expected2, nums1_2);

        // Test Case 3: nums1 is empty
        int[] nums1_3 = {0, 0, 0};
        int m3 = 0;
        int[] nums2_3 = {1, 2, 3};
        int n3 = 3;
        mergeSortedArrays.merge(nums1_3, m3, nums2_3, n3);
        int[] expected3 = {1, 2, 3};
        assertArrayEquals(expected3, nums1_3);

        // Test Case 4: Both arrays have some elements
        int[] nums1_4 = {1, 0};
        int m4 = 1;
        int[] nums2_4 = {2};
        int n4 = 1;
        mergeSortedArrays.merge(nums1_4, m4, nums2_4, n4);
        int[] expected4 = {1, 2};
        assertArrayEquals(expected4, nums1_4);

        // Test Case 5: nums1 is larger than nums2
        int[] nums1_5 = {1, 3, 5, 0, 0, 0};
        int m5 = 3;
        int[] nums2_5 = {2, 4, 6};
        int n5 = 3;
        mergeSortedArrays.merge(nums1_5, m5, nums2_5, n5);
        int[] expected5 = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected5, nums1_5);

        // Test Case 6: nums1 and nums2 have overlapping elements
        int[] nums1_6 = {1, 1, 3, 0, 0, 0};
        int m6 = 3;
        int[] nums2_6 = {1, 2, 3};
        int n6 = 3;
        mergeSortedArrays.merge(nums1_6, m6, nums2_6, n6);
        int[] expected6 = {1, 1, 1, 2, 3, 3};
        assertArrayEquals(expected6, nums1_6);
    }
}
