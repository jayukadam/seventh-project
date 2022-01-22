package com.Exercise;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
Scanner scn = new Scanner(System.in);

System.out.println("Enter Amount");

int amount = scn.nextInt();

		for(int i=1; i<4; i++)
		{
			int loan = (amount*10)/100;
			amount = amount-loan;
		}
		
		System.out.println(amount);
		scn.close();
	}

}
