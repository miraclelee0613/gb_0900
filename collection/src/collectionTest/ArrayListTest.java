package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
//		<?> : ���׸�(�̸��� ����)
//		��üȭ �� Ÿ���� �����ϴ� ���
//		������ ������ Ÿ���� ������ �� ���� ������ �ӽ÷� Ÿ���� ������ �� ����Ѵ�.
//		���� �ٿ� ĳ������ �� �ʿ䰡 ������, ������ Ÿ�Կ� ������ �� �� �ִ�.

		ArrayList<Integer> datas = new ArrayList<Integer>();
		final int SIZE = 9;

//		C
		for (int i = 0; i < SIZE; i++) {
			if (i > 4) {
				datas.add((14 - i) * 10);
				System.out.println(datas.size());
				continue;
			}
			datas.add((i + 1) * 10);
			System.out.println(datas.size());
		}

////		R
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//		}
//
//		Collections.sort(datas);
////		Collections.reverse(datas);
//
////		R
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//		}

//		Collections.shuffle(datas);

////		R
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//		}

//		�߰�(����)
//		50 �ڿ� 500 ����
		if (datas.contains(50)) {
			datas.add(datas.indexOf(50) + 1, 500);
		}

		System.out.println(datas);
		System.out.println("\n=======500�߰��Ϸ�=========\n\n");
//		����
//		90�� 9�� ����

//		if (datas.contains(90)) {
//			datas.set(datas.indexOf(90), 9);
//			System.out.println(datas);
//			System.out.println("9 ���� �Ϸ�\n");
//		}

		if (datas.contains(90)) {
			int index = 0;
			index = datas.indexOf(90);
			datas.remove(index);
			datas.add(index, 9);
			System.out.println(datas);
			System.out.println("9 ���� �Ϸ�\n");
		}

//		����
//		80 ����
////		1. �ε����� ����
//		if (datas.contains(80)) {
//			datas.remove(datas.indexOf(80));
//		}
////		2. ������ ����
//		if (datas.remove(Integer.valueOf(80))) {
//		}
//		Object index80 = 80;
//		if (datas.remove((Object)80)) {}
		if (datas.remove((Integer)80)) {System.out.println("����");}
		System.out.println("\n80 ���� �Ϸ�\n");

		System.out.println(datas);
		
//		���� for��(forEach, ���� for��)
//		for(�ڷ��� ������ : ������ �ִ� ����)
		for(Integer data: datas) {
			System.out.println(data);
		}
		
		for(int data: datas) {
			System.out.println(data);
		}
		
		
	}
}
