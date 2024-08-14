package easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClimbingStairsTest {

    @Test
    public void testClimbStairs() {
        ClimbingStairs climbingStairs = new ClimbingStairs();

        // Test Case 1: Base case where n = 1
        int n1 = 1;
        int expected1 = 1; // Only one way to climb one step
        assertEquals(expected1, climbingStairs.climbStairs(n1));

        // Test Case 2: Base case where n = 2
        int n2 = 2;
        int expected2 = 2; // Two ways to climb two steps: (1+1) or (2)
        assertEquals(expected2, climbingStairs.climbStairs(n2));

        // Test Case 3: Regular case where n = 3
        int n3 = 3;
        int expected3 = 3; // Three ways to climb three steps: (1+1+1), (1+2), (2+1)
        assertEquals(expected3, climbingStairs.climbStairs(n3));

        // Test Case 4: Regular case where n = 4
        int n4 = 4;
        int expected4 = 5; // Five ways to climb four steps
        assertEquals(expected4, climbingStairs.climbStairs(n4));

        // Test Case 5: Larger input where n = 5
        int n5 = 5;
        int expected5 = 8; // Eight ways to climb five steps
        assertEquals(expected5, climbingStairs.climbStairs(n5));

        // Test Case 6: Larger input where n = 10
        int n6 = 10;
        int expected6 = 89; // 89 ways to climb ten steps
        assertEquals(expected6, climbingStairs.climbStairs(n6));
    }
}
