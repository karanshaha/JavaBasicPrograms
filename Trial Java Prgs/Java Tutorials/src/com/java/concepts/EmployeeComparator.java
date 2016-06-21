package com.java.concepts;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 * 
	 */
	@Override
	public int compare(Employee o1, Employee o2) {
		Integer empId1 = o1.getEmpId();
		Integer empId2 = o2.getEmpId();
		int compVal = empId1.compareTo(empId2);
		if(compVal != 0){
			return compVal;
		}else{
			String s1 = o1.getFname();
			String s2 = o2.getFname();
			compVal = s1.compareTo(s2);
		}
		return compVal;
	}

}
