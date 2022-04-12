
public class SyncCaller extends Thread {
	String name;
	Caller caller;
	public SyncCaller(Caller caller,String name) {
		this.name= name;
		this.caller = caller;
		this.start();
	}

	@Override
	public void run(){
	
		  synchronized (caller) { caller.display(name); caller.display2(name); }
		 
		caller.display(name);
    	caller.display2(name);
	}	
}
