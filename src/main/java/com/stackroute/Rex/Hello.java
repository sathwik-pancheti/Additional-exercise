package com.stackroute.Rex;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner str = new Scanner(System.in);
	       System.out.println("Input:");
	       String word = str.nextLine();
	       
	       int length = word.length();
	       String temp = "";
	       
	       for(int i=0;i< length;i++)
	       {
	    	   temp+=word.charAt(i);
	       }
	       
	       System.out.println(temp);
	}
}
