import java.lang.reflect.Field;



public class EmbedAnnotation {
	
	public void test(Object obj) throws NoSuchMethodException, SecurityException, NoSuchFieldException{

		Field[] fields = obj.getClass().getFields();
		for(Field f : fields){
			myAnnotation o1 =(myAnnotation) f.getAnnotation(myAnnotation.class);
			if(o1.value().equals("true")){
				System.out.println("Value is ....true");
			}
			if(o1.validate().equals("false")){
				System.out.println("Validated");
			}
		}
				
	}
	
	public static void main(String s[]) throws NoSuchMethodException, SecurityException, NoSuchFieldException {
		EmbedAnnotation obj = new  EmbedAnnotation();
		AnnotationPojo p = new AnnotationPojo();
		obj.test(p);
	}

}
