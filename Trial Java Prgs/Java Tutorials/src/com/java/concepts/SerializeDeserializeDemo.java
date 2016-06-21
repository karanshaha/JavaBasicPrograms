package com.java.concepts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDeserializeDemo {
	
	public static void main(String s[]) throws IOException, ClassNotFoundException{

		/*CollegeSerialization c = new CollegeSerialization();
		c.setCollegeName("SP");
		c.setCollegeNo(100);
		c.setNoOfStudents(10000);
		c.setNoOfTeacher(10);
		
		FileOutputStream out = new FileOutputStream("F:\\college.ser");
		ObjectOutputStream os = new ObjectOutputStream(out);
		os.writeObject(c);*/
		
		FileInputStream fin = new FileInputStream("F:\\college.ser");
		ObjectInputStream oi = new ObjectInputStream(fin);
		CollegeSerialization c2 = (CollegeSerialization) oi.readObject();
		
		System.out.println(c2.getCollegeName());
		System.out.println(c2.getNoOfTeacher());
		System.out.println(c2.getNoOfStudents());
	}
	
	public String fun1(String s){
		return s;
	}
	
	public String fun1(String s,String a){
		return s;
	}

}
