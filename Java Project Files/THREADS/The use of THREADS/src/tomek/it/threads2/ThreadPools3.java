package tomek.it.threads2;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class Task2 implements Runnable {

	private static int liczba;
	int l;
	public Task2() {
		l=++liczba;
	}

	public void run() {
		Thread.currentThread().setName("Thread: "+l);

		long sleepingTime = (long) (Math.random() * 50000);
		//System.out.println(Thread.currentThread().getName()+" START - sleeping: "+sleepingTime/1000+"s");
		try { Thread.sleep(sleepingTime); } catch (InterruptedException e) {}
		//System.out.println(Thread.currentThread().getName()+" END");
	}
}

public class ThreadPools3 {

	public static synchronized void print(Vector<Future<?>> v) {

		for (Future<?> future : v) {
			System.out.print(future.isDone()+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(5);
		
		Vector<Future<?>> v = new Vector<Future<?>>();

		v.add(pool.submit(new Task2()));
		v.add(pool.submit(new Task2()));
		v.add(pool.submit(new Task2()));
		v.add(pool.submit(new Task2()));
		v.add(pool.submit(new Task2()));
		v.add(pool.submit(new Task2()));
		v.add(pool.submit(new Task2()));
		v.add(pool.submit(new Task2()));
		v.add(pool.submit(new Task2()));
		v.add(pool.submit(new Task2()));
		v.add(pool.submit(new Task2()));
		v.add(pool.submit(new Task2()));
		
		pool.shutdown();
		
		print(v);
		try { Thread.sleep(10000); } catch (InterruptedException e) {}
		print(v);
		try { Thread.sleep(10000); } catch (InterruptedException e) {}
		print(v);
		try { Thread.sleep(10000); } catch (InterruptedException e) {}
		print(v);
		try { Thread.sleep(10000); } catch (InterruptedException e) {}
		print(v);
		try { Thread.sleep(10000); } catch (InterruptedException e) {}
		print(v);
		try { Thread.sleep(10000); } catch (InterruptedException e) {}
		print(v);
	}
	
}
