package org.example;

import java.util.Arrays;

public class ArrUtils {

    public int[] swap(int[] arr, int i, int j){

        int tmp = arr[i];

        arr[i] = arr[j];
        arr[j] = tmp;

        System.out.println(Arrays.toString(arr));

        return arr;

    }

    public int[] sortBubble(int[] arr){

        for (int i = arr.length; i >=0 ; i--) {

            for (int j = 0; j < i-1; j++) {

                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }

            }
            
        }

        return arr;

    }

    public int mrBinSearch(int[] arr, int goal){

        int index = -1;

        //arr = sortBubble(arr);

        int i = 0;
        int j = arr.length;

        while (true){

            //System.out.println(Arrays.toString(arr));

            int tmpIndex = (j+i)/2;

            if(tmpIndex < 0 || tmpIndex >= arr.length){
                break;
            }

            if(arr[tmpIndex]==goal) {
                index = tmpIndex;
                break;
            }

            if(arr[tmpIndex]<goal){
                i = tmpIndex+1;
            } else {
                j = tmpIndex-1;
            }

            if(j < i || i > j){
                break;
            }

            /*
            //Обнулить часть массива для красоты
            for (int k = 0; k < i; k++) {
                arr[k] = 0;
            }

            for (int k = j+1; k < arr.length; k++) {
                arr[k] = 0;
            }*/

        }

        return index;

    }

}
