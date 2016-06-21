
public class ThreadExample {

	public static void main(String s[]){
		final Processor pro = new Processor();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				try {
					pro.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				try {
					pro.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			});
		t1.start();
		t2.start();
	}
	

	
	
}
	

