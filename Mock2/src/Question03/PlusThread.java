package Question03;

public class PlusThread implements Runnable {
	private Object lock;
	private int start;
	private int range;

	public PlusThread(Object lock, int start, int range) {
		super();
		this.lock = lock;
		this.start = start;
		this.range = range;
	}

	@Override
	public void run() {
		addNumbers(lock, start, range);
	}

	public void addNumbers(Object lock, int start, int range) {
		synchronized (lock) {
			for (int x = start; x <= range; x++) {
				int sum = x + x;
				System.out.println("Thread-0 => " + x + " + " + x + " = " + sum);
				lock.notify();
				try {
					Thread.sleep(1000);
					lock.wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
