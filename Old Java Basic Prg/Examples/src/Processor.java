import java.util.Scanner;


public class Processor {
	
	public void producer() throws InterruptedException{
		System.out.println("In Processor");
		synchronized (this) {
			System.out.println("In Syncro b4 wait() in ");
			this.wait();
			System.out.println("After wait()");
			
		}
	}
	
	public void consumer() throws InterruptedException {
		System.out.println("In Consumer");
		Thread.sleep(2000);
		Scanner sc = new Scanner(System.in);
		synchronized (this) {
			System.out.println("waiting for key to be hit");
			sc.nextLine();
			System.out.println("next line hit");
			notify();
		}
	}

}
