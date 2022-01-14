package week3.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		int data[] = {3,2,11,4,6,7};
      //Printing in the ascending order
        Arrays.sort(data);
       for (int i = 0; i <(data.length); i++) 
        {
        	System.out.print( data[i] +" ");
    	}
       // Second largest value
        System.out.print(data[4] +"");
    	}

    }	
		
		
		

		

