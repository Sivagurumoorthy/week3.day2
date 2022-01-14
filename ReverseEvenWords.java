package week3.day2;

import java.lang.reflect.Array;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

				 
//				 * Declare the input as Follow
		      		String test = "I am a software tester"; 
		        
//				a) split the words and have it in an array
		            
		            String test1[] = test.split(" ");
		    	
		        //b) Traverse through each word (using loop)
		             for(int i = 0; i < test1.length; i++) 
		           
		             { if (i % 2 == 0) {
		            	 
		            	 System.out.print(test1[i] +" ");
		             }
		        //c) find the odd index within the loop (use mod operator)  
		             
		         	char charArray[] = test1[i].toCharArray();
		         	for(int j = (charArray.length)-1; j >= 0; j--) {
		         		
		         		System.out.print(charArray[j] +" ");
		         		
		         	}
		             }
//	d)split the words and have it in an array
//	e)print the even position words in reverse order using another loop (nested loop)
// f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).



	}

}
