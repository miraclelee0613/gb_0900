package controllStatement;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
//		�����
//		1 ~ 100���� ���
		for (int i = 0; i < 100; i++) {
			System.out.print(i + ", ");
		}
		System.out.println("\n�����1\n");
		
//		100 ~ 1���� ���
		for (int i = 0; i < 100; i++) {
			System.out.print(100 - i + ", ");
		}
		System.out.println("\n�����2\n");
		
//		1 ~ 100���� �� ¦���� ���
		// ���1
		for (int i = 0; i < 100; i++) {
			if ((i+1)%2 == 0) {
				System.out.print(i+1 + ", ");
			}
		}
		System.out.println("\n���1\n");
		
		// ���2
		for (int i = 0; i < 50; i++) {
			System.out.print((i+1)*2 + ", ");
		}
		System.out.println("\n���2");
		
		System.out.println("\n�����3");
		
//		�ǹ�
//		1 ~ 100���� �� ���
		int result = 0;
		for (int i = 1; i <= 100; i++) {
			result+=i;
		}
		System.out.println(result);
		
//		1 ~ n���� �� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("\nn������ ���� ���մϴ�. n�� �Է����ּ���\n�Է�: ");
		int inputNum = sc.nextInt();
		int resultN = 0;
		for (int i = 0; i < inputNum; i++) {
			resultN += i+1;
		}
		System.out.println(resultN);
		
//		���
//		A~F���� ���
		for (int i = 0; i < 6; i++) {
			System.out.print((char)('A'+i) + ", ");
		}
		System.out.println("\n���1\n");
		
//		A~F���� �� C�����ϰ� ���
		for (int i = 0; i < 5; i++) {
//			if (i!=2) {
//				System.out.print((char)('A'+i) + ", ");
//			}
			System.out.print((char)((i+'A')>'B' ? (char)'A'+i+1 : (char)'A'+i));
			System.out.print(", ");
		}
		System.out.println("\n���2");
		
//		���̾�
//		0 1 2 3 0 1 2 3 0 1 2 3 ���
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(j + ", ");
			}
		}
		System.out.println("\n���̾�1\n");
		
//		����
		for (int i = 0; i < 12; i++) {
			System.out.print(i%4 + ", ");
		}
		System.out.println("\n���̾�2\n");
		
//		aBcDeFgH...Z ���
		for (int i = 0; i < 26; i++) {
			if ((i+1)%2!=0) {
				System.out.print((char)('a'+i) + ", ");
			}else {
				System.out.print((char)('a'-32+i) + ", ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
