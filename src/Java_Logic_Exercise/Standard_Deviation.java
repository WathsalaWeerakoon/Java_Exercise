package Java_Logic_Exercise;

public class Standard_Deviation {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int [] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		
        int length = numbers.length;
 
       
        int sum = 0;
 
       
        for (int i = 0; i < numbers.length; i++) 
        {
            sum += numbers[i];
        }
 
        double average = sum / length;
         
        System.out.println("Average of array : "+average);
        System.out.println();
		
     
        double sqDiff = 0;
        
        for (int i = 0; i < numbers.length; i++)
        	
        	{
        	sqDiff += (numbers[i] - average) *(numbers[i] - average);
        	
        	
        	
        	
        }
        
        double sd = sqDiff / numbers.length;
    	
    	System.out.println("Standars deviation : "+sd);
    	
    	double sQSd = Math.sqrt(sd);
    	
    	System.out.println();
    	System.out.println("Squre Root of Standars deviation : "+sQSd);
    	
    }
     
    
}


