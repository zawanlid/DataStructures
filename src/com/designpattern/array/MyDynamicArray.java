package com.designpattern.array;

public class MyDynamicArray {

	private int nums[] = new int[5];
	private int count;
	
	public void add(int val) {
		
		if (count >= nums.length) {
			int newNums[] = new int[nums.length * 2];
			
			for (int i=0; i < count; i++) {
				newNums[i] = nums[i];
			} 
			
			nums = newNums;
		}
		
		nums[count++] = val;
	}
	
	public void delete (int idx) {
		
		if (count < 0 || idx >= count)
			throw new IllegalArgumentException();
		
		for (int i=idx; i < (count - 1); i++) {
			nums[i] = nums[i+1];
		}
		
		count--;
	}
	
	public void currLength () {
		System.out.println(count);
	}
	
	public void maxLength () {
		System.out.println(nums.length);
	}
	
	public void print () {
		for (int i=0; i < count; i++) {
			System.out.println(nums[i]);
		}
	}
}
