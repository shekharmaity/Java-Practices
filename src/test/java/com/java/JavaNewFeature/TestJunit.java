package com.java.JavaNewFeature;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestJunit {

    @Test
    public void testAdd(){
        String str = "Junit is working fine.";
        assertEquals("Junit is working fine.",str);
    }

    @Test
    public void testNegative(){
        String str = "Junit is working fine.";
        assertNotEquals("Junit is working fine",str);
    }
}
