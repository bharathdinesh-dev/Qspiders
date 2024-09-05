package Qspiders_java;

import java.util.Arrays;

public class Sort_Ascending {
	public static void main(String[] args) {
		int[] nums= {9,1,8,3,7,2,6,5};
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println("Ascending order : "+Arrays.toString(nums));
	}

}
/*
output:
Ascending order : [1, 2, 3, 5, 6, 7, 8, 9]
*/