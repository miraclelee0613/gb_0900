package collectionTask;

import java.util.Scanner;

//[��ȭ �ǽ�]
//Page Ŭ���� ����
//- main �޼ҵ� ����
//- �׽�Ʈ ����
//- ���̵� �ߺ��˻�
//- ȸ������
//- �α���
//- ��ȣȭ
//- ��й�ȣ ����(��й�ȣ ã�� ����)
//- ������ȣ ����
public class Page {
	public static void main(String[] args) {
		User ljs = new User();
		
		String inputId = "ljs1993", inputName ="���ػ�", inputPassword = "1324", inputPhoneNumber = "01077287518";

		// ��� �׽�Ʈ
		ljs.setId(inputId);
		ljs.setName(inputName);
		ljs.setPassword(inputPassword);
		ljs.setPhoneNumber(inputPhoneNumber);
		
		// ���� Ȯ��
		System.out.println(ljs);

		// ��� �� -> null�� ����
		System.out.println(UserField.checkExistId(inputId) + "-> ��� ��");

		// ��� ��
		if (UserField.register(ljs) != null) {
			System.out.println("��� �Ϸ�");
		} else {
			System.out.println("��� ����");
		}
		System.out.println("==================");
		
		// �ߺ� �˻� �׽�Ʈ
		// null or �������� ���
		System.out.print("�ߺ��˻� �׽�Ʈ -> ");
		System.out.println(UserField.checkExistId(inputId));

		// ��� Ȯ�� �׽�Ʈ
		System.out.println(ljs/* .toString() */);

		// �α����׽�Ʈ
		System.out.println(UserField.login(ljs));

		// ��ȣȭ �׽�Ʈ
//		System.out.println(UserField.encrypt(inputPassword));		

		// ��й�ȣ ���� �׽�Ʈ
//		System.out.println("������ -> " + UserField.dencrypt(ljs.getPassword()));
//		ljs.setPassword(UserField.encrypt("1q2w3e4r"));
//		System.out.println(UserField.changePassword(ljs) + "-> ��й�ȣ ���� �׽�Ʈ");
//		System.out.println("���� �� ->" + UserField.dencrypt(ljs.getPassword()));

		// ������ȣ ���� �׽�Ʈ
//		System.out.println(UserField.generateCertifyNum());

//		String certifyNum = UserField.generateCertifyNum();
		String phoneNum = ljs.getPhoneNumber();

		//	���� ���� �׽�Ʈ
//		System.out.println("������ȣ ���ڸ� �߼��մϴ�.");
//		UserField.sendCertifyMsg(certifyNum, phoneNum);
		
		//	������ȣ �Է� �� ��ġ Ȯ�� �׽�Ʈ
//		Scanner sc = new Scanner(System.in);
//		System.out.print("������ȣ �Է�: ");
//		boolean booleanVal = UserField.checkCertify(certifyNum, sc.nextLine());
//		
//		System.out.println("������ȣ ��ġ����: " + booleanVal);
		
		
		
		
		
	}
}
