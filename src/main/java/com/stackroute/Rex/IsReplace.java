package com.stackroute.Rex;

public class IsReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(Replace("is"));	;
	}
	
		public static String Replace(String str) {
			String result = "";
			int len = str.length();

			for(int i = 0; i < len; i++){
		
				    if(i-1 >= 0 && Character.isLetter(str.charAt(i-1))
				   || i+2 < len && Character.isLetter(str.charAt(i+2)))
				    {
				      result += str.charAt(i);
				    }
				
				    else if(i+1 < len && str.substring(i, i+2).equals("is")) {
				      result += "is not";
				      i++;
				    }
				    else result += str.charAt(i);
				  }
				
				  return result;
				}
	}


