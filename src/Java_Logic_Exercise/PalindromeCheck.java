package Java_Logic_Exercise;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
			
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter any word");
		String real = sc.nextLine();
		
	
		 int length = real.length(); 
		 
		 String reverse ="";
		 
	      for ( int i = length - 1; i >= 0; i-- )  
	      {
	         reverse = reverse + real.charAt(i); 
	      }
	      
	      if (real.equals(reverse))
	    		  {
	         System.out.println("It is Palindrome"); 
	    		  }
	      else  
	      {
	         System.out.println("It is not Palindrome"); 
	      }
		

	}

}
