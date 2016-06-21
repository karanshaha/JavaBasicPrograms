
public class AnnotationPojo {
	
	@myAnnotation(value="true" , validate="abc")
	public String a;
	
	@myAnnotation(validate="false" , value="kkk")
	public String b;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}
	
	
	

}
