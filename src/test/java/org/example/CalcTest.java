package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {
    @Test
    public void sumPositiveTest(){
        assertEquals("5", Main.calc("1 + 4"));
    }
    @Test
    public void subPositiveTest(){
        assertEquals("-3", Main.calc("1 - 4"));
    }
    @Test
    public void multPositiveTest(){
        assertEquals("48", Main.calc("6 * 8"));
    }
    @Test
    public void divPositiveTest(){
        assertEquals("3", Main.calc("9 / 3"));
    }
    @Test
    public void divWithRemainderPositiveTest(){
        assertEquals("3", Main.calc("11 / 3"));
    }
}