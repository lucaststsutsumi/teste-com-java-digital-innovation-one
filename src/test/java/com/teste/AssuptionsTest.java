package com.teste;

import org.junit.Test;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class AssuptionsTest {
    @Test
    void trueAssuptions() {
        assumeTrue(5 > 1);
        assertEquals(5 + 2, 7);
    }

    @Test
    void falseAssuptions() {
        assumeFalse(5 < 1);
        assertEquals(5 + 2, 7);
    }

    @Test
    void assuptionsThat() {
        String str = "Just a string";
        assumingThat(
                str.equals("Just a string"),
                () -> assertEquals(5 + 2, 7)
        );
        assertEquals(5 + 2, 7);
    }
}
