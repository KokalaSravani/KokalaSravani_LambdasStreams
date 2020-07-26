package epam.com.lambdas_streams;

import java.util.*;
import java.util.stream.Collectors;

public class Strings_A3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			String element = scan.next();
			list.add(element);
		}
		System.out.println("The strings starting with the letter 'a' and of length 3 are : ");
		List<String> resultList = startingwithA(list);
		System.out.println(resultList);
	}
	private static List<String> startingwithA(List<String> list) {
		List<String> result = list.stream().filter(str -> str.startsWith("a") && str.length() == 3).collect(Collectors.toList());
		return result;
	}
}
