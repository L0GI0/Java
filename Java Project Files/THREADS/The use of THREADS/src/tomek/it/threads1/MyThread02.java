package tomek.it.threads1;
public class MyThread02 extends Thread {

	public void run() {
		System.out.println(this.getName());
		try {
			sleep((long) (Math.random() * 1000));
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) throws InterruptedException {

		MyThread02[] mf = new MyThread02[1000000];
		for (int i = 0; i < 1000000; i++) {
			mf[i] = new MyThread02();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(mf[i].getName() + " " + mf[i].getPriority()
					+ ", " + mf[i].isAlive() + ", " + mf[i].isInterrupted());
		}

		for (int i = 0; i < 1000000; i++) {
			mf[i].start();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(mf[i].getName() + " " + mf[i].getPriority()
					+ ", " + mf[i].isAlive() + ", " + mf[i].isInterrupted());
		}

		Thread.sleep((long) (Math.random() * 1000));

		for (int i = 0; i < 10; i++) {
			System.out.println(mf[i].getName() + " " + mf[i].getPriority()
					+ ", " + mf[i].isAlive() + ", " + mf[i].isInterrupted());
		}

	}
}
