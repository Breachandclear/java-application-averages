package big_o;

import java.util.ArrayList;
import java.util.Scanner;


public class October23 {
	public static void main(String[] args) {
		ArrayList<Double> numbers = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter double numbers : ");
		
		double input; 
		while (true) {
			input = scanner.nextDouble();
			
			if (input == -1 ) {
				break;
			} else {
				numbers.add(input);			
			}	
		}
		scanner.close();
		if (numbers.isEmpty()) {
			System.out.println("Nothing.");
		} else {
			double sum = 0;
			for (Double number : numbers) {
				sum += number;
			}
			
			double average = sum / numbers.size();
			int numCount = numbers.size();
			
			System.out.println("Average: " + average);
			System.out.println("Number of numbers: " + numCount);
		}
	}
}