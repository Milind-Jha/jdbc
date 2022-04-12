
public class UnsyncCaller extends Thread{
	String name;
	public UnsyncCaller(String name) {
		this.name=name;
		this.start();
	}
	@Override
	public void run(){
		System.out.print("["+name);
		try {
			this.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		System.out.print("]   ");
	}
}
