package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;
public class CharOccurance {
public static void main(String[] args) {
// Check number of occurrences of a char (eg 'e') in a String
String st = "welcome to chennai";
// declare and initialize a variable count to store the number of occurrences
				       int count = 0;
					// convert the string into char array
						char [] charArray = st.toCharArray();
					//get the length of the array
						int length = st.length();
						System.out.println(length);
					// traverse from 0 till the array length 
						for (int i = 0; i < charArray.length; i++) {
						if(charArray[i] == 'e')
						count++;{System.out.println("The character" +"occured"+count+"times");}}}}
