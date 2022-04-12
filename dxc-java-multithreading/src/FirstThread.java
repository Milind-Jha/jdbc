
public class FirstThread implements Runnable {
	Thread  thread;
	public FirstThread() {
			thread = new Thread(this);
			thread.start();
	}
	
	@Override
	public void run() {
		for(int count =1;count<=100;count++) {
			System.out.print(count%10==0 ? "Other Thread: "+count + "\n" :"Other Thread: "+ count + "\t" );
		}	
	}
	
}
