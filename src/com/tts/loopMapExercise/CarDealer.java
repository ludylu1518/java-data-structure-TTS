package com.tts.loopMapExercise;

import java.util.HashMap;
import java.util.Scanner;

public class CarDealer {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("Civic", "Honda");
		map.put("Forester", "Subaru");
		map.put("Terrain", "GMC");
		map.put("Giulia", "Alfa Romeo");
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("Please enter the model of the car you are looking for! To exit enter exit");
			
			String model = scan.nextLine();
			
			if (model.equals("exit")) {
				System.out.println("Have a nice day!");
				break;
			}
			
			if (map.containsKey(model)) {
				System.out.printf("Oh, you're looking for a %s? Our %s section is over there...\n", model, map.get(model));
			} else {
				System.out.println("I'm sorry but we don't have the models you are looking for.");
			}
		}
		
	}
	
}
