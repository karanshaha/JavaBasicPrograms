import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ReflectionExample {

	public void test(Object o) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, InstantiationException{
		Class<? extends Object> stu = o.getClass();
		Field[] field = stu.getDeclaredFields();
	
		for(Field field2 : field){
			System.out.println(field2.getName());
		}
		
		Method[] methods = stu.getDeclaredMethods();
		for(Method method2 : methods){
			System.out.println(method2.getName());
			//System.out.println("ssss"+method2.getModifiers());
		}
		
		///Method method = stu.getDeclaredMethod("setRollno", int.class);
		//Field field2 = stu.getDeclaredField("rollno");
		//field2.setAccessible(true);
		///method.setAccessible(true);
		///method.invoke(o, 100);
		
		/*Method method2 = stu.getDeclaredMethod("getRollno");
		int value =  (Integer) method2.invoke(o);
		System.out.println(value);*/
		
		/*Field field2 = stu.getDeclaredField("rollno");
		field2.setAccessible(true);
		System.out.println("From field"+field2.get(stu));
		
		Constructor<Student> studConstructor = (Constructor<Student>) stu.getDeclaredConstructor(int.class,String.class);
		studConstructor.setAccessible(true);
		Student s = studConstructor.newInstance(105,"karan");
		
		System.out.println("name"+s.getName());*/
		
		Constructor<SingleTonDemo> singleTonConstructor =  (Constructor<SingleTonDemo>) stu.getDeclaredConstructor();
		singleTonConstructor.setAccessible(true);
		SingleTonDemo s = singleTonConstructor.newInstance();
		
		System.out.println(s);
		
	}
	
	/*public static void  main(String s[]) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		ReflectionExample e = new ReflectionExample();
		e.test(new Student());
		
	}
	*/
}
