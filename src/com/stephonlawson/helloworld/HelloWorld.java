package com.stephonlawson.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello, World!");  // first line
		System.out.println("How are you?");   // another line 

	    
		// Newline example 
		System.out.print("Goodbye, ");
		System.out.println("cruel world");
		
		
		// Line Break Example (Escape Sequence)
		
		System.out.print("Hello!\nHow are you doing?\n");  // line break (two lines of code) 
		System.out.print("She said \"Hello!\" to me.");    // escape the double quotes with backslashes
	  
		// => Common Escape Sequences 
		// | \n | newline
		// | \t | tab 
		// | \" | double quote
		// | \\ | backslash 
		
	    
		
		
		// Variable & Operators
		
		// keywords: words that you are not allowed to use as variables names
		    // => keywords include: public, class, static, void, and int // used by the compiler to analyze the structure of the program
		
		
		   // Assignment 
		   
		      //=>  string message = "hello!";   // give message the value "hello!"
		      //    int hour = 11;                   // assign the value 11 to hour
		      //    int minute = 59;                 // set minute to 59 
		
		 
		// Printing Variables 
		   
		    // int hour = 11;
		    // int minute = 59; 
		    // System.out.println("The current time is ");
		    // System.out.print(hour);
		    // System.out.print(":");
		    // System.out.print(minute);
		    // System.out.println(".");  
		    
		    // output: The current time is 11:59. 
		    
		    
		    // Arithmetic Operators 
		    
		     int hour = 11; 
		     int minute = 59; 
		     System.out.print("\nNumber of minutes since midnight: \n");
		     System.out.println(hour * 60  + minute);
		     
		     // output: Number of minutes since midnight: 719
		    
		     double y = 1.0 / 3.0;  // Floating Numbers 
		     System.out.println(y);   // out put: 0.33333333
		     
		     
		        //=> Rounding Errors 
		         
		     System.out.println(	0.1*10);
		     
		     
		     //  Arrays (String & Int) 
		    
		      // => Strings 
		     
		     String[] groceryList = new String[4];
		     groceryList[0] = "bread";
		     groceryList[1] = "eggs";
		     groceryList[2] = "milk";
		     groceryList[3] = "tea";
		     System.out.println(groceryList[2]);
		     groceryList[1] = "beans";
		     System.out.println(groceryList[1]);
		     
		        // => Int 
		     
		     int[] highestArizonaTemperatures = {120, 122, 121, 118, 119};
		     System.out.println(highestArizonaTemperatures[0]);
		     System.out.println(highestArizonaTemperatures[4]);
		     
		     
		     
		     
		   
		    
		    
		    
		    
		    
		    
		    
		    

	}

}
