package com.stackroute.Rex;
import java.util.*;

public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner str = new Scanner(System.in);
		System.out.println("Enter String:");
		String word = str.nextLine();

		int length = word.length();
		int sum = 0;

		for (int i= 0; i< length; i++)
		{
			if(Character.isDigit(word.charAt(i)))
			{
				String temp = word.substring(i,i+1);
				sum += Integer.parseInt(temp);
			}
		}
        System.out.println(sum);
	}

}
