package com.test.afternoon;

public class ColaEmployee {
String empname;
int bidmonth;
public ColaEmployee() {}
public ColaEmployee(String empname,byte bidmonth ) {
	this.bidmonth = bidmonth;
	this.empname =  empname;
}
public void getSalary(int month){
	
	}
}
class SalariedEmployee  extends ColaEmployee  {
	double Salary;
	public SalariedEmployee(){
		
	}
public SalariedEmployee(String empname,byte bidmonth,double Salary){
	super.bidmonth = bidmonth;
	super.empname = empname;
	this.Salary = Salary;
	}
	public void getSalary(int month) {
		
	}
}
class HourlyEmployee  extends ColaEmployee  {
	float hourSalary;
	int hours;
	public HourlyEmployee(){}
	public  HourlyEmployee(String empname,byte bidmonth,float hourSalary,int hours){
		super.bidmonth = bidmonth;
		super.empname = empname;
		this.hours = hours;
		this.hourSalary = hourSalary;
	}
public void getSalary(int hours) {
	double	salary;
		if(hours>160) {
			salary = this.hourSalary*160+this.hourSalary*(hours-160)*1.5;
		}
		else {
			salary = this.hourSalary*hours;
		}
		System.out.print(salary);
	}
}
class SalesEmployee   extends ColaEmployee  {
	double sales;
	double tichenglv;
	public SalesEmployee() {}
	public SalesEmployee(String empname,byte bidmonth,double sales,double tichenglv) {
		super.bidmonth = bidmonth;
		super.empname = empname;
		this.sales = sales;
		this.tichenglv = tichenglv;
	}
	public void getSalary(int month){
		
	}
}


