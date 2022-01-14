package week3.day2;
import java.util.Arrays;
public class MissingElementInArray {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				int[] numbers = {1,2,3,4,7,6,8};
// Sort the array	
				
				Arrays.sort(numbers);
                int i = 1;
// loop through the array (start i from arr[0] till the length of the array)
                
				while ( i < numbers.length ) 
				  {
// check if the iterator variable is not equal to the array values respectively
					
			        if ( numbers[i] - numbers[i-1] == 1 ) 
			        {
			        } 
			        else 
			        	// print the number
			        {
			            System.out.println( "Missing number is " + ( numbers[i-1] + 1 ) );
			        }
			        i++;
			    }}}
					
					
