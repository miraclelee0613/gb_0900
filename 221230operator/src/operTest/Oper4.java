package operTest;

import java.util.Scanner;

public class Oper4 {
	public static void main(String[] args) {
//      �ɸ� �׽�Ʈ
		/*
		 * Q. ����� �����ϴ� ���� �����ϼ���. 1. ������ 2. ����� 3. ������ 4. ���
		 * 
		 * ������ : �Ұ��� �������̰� �������̴�.
		 * ����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.
		 * ������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.
		 * ��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.
		 * 
		 */
//		������ ����� �����Ͽ� ���뼺�� ����.
		final String RED = "������", BLACK = "������", YELLOW = "�����", WHITE = "���";
		
//		���� �޽����� ����� �����Ͽ� ���������� �����ϰ� ��.
		final String RED_MSG = "�Ұ��� �������̰� �������̴�.", BLACK_MSG = "�����ϰ� ����ϰ� ��ö�ϰ� ������.",
				YELLOW_MSG = "�߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.", WHITE_MSG = "õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
		

		String msg = null/*����޽��� ���� �� �ʱ�ȭ*/, question = "Q. ����� �����ϴ� ���� �����ϼ���.";//		�Է� �� ��� �޽���
		int choice = 0;// �Է°��� ���� ����

//		printf�� �̿��� ��� ���
		System.out.printf("%s\n1. %s\n2. %s\n3. %s\n4. %s\n", question, RED, YELLOW, BLACK, WHITE);
		
//		�Է��� �ޱ� ���� ��� �޽���
		System.out.print("�Է� : ");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		msg =	// ���ǿ� ���� ������ ���� ���� �޶���.
				choice == 1 ? RED + " : " + RED_MSG	// �Է¹��� ���� 1�� ���
				: choice == 2 ? YELLOW + " : " + YELLOW_MSG	// �Է¹��� ���� 2�� ���
						: choice == 3 ? BLACK + " : " + BLACK_MSG	// �Է¹��� ���� 3�� ���
								: choice == 4 ? WHITE + " : " + WHITE_MSG	//	�Է¹��� ���� 4�� ���
										: "�߸� �Է��ϼ̽��ϴ�";	// �� ��찡 ��� �ƴ� ���
		System.out.println(msg);	// �ϰ�ó���� ���

	}
}