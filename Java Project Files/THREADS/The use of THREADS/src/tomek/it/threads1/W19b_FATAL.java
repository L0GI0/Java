package tomek.it.threads1;

class MyRunnableFATAL implements Runnable {
	
	public MyRunnableFATAL(String string) {
		//System.out.println("This Thread: "+Thread.currentThread().getName());
		Thread.currentThread().setName(string);
		System.out.println("Now: "+Thread.currentThread().getName());
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class W19b_FATAL {
	public static void main(String[] args) {
		new Thread( new MyRunnableFATAL("I am Ann")).start();
	}
}

// What happened and why?...
