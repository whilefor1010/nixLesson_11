package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        int[] arr = new int[]{1,-8,15,22,31,10,10,0};

        System.out.println(Arrays.toString(arr));

        ArrUtils arrUtils = new ArrUtils();

        arrUtils.sortBubble(arr);

        System.out.println(Arrays.toString(arr));

        int goal = -8;
        System.out.println("###################### Searching... ######################");
        System.out.println(goal);

        System.out.println(arrUtils.mrBinSearch(arr,goal));

    }
}
