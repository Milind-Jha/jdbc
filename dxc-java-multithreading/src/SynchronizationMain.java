
public class SynchronizationMain {
		public static void main(String[] args) {
			
//			UnsyncCaller firstThread = new UnsyncCaller("first");
//			UnsyncCaller secondThread = new UnsyncCaller("second");
//			UnsyncCaller thirdThread = new UnsyncCaller("third");
		
			Caller caller = new Caller();
			SyncCaller one = new SyncCaller(caller,"first"); //T1
			SyncCaller two = new SyncCaller(caller,"second");//T2
			SyncCaller third = new SyncCaller(caller,"third");// T3
			
			
			
		}
}
