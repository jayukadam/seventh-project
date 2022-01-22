package com.Exercise;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {

		int day;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter day");
		day = scn.nextInt();
		switch (day)
		{
		case 1:
			System.out.println("working day");
		break;
		
		case 2:
			System.out.println("working day");
		break;
		
		
		case 3:
			System.out.println("working day");
		break;
		
		case 4:
			System.out.println("working day");
		break;
		
		case 5:
			System.out.println("working day");
		break;
		
		
		case 6:
			System.out.println("working day");
		break;
		
		case 7:
			System.out.println("weekend day");
		break;
		
		default:
		 System.out.println("INVALID DAY");
		
	
		
		}
		
		scn.close();
		
	
		
	}

}
