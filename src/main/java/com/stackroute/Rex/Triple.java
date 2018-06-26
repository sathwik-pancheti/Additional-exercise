package com.stackroute.Rex;

import java.util.Scanner;

public class Triple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner no =new Scanner(System.in);
		System.out.println("Input no. of elements:");
		int n=no.nextInt();
		int number[]=new int[n];
		System.out.println("Input numbers:");
		
		for(int i=0;i<n;i++)
		{
			number[i]=no.nextInt();
		}
        System.out.println(noTriples(number));
	}

	public static boolean noTriples(int[] nums) {
		  
		  for (int i = 0 ; i < nums.length - 1;i++) { 
		    if (i+2 <= nums.length -1) { 
		      if (nums[i] == nums[i+1] && nums[i] == nums[i+2]) 
		        return false;   
		    }
		  } 
		  return true;
		}
	
	
}
