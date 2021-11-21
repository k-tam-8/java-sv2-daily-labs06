package day02.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersMainTest {
    @Test
    void testOne() {
        PerfectNumbers perfectNumbers = new PerfectNumbers();
        assertTrue(perfectNumbers.isPerfectNumber(8128));
        assertFalse(perfectNumbers.isPerfectNumber(15678));
    }
}