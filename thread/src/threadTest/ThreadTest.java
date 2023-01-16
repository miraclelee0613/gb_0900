package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
//		Thread2 thread = new Thread2();
//		Thread t1 = new Thread(thread, "?");
//		Thread t2 = new Thread(thread, "!");
		
		Runnable target = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {Thread.sleep(200);} catch (InterruptedException e) {;}
			}
		};
		
		
		Thread t1 = new Thread(target, "?");
		Thread t2 = new Thread(target, "!");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
//		Thread1 t1 = new Thread1("��");
//		Thread1 t2 = new Thread1("��");
//		
//		t1.start();
//		t2.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

//		t1.run();
//		t2.run();

	}
}
