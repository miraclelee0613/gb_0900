package operTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		�� ���� ��Һ�
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, result = 0;
		System.out.println("������ �� �� �Է��ϼ���");
		System.out.print("�Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		result = num1 > num2 ? num1 : (num1 == num2 ? num1 : num2);
		System.out.println("�� ū ���� " + result);
	}
}
