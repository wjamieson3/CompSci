package javaThreadDemo;

public class thread implements Runnable {

	@Override
	public void run() {
		// moving thread2 to timed waiting state
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//after thread2 sleeping, thread1 is waiting because of join()
		System.out.println("State of thread1 while it called join() method on thread2 -" + Test.thread1.getState());
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
