package week3.day2;

public class PalindromeString {

public static void main(String[] args) {
//		 * a) Declare A String value as"madam"
		String S = "madam";
		char [] S2 = S.toCharArray();
 
//		 * b) Declare another String rev value as ""
		String rev="";
		
//		 * c) Iterate over the String in reverse order
		int length = S2.length;
		
		for (int i =(S2.length)-1; i>=0; i--) 
		{
			  rev=rev+S2[i];
         System.out.println(rev);
		}
        System.out.println(S.equalsIgnoreCase(rev));  
	}
}
	
	


