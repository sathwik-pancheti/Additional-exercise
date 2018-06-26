package com.stackroute.Rex;

public class Main {
	
	public static int value = printHello();
	  public static int printHello() { 
	    System.out.println("Hello"); 
	    return 0;
	  }
	  
	  static {
		  System.out.println("hello");
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main started");
	}

}
