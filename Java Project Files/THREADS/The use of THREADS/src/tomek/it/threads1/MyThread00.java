package tomek.it.threads1;

public class MyThread00 extends Thread {

	private long created;
	private long started;
	private long interrupted;

	private static int number = 0;
	
	public MyThread00() {
		super(""+ ++number);
		created=System.currentTimeMillis();
	}
	
	public long getCreated() { return created; }
	public long getStarted() { return started; }
	public long getInterrupted() { return interrupted; }
	
	public void run() {
		started=System.currentTimeMillis();
		
		System.out.printf("Thread: %5s, Created: %5d, Started: %5d\n", this.getName(),created,started);
		try {
			sleep((long) (Math.random() * 1000));
		} catch (InterruptedException e) {
			interrupted=System.currentTimeMillis();		
		}
		
	}

	public static void main(String[] args) {

		MyThread00[] mf = new MyThread00[1000];
		for (int i = 0; i < 1000; i++) {
			mf[i] = new MyThread00();
		}

		for (int i = 0; i < 10; i++) {
			System.out.printf("Thread: %5s, Created: %5d, Started: %5d [%s %s]\n", mf[i].getName(), mf[i].getCreated(), mf[i].getStarted(), mf[i].isAlive(), mf[i].isInterrupted());
		}

		for (int i = 0; i < 1000; i++) {
			mf[i].start();
		}

		for (int i = 0; i < 10; i++) {
			System.out.printf("Thread: %5s, Created: %5d, Started: %5d [%s %s]\n", mf[i].getName(), mf[i].getCreated(), mf[i].getStarted(), mf[i].isAlive(), mf[i].isInterrupted());
		}

		try { Thread.sleep((long) (Math.random() * 1000)); } catch (InterruptedException e) {}

		for (int i = 0; i < 10; i++) {
			System.out.printf("Thread: %5s, Created: %5d, Started: %5d [%s %s]\n", mf[i].getName(), mf[i].getCreated(), mf[i].getStarted(), mf[i].isAlive(), mf[i].isInterrupted());
		}

		//try { Thread.sleep((long) (Math.random() * 1000)); } catch (InterruptedException e) {}
	}
}
