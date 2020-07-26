package epam.com.lambdas_streams;

import java.util.Scanner;
import java.util.ArrayList;

public class AvgofList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of the list: ");
		int n = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			int element = scan.nextInt();
			list.add(element);
		}
		System.out.println("The average of the entered list is :");
		double avg = averageCalculator(list);
		System.out.println(avg);
	}
	
	private static double averageCalculator(ArrayList<Integer> list) {
		double avg = 0.0;
		avg = list.stream().mapToDouble(i -> i).average().getAsDouble();
		return avg;
	}
}
