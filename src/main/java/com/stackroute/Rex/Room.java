package com.stackroute.Rex;

public class Room {

	int roomNo,roomArea;
	String roomType;
	boolean AcMachine;
	
	void setData(int no,String type, int area, boolean ac)
	{
		roomNo = no;
		roomType = type;
		roomArea = area;
		AcMachine = ac;
	}
	
	void displaydata()
	{
		System.out.println("The room is" + roomNo);
		 System.out.println ("The room Type is " + roomType);
		 System.out.println ("The room area is "+ roomArea);
		 String s = (AcMachine) ? "is " : "is not ";
		 System.out.println ("The Ac Machine " + s + "needed " ); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Room room1 = new Room ( );
		 room1. setData (7,"Singleroom",300,true);
		 room1.displaydata(); 
	}

}
