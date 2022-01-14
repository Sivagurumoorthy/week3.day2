package week3.day2;

import java.util.Arrays;

public class Anagram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "BRAG";
		String S2 = "GRAB";
		if (S1.length()!=S2.length()) {
			
			System.out.println("GIVEN STRING VALUES ARE NOT ANAGRAM");
		}
		else {
			char[] String1 = S1.toCharArray();
			char[] String2 = S2.toCharArray();
			Arrays.sort(String1);
			Arrays.sort(String2);
			if (Arrays.equals(String1, String2)==true) {
				
				System.out.println("GIVEN STRINGS ARE ANAGRAM");
			}
			else {
				
				System.out.println("GIVEN STRINGS ARE NOT ANAGRAM");
			}
			
			
			
		}
	}

}
