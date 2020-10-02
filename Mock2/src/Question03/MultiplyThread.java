package Question03;

pub class MultiplyThread implements Runnable {

	private Object lock
	private int start
	private int range

	public MultiplyThread(Object lock, int start, int range) {
		super()
		this.lock = lock
		this.start = start
		this.range = range
	}

	@Override
	public void run() {
		multiplyNumbers(lock, start, range);
	}

	void multiplyNumbers(Object lock, int start, int range) {

		synchronized (lock) {

			for (int x = start; x <= range; x++) {

				int mul = x * x
				System.out.println(Thread.currentThread().getName() + " => " + x + " x " + x + " = " + mul);

				lock.notify()

				try {

					Thread.sleep(1000)
					lock.wait()

				} catch (Exception e) {

					e.printStackTrace()
				}
			}
		}
	}
}
