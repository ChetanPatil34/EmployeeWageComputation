package com.chetan.employeewagecomputation;

import java.util.Random;

//import java.util.Random;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
		
		int attendance ;
		int dailyWage ;
		int employee_Type;
	    final int Wage_per_Hour = 20;
	    final int Part_Time_Hour = 4;
	    final int Full_Time_Hour = 8;
	    
		
		System.out.print("Enter An attendence [0- Apsend / 1- Present] :");
		Random random = new Random();
		attendance = random.nextInt(9) % 2;
		
		System.out.println(attendance);
		
		if(attendance==0)
		{
			System.out.println("Employee is Absent");
		}
		else
		{
			System.out.println("Employee is Present");
			
			employee_Type = random.nextInt(9)%2;
			
			if(employee_Type==0)
			{
				System.out.println("Employee is Part Time");
				
				dailyWage =  Wage_per_Hour * Part_Time_Hour ;
			}
			else
			{
				System.out.println("Employee is Full Time");
				
				dailyWage =  Wage_per_Hour * Full_Time_Hour;
				
			}
			System.out.println("Employee Wage :" + dailyWage);
		
		}
		
	
		
	}

}
