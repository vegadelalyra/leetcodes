package easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {

    @Test
    public void testTwoSum() throws IllegalAccessException {
        // Test Case 1: Normal case with a valid solution
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        assertArrayEquals(expected1, TwoSum.twoSum(nums1, target1));

        // Test Case 2: List with negative numbers
        int[] nums2 = {-1, -2, -3, -4, -5};
        int target2 = -8;
        int[] expected2 = {2, 4};
        assertArrayEquals(expected2, TwoSum.twoSum(nums2, target2));

        // Test Case 3: List with no solution
        int[] nums3 = {1, 2, 3, 4};
        int target3 = 10;
        Exception exception = assertThrows(IllegalAccessException.class, () -> {
            TwoSum.twoSum(nums3, target3);
        });
        assertEquals("No two sum solution", exception.getMessage());

        // Test Case 4: Multiple valid pairs
        int[] nums4 = {1, 3, 3, 5};
        int target4 = 6;
        int[] expected4 = {1, 2}; // [3, 3] can be at indices [1, 2]
        assertArrayEquals(expected4, TwoSum.twoSum(nums4, target4));

        // Test Case 5: Solution is at the start of the array
        int[] nums5 = {3, 2, 4};
        int target5 = 6;
        int[] expected5 = {1, 2}; // [2, 4] can be at indices [1, 2]
        assertArrayEquals(expected5, TwoSum.twoSum(nums5, target5));

        // Test Case 6: Solution is at the end of the array
        int[] nums6 = {3, 5, 7, 8};
        int target6 = 15;
        int[] expected6 = {2, 3}; // [7, 8] can be at indices [2, 3]
        assertArrayEquals(expected6, TwoSum.twoSum(nums6, target6));
    }
}
