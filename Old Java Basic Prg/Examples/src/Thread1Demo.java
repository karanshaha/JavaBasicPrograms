import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;


public class Thread1Demo implements Runnable{
	public String name;
	
	public Thread1Demo(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("in run");
		SingleTonDemo s;
		try {
			s = SingleTonDemo.getSingleTonObj();
			
			//Serialize
			/*FileOutputStream fout = new FileOutputStream("F:\\template\\singleton.ser");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s);*/
			
			//Deserialize
			/*FileInputStream fin = new FileInputStream("F:\\template\\singleton.ser");
			ObjectInputStream in = new ObjectInputStream(fin);
			SingleTonDemo s1 = (SingleTonDemo) in.readObject();*/
			
			//Clone
			/*SingleTonDemo s2 = (SingleTonDemo) s.clone();*/
			
			//Reflection
			ReflectionExample e = new ReflectionExample();
			e.test(s);
			
			if(15 > 10){
				throw new AgeNotValidException("Age is greater");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String s[]) throws InterruptedException{
		Thread1Demo t1 = new Thread1Demo("abc");
		Thread1Demo o2 = new Thread1Demo("abc");
		Thread t = new Thread(t1);
		
		
		System.out.println(t.getName());
		/*synchronized (t1) {
			t1.wait(1000);
			t1.notifyAll();
		}*/
		//t.join();
		Thread t2 = new Thread(o2);
		t2.start();
		System.out.println(t.getName());
		
		
		
		
	}

}
