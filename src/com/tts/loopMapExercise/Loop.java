package com.tts.loopMapExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Loop {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 5 numbers one by one as instructed below: ");
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			int index = i + 1;
			System.out.printf("%d: ", index);
			
			int num = scan.nextInt();
			arr.add(num);
		}
		
		int sum = 0;
		int product = 1;
		int largest = arr.get(0);
		int smallest = arr.get(0);
		
		for (int num : arr) {
			sum += num;
			product *= num;
			
			if (num > largest) {
				largest = num;
			}
			
			if (num < smallest) {
				smallest = num;
			}
		}
		
		System.out.printf("The sum of all 5 numbers is: %d\n", sum);
		System.out.printf("The product of all 5 numbers is: %d\n", product);
		System.out.printf("The largest of all 5 numbers is: %d\n", largest);
		System.out.printf("The smallest of all 5 numbers is: %d\n", smallest);
		
	}

}
 