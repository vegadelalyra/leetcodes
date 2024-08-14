package easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NeedleInHaystackTest {

    @Test
    public void testStrStr() {
        NeedleInHaystack needleInHaystack = new NeedleInHaystack();

        // Test Case 1: Needle is found in the haystack
        String haystack1 = "hello";
        String needle1 = "ll";
        int expected1 = 2;
        assertEquals(expected1, needleInHaystack.strStr(haystack1, needle1));

        // Test Case 2: Needle is not found in the haystack
        String haystack2 = "hello";
        String needle2 = "world";
        int expected2 = -1;
        assertEquals(expected2, needleInHaystack.strStr(haystack2, needle2));

        // Test Case 3: Needle is empty
        String haystack3 = "hello";
        String needle3 = "";
        int expected3 = 0;
        assertEquals(expected3, needleInHaystack.strStr(haystack3, needle3));

        // Test Case 4: Haystack is empty
        String haystack4 = "";
        String needle4 = "a";
        int expected4 = -1;
        assertEquals(expected4, needleInHaystack.strStr(haystack4, needle4));

        // Test Case 5: Needle is longer than haystack
        String haystack5 = "short";
        String needle5 = "longerneedle";
        int expected5 = -1;
        assertEquals(expected5, needleInHaystack.strStr(haystack5, needle5));

        // Test Case 6: Needle is at the beginning of the haystack
        String haystack6 = "startmiddleend";
        String needle6 = "start";
        int expected6 = 0;
        assertEquals(expected6, needleInHaystack.strStr(haystack6, needle6));

        // Test Case 7: Needle is at the end of the haystack
        String haystack7 = "startmiddleend";
        String needle7 = "end";
        int expected7 = 11;
        assertEquals(expected7, needleInHaystack.strStr(haystack7, needle7));
    }
}
