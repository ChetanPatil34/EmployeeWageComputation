package com.chetan.employeewagecomputation;

import java.util.Scanner;

//import java.util.Random;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
		
		int attendance ;
		
		System.out.print("Enter An attendence [0- Apsend / 1- Present] :");
		Scanner obj = new Scanner(System.in);
		attendance = obj.nextInt();
		
		if(attendance==0)
		{
			System.out.println("Employee is Absent");
		}
		else
		{
			System.out.println("Employee is Present");
		}
		
		
		
		
	}

}
