
public class Child extends Father{
	public void getAge(){
		System.out.println("Child Age 10");
		
	}
	
	public static void main(String s[]){
		GranFather c = new Child();
		c.getAge();
	}
}
