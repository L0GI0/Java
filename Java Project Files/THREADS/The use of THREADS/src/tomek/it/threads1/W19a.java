package tomek.it.threads1;

class MyThread extends Thread {
	public MyThread(String string) {
		//super(string);
		setName(string);
	}

	public void run() {
		System.out.println(this.getName());
	}
}

public class W19a {
	public static void main(String[] args) {
		new MyThread("I am Ann").start();
		new MyThread("I am Tom").start();
	}
}
