import java.sql.SQLException;


public class A {
	
	public void test() throws SQLException{
		System.out.println("In A");
	}
	
	public static void main(String s[]) throws SQLException{
		A o1 = new B();
		B o2 = new C();
		B o3 = new D();
		
		o1.test();
		o2.test();
		o3.test();
		System.out.println(A.class.isInstance(o1));
		System.out.println(A.class.isInstance(o2));
		System.out.println(A.class.isInstance(o3));
	}

}

class B extends A{
	@Override
	public void test() throws SQLException{
		System.out.println("In b");
	}
}

class C extends B{
	public void test() throws SQLException{
		System.out.println("In C");
	}
}

class D extends C{
	
}
