
public class ThreadDemo {
			public static void main(String[] args) {
				
					FirstThread thread1 = new FirstThread();
				
					SecondThread secondThread = new SecondThread();
					Thread thread = new Thread(secondThread);
					thread.start();
					
					for(int count =1;count<=100;count++) {
						System.out.print(count%10==0 ? "Main Thread: "+count + "\n" : "Main Thread: "+count + "\t" );
					}	
			}
}
