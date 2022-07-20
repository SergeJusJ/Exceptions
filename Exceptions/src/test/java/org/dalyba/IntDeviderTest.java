package org.dalyba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class IntDeviderTest {

    IntDevider intDevider = new IntDevider();
    String[] skaicReiks = new String[]{"6", "2"};

    @Test
    void testDividerN6fromNum2()  throws ArgZerroException{
        int actualResult = intDevider.divide(skaicReiks);
        int expResult = 2;

        //assertTrue(actualResult == expResult, "Expectd 3 not match actual");
        assertEquals(actualResult == expResult, "Expectd 3 not match actual");
    }
}