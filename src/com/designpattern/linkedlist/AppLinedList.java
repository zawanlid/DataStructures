package com.designpattern.linkedlist;

import java.util.Arrays;

public class AppLinedList {

	public static void main(String[] args) {
		CustomLinkedList<Integer> linkedList = new CustomLinkedList<Integer>();
		
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		System.out.println(Arrays.toString(linkedList.toIntegerArray()));
		
	}
}
