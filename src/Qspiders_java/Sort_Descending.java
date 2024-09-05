package Qspiders_java;

import java.util.Arrays;

public class Sort_Descending {
	public static void main(String[] args) {
		int[] nums= {9,1,8,3,7,2,6,5};
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println("Descending order : "+Arrays.toString(nums));
	}
}
/*
Descending order : [9, 8, 7, 6, 5, 3, 2, 1]
*/