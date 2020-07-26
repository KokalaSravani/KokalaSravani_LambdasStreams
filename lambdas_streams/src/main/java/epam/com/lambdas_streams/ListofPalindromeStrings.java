package epam.com.lambdas_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ListofPalindromeStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = scan.nextInt();
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			String element = scan.next();
			list.add(element);
		}
		System.out.println("Palindrome strings are :");
		List<String> resultList = palindromeStrings(list);
		System.out.println(resultList);
	}
	public static List<String> palindromeStrings(List<String> list) {
		List<String> res = list.stream().filter(str -> str.equals(reverse(str))).collect(Collectors.toList());
		return res;
	}

	public static String reverse(String str) {
		String reverse = "";
		for(int i = str.length()-1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}

}
