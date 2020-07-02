package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class FrequencyQueriesProcessorTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test2() {
        var b = new int[][]
                {
                        new int[]{3,4},
                        new int[]{2,1003},
                        new int[]{1,16},
                        new int[]{3,1},
                };
        var fqp = new FrequencyQueriesProcessor();
        var list = fqp.process(b);

        assertTrue(list.get(0) == 0);
        assertTrue(list.get(1) == 1);
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void test1() {
        var b = new int[][]
                {
                        new int[]{1,5},
                        new int[]{1,6},
                        new int[]{3,2},
                        new int[]{1,10},
                        new int[]{1,10},
                        new int[]{1,6},
                        new int[]{2,5},
                        new int[]{3,2},
                };


        var fqp = new FrequencyQueriesProcessor();
        var list = fqp.process(b);
        assertTrue(list.get(0) == 0);
        assertTrue(list.get(1) == 1);
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void test3() {
        var b = new int[][]
                {
                        new int[]{1,3},
                        new int[]{2,3},
                        new int[]{3,2},
                        new int[]{1,4},
                        new int[]{1,5},
                        new int[]{1,5},
                        new int[]{1,4},
                        new int[]{3,2},
                        new int[]{2,4},
                        new int[]{3,2},
                };


        var fqp = new FrequencyQueriesProcessor();
        var list = fqp.process(b);
        assertTrue(list.get(0) == 0);
        assertTrue(list.get(1) == 1);
        assertTrue(list.get(2) == 1);
    }
}
