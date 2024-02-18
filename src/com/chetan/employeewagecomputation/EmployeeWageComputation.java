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
	    
		Random random = new Random();
		attendance = random.nextInt(9) % 2;
		
		System.out.println(attendance);
		
		switch(attendance)
		{
		    case 0 :
			System.out.println("Employee is Absent");
			break;
		
		    case 1 :
	        System.out.println("Employee is Present");
			employee_Type = random.nextInt(9)%2;
			
		        	switch(employee_Type)
		        	{
		        	
		            	case 0 :
			        	System.out.println("Employee is Part Time");
				        dailyWage =  Wage_per_Hour * Part_Time_Hour ;
			            System.out.println("Employee Wage :" + dailyWage);
				
				        break;
			  
			           case 1 :
			           System.out.println("Employee is Full Time");
				       dailyWage =  Wage_per_Hour * Full_Time_Hour;
				       System.out.println("Employee Wage :" + dailyWage);
			
				       break;
			
			          default:
			        	System.out.println("Case isn't match");
			        }
			 break;

		default:
		System.out.println("Case isn't match");
		}
		
		}
		
	
		
	}


