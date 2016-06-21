import java.lang.reflect.InvocationTargetException;


public class Student {
	
	private Student(int rollno,String name){
		this.rollno = rollno;
		this.name = name;
	}
	
	private int rollno;
	private String name;
	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}
	/**
	 * @param rollno the rollno to set
	 */
	private void setRollno(int rollno) {
		this.rollno = rollno;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	private void setName(String name) {
		this.name = name;
	}
	
	public static void  main(String s[]) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, InstantiationException {
		ReflectionExample e = new ReflectionExample();
		e.test(new Student(7,"ku"));
		
	}
	
	

}
