package com.tts.arrays;


public class Arrays {	
	
	public static void main(String[] args) {
		  double[] exampleArray = {1,5,6,5,4,1};
	
	      double maximum = exampleArray[0];
	
	      int index = 0;
	
	      for (int i = 1; i<exampleArray.length; i++){
	
	           if (exampleArray[ i ] > maximum) {
	
	                maximum = exampleArray[ i ];
	
	                index = i;
	
	           }
	
	      }
	
	      System.out.println(index);    // index = 2, 6 is the largest number in the exampleArray
	      
	      double sum = sumArray(exampleArray);  // sumArray test
	      
	      System.out.println(sum);
	      
	      int[] example = toPower(7, 3);   // toPower test
	      for (int num : example) {
	    	  System.out.println(num);
	      }
	}
	

	public static double sumArray(double[] arr) {
		double sum = 0;
		for (double num : arr) {
			sum += num;
		}
		return sum;
	}
	
	public static int[] toPower(int size, int power) {
		
		int[] arr = new int[size];
		
		arr[0] = 0;
		
		// assuming power is greater than zero
		for (int i = 0; i < size; i++) {
			
			// any power of 0 or 1 is 0 or 1;
			if (i < 2) {
				arr[i] = i;
			} else {
				int num = i;
				for (int j = 1; j < power; j++) {
					num *= i;
				}
				arr[i] = num;				
			}			
			
		}
		
		return arr;
	}
	
}
