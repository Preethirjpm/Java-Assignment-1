package core.java;

public class Assignment1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
       
		   System.out.println("  Before Swapping"  );
		   
	       System.out.println("  Value of a is :"   +  a);
	       System.out.println("  Value of b is :"   + b);
	       
	
	    //swapping value of two numbers without using third variable
		a = a + b; //now a is 30 and b is 20
		b = a -b; //now a is 30 but b is 10 (original value of a)
		a = a -b; //now a is 20 and b is 10, numbers are swap
        
         System.out.println("   After  Swapping"   );
         
         System.out.println("  Value of a is :"  + a);
         System.out.println("  Value of b is :"  + b);
 }


 }


