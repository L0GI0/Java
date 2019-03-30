package tomek.it.threads2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task implements Runnable {

	private static int number;
	int l;
	public Task() {
		l=++number;
	}

	public void run() {
		Thread.currentThread().setName("Thread: "+l);

		System.out.println(Thread.currentThread().getName());
		try { Thread.sleep(6000); } catch (InterruptedException e) {}
	}
}

public class ThreadPools1 {
	
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(5);
		
		pool.submit(new Task());
		pool.submit(new Task());
		pool.submit(new Task());
		pool.submit(new Task());
		pool.submit(new Task());
		pool.submit(new Task());
		pool.submit(new Task());
		pool.submit(new Task());
		pool.submit(new Task());
		pool.submit(new Task());
		pool.submit(new Task());
		pool.submit(new Task());

		// Check three possibilities
		// 1. pool.shutdown();
		// 2. pool.shutdownNow();
		// 3. without shutdown
		
		//pool.shutdown();
		pool.shutdownNow();
	}
	
}
