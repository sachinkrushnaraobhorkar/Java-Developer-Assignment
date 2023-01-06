package Assignment;

import java.util.Arrays;
import java.util.Collections;

//Write a program to search char using linear and binary.
//Input - “9805621” search – “6”
//Output - 4 index of the value
public class Quastion_5 {

	public static void main(String[] args) {
		String Input = "9805621";
		char[] no = Input.toCharArray();
		char search = '6';
		int index = LinearSearch(no, search);
		if (index > 0) {
			System.out.println(index);
		} else {
			System.out.println("Not Found");
		}
		index = BinarySearch(no, search);
		if (index > 0) {
			System.out.println(index);
		} else {
			System.out.println("Not Found");
		}
	}

	// Search for the character in the array using binary search
	private static int BinarySearch(char[] no, char search) {

		// Sorting the given array
		Arrays.sort(no);
		int low = 0;
		int high = no.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (no[mid] == search) {
				return mid;
			} else if (no[mid] < search) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		// Return -1 if the character is not found
		return -1;
	}

	// Search for the character in the array using linear search
	private static int LinearSearch(char[] no, char key) {

		for (int i = 0; i < no.length; i++) {
			if (no[i] == key) {
				return i;
			}
		}
		// Return -1 if the character is not found
		return -1;
	}
}
