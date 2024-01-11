package week10_java_sapna;

public class Pattern {
public static void main(String[] args) {
	//7. Write a Java program to print the following pattern?
	        int n = 5; 

	        for (int i = 1; i <= n; i++) {
	          
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }

	            System.out.println(); 
	        }
	        
	        for (int i = n - 1; i >= 1; i--) {
		           
	        	{
	        		for(int j=n-i;j>=1;j--)
	        		{
		                System.out.print(" ");
		            }
	        		for (int k = i; k >= 1; k--) {
		                System.out.print("* ");
		            }
	        		 System.out.println(); 
		        }
}
	       
}
}
