package Qspiders_java;

import java.util.Scanner;

public class Prime {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.print("Enter the num : ");	
	int num=sc.nextInt();
	String ans="";
	for (int i = 1; i < num; i++) {
		if(num == 0 || num == 1) {
			ans="Not a prime nor composite";
			break;
		}
		else if(num % i ==0) {
			ans="Not a prime";
			break;
		}
		else {
			ans="prime";
			break;
		}
		
	}
	System.out.println(ans);
	}

}
