package com.stackroute.Rex;
import java.util.*;

public class Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner str = new Scanner(System.in);
       System.out.println("Input:");
       String word = str.nextLine();
       int length = word.length();
       int count = 0, tempCount = 1;
       
       if(length == 0)
    	   count =0;
       
       for  (int i=0;i<word.length();i++)
       {
    	   if(i<length-1 && word.charAt(i) == word.charAt(i+1))
    		   tempCount++;
    	   else
    		   tempCount = 1;
    	   
    	   if (tempCount > count)
    		   count = tempCount;
       }
       System.out.println(count);
	}
}
