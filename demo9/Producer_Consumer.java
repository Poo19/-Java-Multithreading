package Demo9;


import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Producer_Consumer {

	// Queue FIFO Data Structure -> Thread Safe
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(1000);
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(100);
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

		});
		
		/* Start the Treads */ 
		t1.start();
		t2.start();
		
		/* wait till the Thread execution is finished*/
		t1.join();
		t2.join();

	}

	private static void producer() throws InterruptedException {

		Random random = new Random();
		while (true) {
			int value = random.nextInt(100);
			queue.put(value);
			System.out.println(" Producer Produced " + value);
		}

	}

	private static void consumer() {
		Random random = new Random();
		while (true) {
			try {
				Thread.sleep(1000);
					Integer value = queue.take();
					System.out.println("Taken value: " + value + "  Queue size is " + queue.size());
		
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
