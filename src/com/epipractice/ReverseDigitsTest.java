package com.epipractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseDigitsTest {

    @org.junit.jupiter.api.Test
    void reverseNumber() {
        ReverseDigits rd = new ReverseDigits();

        assertEquals(123,rd.reverseNumber(321));
    }
    @Test
    void isPalindromeNum() {
        ReverseDigits rd = new ReverseDigits();

        assertEquals(false,rd.isPalindromeNumber(12347321));
    }
}