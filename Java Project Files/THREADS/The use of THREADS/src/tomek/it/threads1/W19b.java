package tomek.it.threads1;

class MyRunnable implements Runnable {

	String string;
	public MyRunnable(String string) {
		this.string=string;
	}

	public void run() {
		Thread.currentThread().setName(this.string);

		System.out.println("Thread: "+Thread.currentThread().getName());
	}
}

public class W19b {
	public static void main(String[] args) {
		new Thread( new MyRunnable("I am ALA")).start();
		new Thread( new MyRunnable("I am OLA")).start();
	}
}
