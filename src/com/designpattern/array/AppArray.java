package com.designpattern.array;

import java.util.Arrays;

public class AppArray {
    public static void main(String[] args) {

        CustomArrayList myArrList = new CustomArrayList();
        myArrList.add(10);
        myArrList.add(60);
        myArrList.add(40);
        myArrList.add(20);

        System.out.println(Arrays.toString(myArrList.reverse()));
    }
}
