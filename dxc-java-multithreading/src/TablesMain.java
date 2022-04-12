
public class TablesMain {
	public static void main(String[] args) {
		Tables one  = new Tables(4);
		Tables two = new Tables(6);
		Tables three = new Tables(12);
		Tables2 four = new Tables2(15);
		
//		
//		try {
//			one.thread.join();
//			two.thread.join();
//			three.thread.join();
//			four.join();
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
		System.out.println("Main thread ends...");
	}
}
