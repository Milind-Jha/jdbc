
public class SecondThread implements Runnable{

	@Override
	public void run() {
		for(int count =1;count<=100;count++) {
			System.out.print(count%10==0 ? "Second Thread : "+count + "\n" :"Second Thread: "+ count + "\t" );
		}
	}

}
