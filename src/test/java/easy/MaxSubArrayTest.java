package easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxSubArrayTest {

    @Test
    public void testMaxSubArray() {
        MaxSubArray maxSubArray = new MaxSubArray();

        // Test Case 1: Regular input
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected1 = 6; // The subarray [4, -1, 2, 1] has the maximum sum
        assertEquals(expected1, maxSubArray.maxSubArray(nums1));

        // Test Case 2: All negative numbers
        int[] nums2 = {-1, -2, -3, -4};
        int expected2 = -1; // The largest value is the least negative number
        assertEquals(expected2, maxSubArray.maxSubArray(nums2));

        // Test Case 3: Single element
        int[] nums3 = {5};
        int expected3 = 5; // The only element is the maximum subarray sum
        assertEquals(expected3, maxSubArray.maxSubArray(nums3));

        // Test Case 4: All positive numbers
        int[] nums4 = {1, 2, 3, 4};
        int expected4 = 10; // The sum of the entire array is the maximum subarray sum
        assertEquals(expected4, maxSubArray.maxSubArray(nums4));

        // Test Case 5: Mixed positive and negative numbers
        int[] nums5 = {3, -2, 5, -1};
        int expected5 = 6; // The subarray [3, -2, 5] has the maximum sum
        assertEquals(expected5, maxSubArray.maxSubArray(nums5));

        // Test Case 6: Array with zeros
        int[] nums6 = {0, -1, 0, 0, 0};
        int expected6 = 0; // The maximum subarray sum is 0
        assertEquals(expected6, maxSubArray.maxSubArray(nums6));
    }
}
