
public class Tables2 extends Thread {
	
		int number;
		public Tables2(int number) {
			this.number= number;
			this.start();
		}
		@Override
		public void run() {
			for(int count =1;count<=10;++count) {
				System.out.printf("%3d x %3d = %10d\n",number,count,number*count);
				try {
					Thread.sleep(1000);
					
				} catch (InterruptedException e) {
					
				}
			}
		}
}
