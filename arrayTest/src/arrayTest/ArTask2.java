package arrayTest;

import java.util.Scanner;

public class ArTask2 {
	public static void main(String[] args) {
//		�� ��ư�� ������ ��, �̵��ϴ� �������� ������ ����.

//		btn1 :	ȸ������ ������ 
//		btn2 : 	�α��� ������
//		btn3 : 	���� ������

//		ȸ������ -> �α��� -> ���� ������
//		�� ������� �Է��ؾ� �ϸ�, ���� ���� �ܰ踦 �����ϱ� ���� ���� �ܰ� ��ư�� ���� ���, ���� �ܰ迡 ���� �޽����� ������ش�.
//		��) �α��� Ŭ�� ��, "ȸ�������� ���� �������ּ���" ���

//		�˸��� �ܰ��� ��ư�� ������, �ش� �ܰ迡 ���� �޼����� ������ش�.
//		��) ȸ������ Ŭ�� ��, ȸ������ ����
//		���������� Ŭ�� ��, ���� �̸��� ���� ���

		String[] arBtn = { "btn1", "btn2", "btn3", "btn4", "btn5" };
		
		final int EXIT = 0, SIGN_IN = 1, LOGIN = 2, MY_PAGE = 3, LOGOUT = 4;
		
		
		arBtn[EXIT] = "���α׷� ����";
		arBtn[SIGN_IN] = "ȸ������ ������";
		arBtn[LOGIN] = "�α��� ������";
		arBtn[MY_PAGE] = "���� ������";
		arBtn[LOGIN] = "�α׾ƿ�";
		
		int choice = 0; // ����� �Է��� ���� ����
		int needChoice = 1; // ������ ���Կ� �ʿ��� ���� ���� ����
		Scanner sc = new Scanner(System.in); // ��ĳ�� ����
		String msgChoice = "���ϴ� �������� �ش��ϴ� ���ڸ� �Է����ּ���."
				+ "\n1.%s\n2.%s\n3.%s\n4.%s\n5.%s"
				// 1.ȸ������ 2.�α��� 3.���������� 4.�α׾ƿ� 5.���α׷� ����
				+ "\n�Է� :";
		// ���� �ȳ� �޽��� ����
		
		String splitLine = "--------", sl1 = "\n" + splitLine, sl2 = splitLine + "\n";
		
		String[] arMsgErr = { "�߸� �Է��ϼ̽��ϴ�.",
				"ȸ�������� ���� �������ּ���.",
				"�α����� ���� �������ּ���.",
				"���� �������� �����������Դϴ�.",
				"�̹� ������ �����Դϴ�." };
		// ���� �޽��� ����

		String[] arMsgWelcome = { "���α׷��� �����մϴ�.", "ȸ������ ����", "�α��� ����", "���ػ�(30)", "�α׾ƿ��մϴ�." };
		// ���� �޽��� ����

		for (int i = 0; i < arMsgWelcome.length; i++) {arMsgWelcome[i] = sl1 + arMsgWelcome[i] + sl2;}
		// ���뼱 �߰�
		
		for (int i = 0; i < arMsgErr.length; i++) {arMsgErr[i] = sl1 + arMsgErr[i] + sl2;}
		// ���뼱 �߰�
		
		while (true) {
			System.out.printf(msgChoice, arBtn[SIGN_IN], arBtn[LOGIN], arBtn[MY_PAGE], arBtn[LOGOUT], arBtn[EXIT]);
			// ���� �ȳ� �޽��� ������ %s�� ��µ� ��������

			choice = sc.nextInt();
			// ���ð��� ����.
			
			if (choice == LOGOUT) {
				// �α׾ƿ��� ���� ���
				System.out.println(arMsgWelcome[LOGOUT]);
				needChoice = LOGIN;
				// ȸ�������� ������ �α��κ��� ����
				continue;
			}else if(choice == EXIT) {
				// ���α׷� ���Ḧ ���� ���
				System.out.println(arMsgWelcome[EXIT]);
				sc.close();
				break;
				// �ݺ��� Ż��
			}
			
			if (needChoice < choice && choice <= LOGOUT) {
				// ���ð��� �䱸������ ���� ���
				// ��) ȸ������(needChoice==1)�� ���ߴµ� �α���(choice==2)�� �Ϸ��� ���
				// ��, ���ð��� ������ ���� �̳��� ���� ����

				System.out.println(arMsgErr[choice]);
				// ���ð��� arMsgErr[��]�� ���� ��ġ��ų �� ������ �� �ٷ� ����
//				
			} else if (needChoice == choice) {
				needChoice++; // �䱸���� ���ð��� ������ ���� ������ �Ѿ�� ���� �䱸�� 1����

				System.out.println(arMsgWelcome[choice]);
				//	���ð��� �ε����� ��ġ�ϴ� �� �ٷ� ó�� ����
				
			} else if (needChoice > MY_PAGE && choice == MY_PAGE) {
				// �䱸 ���� ��ȣ�� ���������� �ʰ��ε�(�� ���������� �����ߴµ�)
				// 4�� ������ ���
				System.err.println(arMsgErr[3]);
				// �̹� ������������� ���� ���� ���
			} else if(needChoice > choice && choice >= 1 && choice < 4) {
				System.out.println(arMsgErr[4]);
				// �̹� �ռ� ������ �ߴµ� �ٽ� �Ϸ��� ���
			} else {
				// �� ��� ��쵵 �ƴ϶��
				System.err.println(arMsgErr[0]);
				// �߸� �Է� �޽��� ���

			}
			System.out.println();
			// �������� ���� �ٹٲ�
		}

	}
}
