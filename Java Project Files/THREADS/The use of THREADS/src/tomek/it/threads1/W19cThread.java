package tomek.it.threads1;

class MyThreadC extends Thread {

	public MyThreadC(String string) {
		super(string);
	}

	public void run() {

		for (int i = 0; i < 20; i++) {
			System.out.println(getName());

			try {
				sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				System.out.println("INTERRUPTED " + getName());
			}
		}

		System.out.println("DONE! " + getName());
	}
}

public class W19cThread {
	public static void main(String[] args) {
		new MyThreadC("Thread 1").start();
		new MyThreadC("Thread 2").start();
		new MyThreadC("Thread 3").start();
		new MyThreadC("Thread 4").start();
		new MyThreadC("Thread 5").start();
	}
}
