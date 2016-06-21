package com.java.concepts;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParentClass {
	
	public ParentClass fun1() throws SQLException {
		return new ParentClass();
	}
	public static void main(String s[]){
		List<String> l = new ArrayList<String>();
		Collections.synchronizedList(l);
	}
}

class childClass extends ParentClass{
	public childClass  fun1() throws SQLException{
		return new childClass();
	}
	
}


