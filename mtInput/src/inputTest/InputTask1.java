package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
//		�� ������ �Է��� �� ���� ��� ���
//		��, next()�� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		System.out.println("������ �� �� �Է����ּ���.");
		System.out.print("�Է� :");
		num1 = Integer.parseInt(sc.next());
		num2 = Integer.parseInt(sc.next());
		result = num1 + num2;
		System.out.println("��� :" + result);
	}
}
