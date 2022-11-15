package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldFindTheElement()
    {

        int[] arr = new int[]{-100, -8, 0, 1, 10, 10, 15, 22, 31};

        ArrUtils arrUtils = new ArrUtils();

        assertEquals(7, arrUtils.mrBinSearch(arr, 22));
        assertEquals(1, arrUtils.mrBinSearch(arr, -8));

        assertNotEquals(-1, arrUtils.mrBinSearch(arr, 10));

        assertEquals(-1, arrUtils.mrBinSearch(arr, 100));
        assertEquals(-1, arrUtils.mrBinSearch(arr, 2));



    }

    @Test
    public void shouldSort()
    {

        int[] arr = new int[]{1,-8,15,22,500,31,10,10,0};
        int[] arr1 = new int[]{-8, 0, 1, 10, 10, 15, 22, 31,500};

        ArrUtils arrUtils = new ArrUtils();
        arrUtils.sortBubble(arr);

        Assert.assertArrayEquals(arr1, arr);

    }

}
