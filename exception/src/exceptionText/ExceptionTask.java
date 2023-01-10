package exceptionText;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//		5���� ������ �Է¹ޱ�
//			- ���� �Է� ���·� ����
//			- q �Է� �� ������
//			- �� ������ �迭�� ���
//			- if���� �� �� ���� ����ϱ�
		Scanner sc = new Scanner(System.in);
		String tempStr = null, startMsg = "5���� ������ ���⸦ �̿��� �����Ͽ� �Է��� �ּ���.\n������: q �Է�\n�Է�: ";
		int[] arInt = new int[5];
		for (int i = 0; i < arInt.length; i++) {
			System.out.print(startMsg);
			tempStr = sc.next();
			tempStr = tempStr.toLowerCase();
			if (tempStr.equals("q")) {
				System.out.println("�����մϴ�.");
				break;
			}

			try {
				arInt[i++] = Integer.parseInt(tempStr);
			} catch (NumberFormatException e) {
				System.out.println("������ �Է��� �ּ���.\n");
				tempStr = null;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5���� ������ �Է��� �ּ���.\n");
				for (int j = 0; j < arInt.length; j++) {
					System.out.print(arInt[i] + " ");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
