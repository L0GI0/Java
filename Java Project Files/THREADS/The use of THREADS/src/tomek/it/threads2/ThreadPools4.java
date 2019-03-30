package tomek.it.threads2;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;



public class ThreadPools4 {

	public static synchronized void print(Vector<Future<?>> v) {

		for (Future<?> future : v) {
			System.out.print(future.isDone()+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		BlockingQueue<Runnable> runnables = new ArrayBlockingQueue<Runnable>(1024);
		ThreadPoolExecutor pool = new ThreadPoolExecutor(5, 10, 30, TimeUnit.SECONDS, runnables);
		
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
		
		pool.setKeepAliveTime(3, TimeUnit.SECONDS);
		System.out.println(pool.getCompletedTaskCount());
		print(v);
		try { Thread.sleep(10000); } catch (InterruptedException e) {}
		System.out.println(pool.getCompletedTaskCount());
		print(v);
		try { Thread.sleep(10000); } catch (InterruptedException e) {}
		System.out.println(pool.getCompletedTaskCount());
		print(v);
	}
	
}
