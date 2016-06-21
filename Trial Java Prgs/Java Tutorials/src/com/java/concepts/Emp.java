package com.java.concepts;

import java.util.HashMap;
import java.util.Map;

public class Emp {
	
	Integer emplID;
	String name;
	
	public Emp(Integer emplID, String name) {
		super();
		this.emplID = emplID;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emplID == null) ? 0 : emplID.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (emplID == null) {
			if (other.emplID != null)
				return false;
		} else if (!emplID.equals(other.emplID))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public static void main(String s[]) {
		
		Emp e1 = new Emp(101, "karan");
		Emp e2 = new Emp(102, "akshat");
		Emp e3 = new Emp(103, "kunal");
		Emp e4 = new Emp(103, "kunal");
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		
		Map<Emp, String> m = new HashMap<Emp, String>();
		m.put(e1, "employee");
		m.put(e2, "manager");
		m.put(e3, "CEO");
		
		
		
		System.out.println(m.get(e4));

	}
	

}
