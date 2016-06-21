import java.io.Serializable;


public class SingleTonDemo implements Cloneable,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static volatile SingleTonDemo singleTonDemo = null;
	
	/*To avoid creation of object using Reflection*/
	private SingleTonDemo(){
		if(SingleTonDemo.singleTonDemo != null){
			throw new RuntimeException("Can't instantiate singleton twice");
		}
	}
	
	/*To avoid creation of object using Cloning*/
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this class is not allowed"); 
    }
    
	/*To avoid creation of object using Deserialization*/
    protected Object readResolve() throws InterruptedException {
        return getSingleTonObj();
    }
	
	public  static SingleTonDemo getSingleTonObj() throws InterruptedException{
		System.out.println("in sing");
		if(singleTonDemo == null){
			synchronized (SingleTonDemo.class) {
			
				if(singleTonDemo == null){
					System.out.println("in if");
					singleTonDemo = new SingleTonDemo();
					System.out.println("in synchronized");
					//singleTonDemo.notify();
					return singleTonDemo;
				}
			}
			
		}
		return singleTonDemo;
	}
	
	/*public static void main(String s[]){
		SingleTonDemo ob1 = SingleTonDemo.getSingleTonObj();
		
	}*/
}
