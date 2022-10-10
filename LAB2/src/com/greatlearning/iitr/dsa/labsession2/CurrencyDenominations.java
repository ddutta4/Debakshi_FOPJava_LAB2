package com.greatlearning.iitr.dsa.labsession2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CurrencyDenominations {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations ");
		int size=sc.nextInt();
		
        int[] arr= new int[size];
        
		
		System.out.println("Enter the currency denominations value");
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		
		System.out.println("Display the sorted array");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Enter the amount you want to pay");
		int amount=sc.nextInt();
		
		if(amount<arr[0]) {
			System.out.println("Exact amount cannot be paid");
			System.out.println("We can still make this payment with Rs "+arr[0]);
			
		}
		else {
		System.out.println("Your payment approach in order to give min no of notes will be");
		
		
		for(int i=size-1;i>=0;i--) {
			int note_counter= 0;
			if(arr[i]<=amount) {
				note_counter+=amount/arr[i];
				amount%=arr[i];
				System.out.println(arr[i]+":"+note_counter);
			}
		}
			
			if(amount>0) {
				System.out.println("Exact amount cannot be paid");
				System.out.println("The rest of the amount can be paid with Rs "+arr[0]);
			}
		}
	}
}


