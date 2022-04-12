
public class Caller {
	public void display(String name) {
		System.out.print("["+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("]    ");
	}
	public void display2(String name) {
		System.out.print("[ Asynch method starts "+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		System.out.println(" ]  asynch method ends  ");
	}
	
}
