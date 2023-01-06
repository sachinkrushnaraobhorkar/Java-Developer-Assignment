package Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> list = new ArrayList<>();
		String str = "qrssaqqzibbssraib";
		for (int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}

		// create a map to store the frequency of each word
		Map<Character, Integer> frequencyMap = new HashMap<>();
		for (Character word : list) {
			int count = frequencyMap.getOrDefault(word, 0);
			frequencyMap.put(word, count + 1);
		}

		// create a list of map entries and sort it by frequency
		List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(frequencyMap.entrySet());
		sortedEntries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

		// print the sorted list of words and their frequencies
		for (Map.Entry<Character, Integer> entry : sortedEntries) 
			System.out.print(entry.getKey());
			
		
	}

}
