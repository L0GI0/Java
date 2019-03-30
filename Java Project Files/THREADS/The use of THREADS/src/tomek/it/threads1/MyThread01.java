package tomek.it.threads1;

public class MyThread01 extends Thread {

	
	public void run() {
		System.out.println(System.currentTimeMillis()+"  "+this.getName()+" started");
		try {
			sleep((long) (Math.random() * 10000));
		} catch (InterruptedException e) {}
		System.out.println(System.currentTimeMillis()+"  "+this.getName()+" finished");
	}

	public static void main(String[] args) {

		MyThread01[] mf = new MyThread01[100000];
		for (int i = 0; i < mf.length; i++) {
			mf[i] = new MyThread01();
			mf[i].start();
		}
	
	}
}
