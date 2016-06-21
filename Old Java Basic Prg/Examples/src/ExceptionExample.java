



public class ExceptionExample {
	
	public void test(){
		try{
			System.out.println("In test");
			throw new RuntimeException();
		}catch(Exception e){
			System.out.println("Exception");
		}
	}
	
	public static void main(String a[]){
		ExceptionExample o1 = new ExceptionExample();
		try{
			o1.test();
			throw new RuntimeException();
		   }
		catch(RuntimeException e){
			System.out.println("RuntimeException......");
		}
		
	}

}
