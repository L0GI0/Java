package tomek.it.threads1;

class MyThread20 extends Thread {

	public MyThread20(String string) {
		super(string);
	}

	public void run() {
		for (;;) {
			try {
				if (isInterrupted()) {
					System.out.println("Interrupted (A) " + getName());
					return;
				}
				// COMMANDS

				sleep(2);
				if (isInterrupted()) {
					System.out.println("Interrupted (B) " + getName());
					return;
				}
				// COMMANDS

			} catch (InterruptedException e) {
				System.out.println("Interrupted (C) " + getName());
				return;
			}
		}

	}

}

public class W20Thread {
	public static void main(String[] args) {
		Thread t1 = new MyThread20("1");
		Thread t2 = new MyThread20("2");
		Thread t3 = new MyThread20("3");

		t1.start();
		t2.start();
		t3.start();

		t1.interrupt();
		t2.interrupt();
		t3.interrupt();
	}
}
