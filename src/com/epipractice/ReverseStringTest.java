package com.epipractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseString() {
        ReverseString rs = new ReverseString();

        assertEquals("dcba",rs.reverseString("abcd"));
    }
    @Test
    void isPalindrome() {
        ReverseString rs = new ReverseString();

        assertEquals(false,rs.isPalindrome("abcdeidcba"));
    }
}