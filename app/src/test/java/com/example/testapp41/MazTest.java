package com.example.testapp41;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MazTest {
    Maz maz;

    @Before
    public void setup(){
        maz = new Maz();
    }

    @Test
    public void simpleAdd(){
        assertEquals("4", maz.add("2","2"));
    }
    @Test
    public void doubleAdd(){
        assertEquals("4", maz.add("2","2.0"));
    }

    @Test
    public void letterAdd(){
        assertEquals("Буквы нельзя", maz.add("2","a"));
    }

    @Test
    public void emptyAdd(){
        assertEquals("Пусто", maz.add("2",""));
    }
    @Test
    public void negativeAdd(){
        assertEquals("0", maz.add("-2","2"));
    }
    @Test
    public void simpleDivide(){
        assertEquals("6", maz.divides("12","2"));
    }

    @Test
    public void zeroDivide(){
        assertEquals("на ноль нельзя", maz.divides("12","0"));
    }

    @Test
    public void evenDivide(){
        assertEquals("на четное нельзя", maz.divides("5", "2"));
    }

    @After
    public void detach(){
        maz = null;
    }
}
