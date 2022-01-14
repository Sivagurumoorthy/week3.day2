package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 * a) Use the declared String text as input
		
			String S = "We learn java basics as part of java sessions in java week1";
			
//		 * b) Initialize an integer variable as count	  
			 int count = 0;
			
//		 * c) Split the String into array and iterate over it 
			 String S1[] = S.split(" ");
			 Set<String>dupset = new LinkedHashSet<String>();
//		 * d) Initialize another loop to check whether the word is there in the array
		for(String remove :S1) {
		dupset.add(remove);
		if(count>1) {
						
						System.out.print(remove.replaceAll(remove, " "));
						
				}
				
			System.out.print(dupset);
			
//		 * e) if it is available then increase and count by 1. 
			
			
//		 * f) if the count > 1 then replace the word as "" 
			
//		 
//		 * g) Displaying the String without duplicate words	

	}

}}
