package com.designpattern.array;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList<Integer> extends ArrayList<Integer> {

    public CustomArrayList() {}

    public Integer max () {
        Integer arr[] = (Integer[]) super.toArray();
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public Integer [] reverse () {
        Integer arr[] = (Integer[]) super.toArray();
        Integer temp;

        for (int i=0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = temp;
        }
        return arr;
    }
}
