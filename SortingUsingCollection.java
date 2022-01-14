package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Declare a String Array
String[] input = {"HCL", "Wipro", "Aspire Systems", "CTS"};

List<String> companies = Arrays.asList(input);

int length = input.length;
Arrays.sort(input);

for(int i = input.length-1; i >= 0; i--) {
	
	System.out.print(input[i] + " ");
}

	}

}
