package tomek.it.threads2;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class ThreadPools2 {
	
	public static void main(String[] args) {

		BlockingQueue<Runnable> runnables = new ArrayBlockingQueue<Runnable>(1024);
		ThreadPoolExecutor pool = new ThreadPoolExecutor(5, 10, 60, TimeUnit.SECONDS, runnables);

		/*
		 * Parameters:
		5   corePoolSize - the number of threads to keep in the pool, even if they are idle.
		10  maximumPoolSize - the maximum number of threads to allow in the pool.
		60  keepAliveTime - when the number of threads is greater than the core, 
		this is the maximum time that excess idle threads will wait for new tasks before terminating.
		TimeUnit.SECONDS  unit - the time unit for the keepAliveTime argument.
		runnables  workQueue - the queue to use for holding tasks before they are executed. 
		This queue will hold only the Runnable tasks submitted by the execute method.
		*/
				
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
		
		pool.shutdown();
		//pool.shutdownNow();
	}
	
}
