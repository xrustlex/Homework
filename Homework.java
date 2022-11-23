package homework;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Homework {
	// find greater
	double findGreater(double one, double two) {

		if (one == two)
			System.out.println("none is bigger (both are equal)");
		if (one > two)
			return one;
		return two;

	}

	// swap two numbers
	void swapTwo(double one, double two) {

		double num = one;
		one = two;
		two = num;

	}

	// swap no extra var
	void swapNoVar(double one, double two) {

		one = one + two;
		two = one - two;
		one = one - two;

	}

	// check if even using ternary
	boolean isEven(long num) {

		return ((num & 1) == 0) ? true : false;

	}

	// find greatest of three
	double greatestOfThree(double one, double two, double three) {

		double num = one > two ? one : two;
		return three > num ? three : num;

	}

	// vowel or consonant
	boolean isVowel(char c) {

		String str = "aeiouAEIOU";
		return (str.indexOf(c) != -1) ? true : false;

	}

	// Write a method that accepts an array and return the second min and max number
	double[] minAndMax(double[] arr) {

		Arrays.sort(arr);
		double[] res = { arr[1], arr[arr.length - 2] };
		return res;

	}

	// Write a method that accepts two string arguments and returns true if they are
	// anagram and false if they are not
	boolean isAnagram(String s1, String s2) {

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		char[] ca1 = s1.toCharArray();
		char[] ca2 = s2.toCharArray();

		Arrays.sort(ca1);
		Arrays.sort(ca2);

		s1 = new String(ca1);
		s2 = new String(ca2);

		if (s1 == s2)
			return true;
		return false;

	}

	// Remove All occurrences of given character from String
	String removeGivenChar(String s, char c) {

		char[] ca = s.toCharArray();
		String res = "";
		for (char e : ca)
			if (e != c)
				res += e;
		return res;

	}
	// How to swap 2 numbers without using 3rd variable
	// See line 27

	// How to remove white spaces from a string
	String removeWhiteSpaces(String s) {

		char[] ca = s.toCharArray();
		String res = "";
		for (char e : ca)
			if (e != ' ')
				res += e;
		return res;

	}

	// Check if two arrays contain same elements
	boolean isSameElementsInArrays(Object[] arr1, Object[] arr2) {

		if (arr1.length != arr2.length)
			return false;

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for (int i = 0; i < arr1.length - 1; i++)
			if (arr1[i] != arr2[i])
				return false;

		return true;
		
	}
	//Find 3rd largest element in an integer array
	int thirdGreatest(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length - 3];
		
	}
	//How to sort HashMap by using values
	void sortMapByValues(Map map) {
		
		Stream<Map.Entry> sorted =
			    map.entrySet().stream()
			       .sorted(Map.Entry.comparingByValue());
			
	}
}
