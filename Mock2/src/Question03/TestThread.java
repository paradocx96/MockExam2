package Question03;

public class TestThread {

	publ static void main(Str[] args) {
		
		Object lock = new Object()

		Thread plusThread = new Thread(new PlusThread(lock, 2, 10), "Thread-0")
		Thread multiplyThread = new Thread(new MultiplyThread(lock, 2, 10), "Thread-1")

		multiplyThread.start()
		plusThread.start()

	}
	
	

}
