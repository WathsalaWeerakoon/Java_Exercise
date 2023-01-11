package Java_Logic_Exercise;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		 	System.out.println("Enter size of array");
		    int n = sc.nextInt();
		    
		    
		    int [] numbers = new int [n];
		    System.out.println("Enter numbers ");  
		    
		    for(int i = 0; i < numbers.length; i++) 
		    {
		    	numbers[i] = sc.nextInt();
		    }
		    
		    System.out.println("Reverse array is ");
		    for(int i= numbers.length - 1; i>=0; i--)
		    {
		    	
		    	System.out.println(+numbers[i]);	
		    }
		    
		    
		    
	}

}
