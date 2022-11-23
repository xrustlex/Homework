package homework;

import java.util.Arrays;

public class Homework {
	//find greater
	double findGreater(double one, double two) {
		
		if (one == two)	System.out.println("none is bigger (both are equal)");
		if (one > two) 	return one;
		return two;
		
	}
	//swap two numbers
	void swapTwo(double one, double two) {
		
		double num = one;
		one = two;
		two = num;
		
	}
	//swap no extra var
	void swapNoVar(double one, double two) {
		
		one = one + two;   
        two = one - two;   
        one = one - two; 
        
	}
	//check if even using ternary
	boolean isEven(long num) {
		
		return ((num & 1) == 0) ? true : false;

	}
	//find greatest of three
	double greatestOfThree(double one, double two, double three) {
		
		double num = one > two ? one : two; 
		return three > num ? three : num;
		
	}
	//vowel or consonant
	boolean isVowel(char c)
    {
		
        String str = "aeiouAEIOU";
        return (str.indexOf(c) != -1) ? true : false;
        
    }
	//Write a method that accepts an array and return the second min and max number
	double[] minAndMax(double[] arr) {
		
		Arrays.sort(arr);
		double[] res = {arr[1], arr[arr.length - 2]};
		return res;
		
	}
	//Write a method that accepts two string arguments and returns true if they are anagram and false if they are not
	boolean isAnagram(String s1, String s2) {
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] ca1 = s1.toCharArray();
		char[] ca2 = s2.toCharArray();
		
		Arrays.sort(ca1);
		Arrays.sort(ca2);
		
		s1 = new String(ca1);
		s2 = new String(ca2);

		if (s1 == s2) return true ; 
		return false;
		
	}
}

