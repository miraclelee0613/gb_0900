package codingTest;

public class ThreadTaskBefore extends Thread implements Runnable {

	// ���ѽð� : 1�ð�
	// 3���� �����尡 �ִ�.
	// Thread1, Thread2, Thread3
	// ����ڰ� �Է��� ������� �� �˸´� ���ڿ��� ��µȴ�.

	// �Է� ��) 3 1 2
	// ��� ��) third first second

	// ��, Thread���� �׻� 1, 2, 3 ������ ����Ǿ�� �Ѵ�.

	// Thread1 : third
	// Thread2 : first
	// Thread3 : second

	// ��� �� �������� ��ȣ�� ����� ��� ���������� ó���Ѵ�.

	public ThreadTaskBefore() {
		;
	}

	public ThreadTaskBefore(Runnable target, String name) {
		super();
	}

	@Override
	public void run() {
		System.out.print(Thread.currentThread().getName() + " : ");
	}

	public void printFirst(Runnable first) {
		first.run(); // ���� ����
	}

	public void printSecond(Runnable second) {
		second.run(); // ���� ����
	}

	public void printThird(Runnable third) {
		third.run(); // ���� ����
	}

}
