package easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BestTimeStonksTest {

    @Test
    public void testMaxProfit() {
        BestTimeStonks bestTimeStonks = new BestTimeStonks();

        // Test Case 1: Regular input
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int expected1 = 5; // Buy at 1, sell at 6
        assertEquals(expected1, bestTimeStonks.maxProfit(prices1));

        // Test Case 2: Decreasing prices
        int[] prices2 = {7, 6, 4, 3, 1};
        int expected2 = 0; // No profit possible
        assertEquals(expected2, bestTimeStonks.maxProfit(prices2));

        // Test Case 3: Empty array
        int[] prices3 = {};
        int expected3 = 0; // No transactions possible
        assertEquals(expected3, bestTimeStonks.maxProfit(prices3));

        // Test Case 4: Single price
        int[] prices4 = {5};
        int expected4 = 0; // No transactions possible
        assertEquals(expected4, bestTimeStonks.maxProfit(prices4));

        // Test Case 5: Multiple transactions
        int[] prices5 = {3, 3, 5, 0, 0, 3, 1, 4};
        int expected5 = 4; // Buy at 0, sell at 4
        assertEquals(expected5, bestTimeStonks.maxProfit(prices5));

        // Test Case 6: Prices with no increase
        int[] prices6 = {1, 1, 1, 1, 1};
        int expected6 = 0; // No profit possible
        assertEquals(expected6, bestTimeStonks.maxProfit(prices6));

        // Test Case 7: Prices with all increasing
        int[] prices7 = {1, 2, 3, 4, 5};
        int expected7 = 4; // Buy at 1, sell at 5
        assertEquals(expected7, bestTimeStonks.maxProfit(prices7));

        // Test Case 8: Prices with fluctuating values
        int[] prices8 = {2, 4, 1, 8, 5, 7, 3, 6};
        int expected8 = 7; // Buy at 1, sell at 8
        assertEquals(expected8, bestTimeStonks.maxProfit(prices8));
    }
}
