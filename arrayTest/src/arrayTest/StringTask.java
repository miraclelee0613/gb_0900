package arrayTest;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
//		����ڿ��� �Է¹��� ���ڿ� �� �ҹ��ڴ� ��� �빮�ڷ�,
//		�빮�ڴ� ��� �ҹ��ڷ� �����Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���\n�Է�: ");
		String str = sc.nextLine();
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char dum = str.charAt(i);	// ���ڿ��� �� ���ڸ� char�� �ٲپ� dum�� �ӽ÷� ��´�.
			if (dum >= 'A' && dum <= 'Z') {	//	dum�� ���ڰ� �빮�� ������ ���� ���
				result += (char) (dum + 32);	// 32�� ���ؼ� �ҹ��ڷ� �ٲ��ش�.
			} else if (dum >= 'a' && dum <= 'z') {	// �ҹ��� ������ ���� ���
				result += (char) (dum - 32);	// 32�� ���� �빮�ڷ� �ٲ��ش�.
			} else {
				result += dum;	// �� ������ ����ٸ� �״�� ����Ѵ�.
			}

		}
		System.out.println(result);

//		������ �ѱ۷� ����
//		��) 1024 -> �ϰ��̻�
		char[] hans = new char[10];
		final String han = "�����̻�����ĥ�ȱ�";
		String inputNum = null;
		String resultStr = "";

		for (int i = 0; i < 10; i++) {
			hans[i] = han.charAt(i);
		}

		System.out.print("���ڸ� �Է��ϼ���\n�Է�: ");
		inputNum = sc.next();

		for (int i = 0; i < inputNum.length(); i++) {
//			resultStr += hans[Integer.parseInt("" + inputNum.charAt(i))];
//			resultStr += han.charAt(inputNum.charAt(i) - 48);
//			System.out.println(resultStr);
		}
		System.out.println(resultStr);

	}
}
