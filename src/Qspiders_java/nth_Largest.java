package Qspiders_java;

import java.util.Scanner;

public class nth_Largest {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// Find Nth largest 
		System.out.print("Enter the choice : ");
		int choice=sc.nextInt();
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
		System.out.println(choice+" largest is : "+nums[nums.length-choice]);
	}

}
/*
 output:
 	Enter the choice : 2
	2 largest is : 8

 */
 
