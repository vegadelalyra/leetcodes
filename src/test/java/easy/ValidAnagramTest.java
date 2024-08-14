package easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidAnagramTest {

    @Test
    public void testIsAnagram() {
        // Test Case 1: Normal case with anagrams
        String s1 = "listen";
        String t1 = "silent";
        assertTrue(ValidAnagram.isAnagram(s1, t1));

        // Test Case 2: Normal case with non-anagrams
        String s2 = "hello";
        String t2 = "world";
        assertFalse(ValidAnagram.isAnagram(s2, t2));

        // Test Case 3: Empty strings
        String s3 = "";
        String t3 = "";
        assertTrue(ValidAnagram.isAnagram(s3, t3));

        // Test Case 4: One empty string
        String s4 = "a";
        String t4 = "";
        assertFalse(ValidAnagram.isAnagram(s4, t4));

        // Test Case 5: Strings with different lengths
        String s5 = "abc";
        String t5 = "ab";
        assertFalse(ValidAnagram.isAnagram(s5, t5));

        // Test Case 6: Strings with the same characters but different counts
        String s6 = "aabbcc";
        String t6 = "aabbccc";
        assertFalse(ValidAnagram.isAnagram(s6, t6));

        // Test Case 7: Strings with special characters
        String s7 = "anagram!";
        String t7 = "nag a ram!";
        assertTrue(ValidAnagram.isAnagram(s7.replace(" ", ""), t7.replace(" ", ""))); // Remove spaces
    }
}
