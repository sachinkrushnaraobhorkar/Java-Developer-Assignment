package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "readable content of a page when looking at its layout";
		String s[] = str.split(" ");
		Map<String, Integer> hm = new HashMap<>();
//      create a HashMap to store the frequency of each word
		for (int i = 0; i < s.length; i++) {

			hm.put(s[i], s[i].length());
		}
		List<Map.Entry<String, Integer>> sortString = new ArrayList<>(hm.entrySet());
		sortString.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

		for (Map.Entry<String, Integer> entry : sortString)
			System.out.print(entry.getKey() + " ");
		// HashMap Time complexity for this code -> o(n)

		// Using Bubble sort algorithm
		System.out.println();
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (s[i].length() > s[j].length()) {
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}

		// Using Bubble sort Time complexity for this code -> o(n^3)
	}

}
