package threadTask;

public class Zoo {
	public static void main(String[] args) {
		Animal animal = new Animal();
		String[] sounds = {"����", "�޿�", "����"};
		Thread[] threads = new Thread[sounds.length];
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(animal, sounds[i]);
		}
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
			if(i != 0) {
				try {
					threads[i].join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
