package com.greatlearning.iitr.dsa.labsession2;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter the size of the transaction array");
		int size=sc.nextInt();
		
		int[] arr= new int[size];
		
		System.out.println("Enter the values of the transaction array");
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter the total no of targets that needs to be acheived");
		int targetNo=sc.nextInt();
		
		while(targetNo--!= 0) {
			
			int flag=0;
			long target;
			System.out.println("Enter the value of target");
			target=sc.nextInt();
			
			long sum=0;
			
			for(int i=0;i<size;i++) {
				sum=sum+arr[i];
				if(sum>=target) {
					System.out.println("Target acheived after "+(i + 1)+" transactions");
					flag=1;
					break;
				}
			}
			
			if(flag==0) {
				System.out.println("Given target is not achieved");
			}
			
		}
	}

}
