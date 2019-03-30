package tomek.it.threads1;


public class W20ThreadA {
	public static void main(String[] args) {

		Thread[] t = new Thread[50];
		for (int x=0; x<50; x++) {
			t[x] = new MyThread20(""+x);
		}
		
		for (int x=0; x<50; x++) {
			t[x].start();
		}

		for (int x=0; x<50; x++) {
			t[x].interrupt();
		}
	}
}
