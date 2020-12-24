package com.teste;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class AssertJunit5Test {

    @Test
    void testAssertArrayEquals() {
        byte[] esperado = "teste".getBytes();
        byte[] atual = "teste".getBytes();
        assertArrayEquals(esperado, atual);
    }

    @Test
    void testAssertEquals() {
        assertEquals("text", "text");
    }

    @Test
    void testAssertFalse() {
        assertFalse(false);
    }

    @Test
    void testAssertNotNull() {
        assertNotNull(new Object());
    }

    @Test
    void testAssertNotSame() {
        assertNotSame(new Object(), new Object());
    }

    @Test
    void testAssertNull() {
        assertNull(null);
    }

    @Test
    void testAssertSame() {
        Integer aNumber = Integer.valueOf(965);

        assertSame(aNumber, aNumber);
    }

    @Test
    void testLambdaExpressions() {
        assertTrue(
                Stream.of(1, 2, 3)
                        .mapToInt(i -> i)
                        .sum() > 5, () -> "sum should be grater than 5"
        );
    }

    @Test
    void testGroupAssertions() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertAll("numbers",
                () -> assertEquals(numbers[0], 1),
                () -> assertEquals(numbers[3], 3),
                () -> assertEquals(numbers[4], 1)
        );
    }
}
