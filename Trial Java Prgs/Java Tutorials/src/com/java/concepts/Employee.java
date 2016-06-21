package com.java.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{
	
	public String fname;
	public String lname;
	public int empId;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public int compareTo(Employee o) {
		Integer empId1 = this.empId;
		Integer empId2 = o.empId;
		return empId1.compareTo(empId2);
	}
	
	

	public static void  main(String s[]) {
		Employee e1 = new Employee();
		e1.setEmpId(101);
		e1.setFname("karan");
		e1.setLname("shaha");
		
		Employee e2 = new Employee();
		e2.setEmpId(101);
		e2.setFname("kunal");
		e2.setLname("shaha");

		Employee e3 = new Employee();
		e3.setEmpId(1);
		e3.setFname("Akshat");
		e3.setLname("shaha");
		
		Employee e4 = new Employee();
		e4.setEmpId(101);
		e4.setFname("hni");
		e4.setLname("shaha");

		
		List<Employee> empLst = new ArrayList<Employee>();
		empLst.add(e1);
		empLst.add(e2);
		empLst.add(e3);
		empLst.add(e4);
		
		for(Employee e : empLst){
			System.out.println(e.fname);
		}
		
		
		Collections.sort(empLst,new EmployeeComparator());
		/*Collections.sort(empLst);*/
		System.out.println("after sorting");
		for(Employee e : empLst){
			System.out.println(e.fname);
		}
		
		
	}
}
