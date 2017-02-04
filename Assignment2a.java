package core.java;

public class Assignment2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		char[] chars = {'x', 'x', 'x', 'x', 'x'};
		int length = chars.length;
        for (int row = 0; row< length; row++) {
	     for (int col = 0; col < length; col++) {
		    	   
		 if (col == row || col == (length- 1 -row)) {
		 System.out.print(chars[ col ]);
		       } else {
	    System.out.print("    "  );
		       }
       }
	    System.out.println(  );
		     }
		    }
		

	}


