
public class DemoObj {
	
	public void test(Object o){
		System.out.println("In obj");			
		}
	
	public void test(String s){
		System.out.println("In Str");
	}
	
	public void test(Integer s){
		System.out.println("In Integer");
	}
	
	public void test(int s){
		System.out.println("In int");
	}
	
	public static void main(String args[]){
		DemoObj dobj = new DemoObj();
		int d=9;
		dobj.test(d);
	}

}
