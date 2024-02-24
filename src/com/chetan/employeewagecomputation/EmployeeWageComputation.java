package com.chetan.employeewagecomputation;

import java.util.Random;

//import java.util.Random;

public class EmployeeWageComputation {
	

		// TODO Auto-generated method stub
	
		
		int attendance ;
		int dailyWage = 0;
		//int partTimer_dailyWage = 0;
		//int fullTimer_dailyWage = 0;
		int employee_Type;
		int total_wage = 0;
		int Employee_mouth_wage ;
		int total_working_hr = 0;
		int total_working_days = 1;
	  //  final int Wage_per_Hour = 20;
	    final int Part_Time_Hour = 4;
	    final int Full_Time_Hour = 8;
	    int working_hr_month = 100;
	    int wage_per_hr;;
	    int working_days;
	    //int working_day = 0;
	    
//	    for(int i=1; i<=WORKING_DAYS; i++)
//	    {
//	    	System.out.println("Day :"+i);
	    public void employeeWageCalc() {
	    System.out.println("Welcome to Employee Wage Computation Program");
		
	    while(total_working_hr <= working_hr_month && total_working_days <= working_days) {
	    	
	    	System.out.println("Day="+total_working_days);
	    	
		Random random = new Random();
		attendance = random.nextInt(9) % 2;
		
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
		        	
		            	case 0:
		            		System.out.println("Employee is Part Time");
		            		dailyWage =  wage_per_hr * Part_Time_Hour ;
		            		total_working_hr += Part_Time_Hour ;
		            		//System.out.println("Employee Wage :" + partTimer_dailyWage);
		            		break;
			  
			           case 1:
			        	   System.out.println("Employee is Full Time");
			        	   dailyWage =  wage_per_hr * Full_Time_Hour;
			        	   total_working_hr += Full_Time_Hour;
			        	   //System.out.println("Employee Wage :" + fullTimer_dailyWage);
			        	   break;
			        	   
		        	}
		        	
		        	//working_hr_month=Full_Time_Hour+Part_Time_Hour ;
		        	 total_wage += dailyWage;
				      System.out.println("Daily_wage="+dailyWage);
		        	
		            break;
				}
	
			System.out.println("--------------------");
			
			total_working_days++;
	    }
	
	    System.out.println("Working_hr_mouth="+total_working_hr);
	    System.out.println("Total Monthly="+total_wage);
		     

	    }
	    
	    public  EmployeeWageComputation(int wage_per_hr,int working_days,int working_hr_month ) {
	    	
	    	this.wage_per_hr = wage_per_hr;
	    	this.working_days = working_days;
	    	this.working_hr_month = working_hr_month;
	    }
	    
	    
	public static void main(String[] args) {
		EmployeeWageComputation employeeWageComp = new EmployeeWageComputation(22,18,80);
		employeeWageComp.employeeWageCalc();
	
		
	

	}
	 
	    }
		
	
		
	


