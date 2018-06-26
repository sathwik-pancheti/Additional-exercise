package com.stackroute.Rex;
import java.util.*;

public class Count9 {

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
		
		System.out.println(Count9(number));
	}
	
		public static int Count9(int[] nums) {
			
			int count=0;
			
			for(int i=0;i<nums.length;i++)
			{
			if(nums[i]==9)
			{
				count++; 
			}	
			}
			return count;
			}
		
	}


