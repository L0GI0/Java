package tomek.it.threads1;

class MyRunnableC implements Runnable {

	String string;
	public MyRunnableC(String string) {
		this.string=string;
	}

	public void run() {
		Thread.currentThread().setName(this.string);

		for (int i=0; i<20; i++) {
		    System.out.println(Thread.currentThread().getName());
		    try {  Thread.sleep((int)(Math.random()*1000));  }
		    catch (InterruptedException e) {  System.out.println("INTERRUPTED "+Thread.currentThread().getName());  }
		}
		
	    System.out.println("DONE! " + Thread.currentThread().getName());
	}
}

public class W19cRunnable {
	public static void main(String[] args) {
		new Thread( new MyRunnableC("Thread 1")).start();
		new Thread( new MyRunnableC("Thread 2")).start();
		new Thread( new MyRunnableC("Thread 3")).start();
		new Thread( new MyRunnableC("Thread 4")).start();
		new Thread( new MyRunnableC("Thread 5")).start();
	}
}
