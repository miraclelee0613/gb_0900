package arrayTest;

import java.util.Scanner;

public class ArTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
////		�����
////		1~10���� �迭�� ��� ���
//		int[] arData1 = new int[10];
//		for (int i = 0; i < arData1.length; i++) {
//			arData1[i] = i + 1;
//			System.out.print(arData1[i]);
//		}
//		System.out.println("\n============1====");

////		10~1���� �� ¦���� �迭�� ��� ���
//		int[] arData2 = new int[5];
//		for (int i = 0; i < arData2.length; i++) {
//			arData2[i] = 10 - i * 2;
//			System.out.print(arData2[i] + " ");
//		}
//		System.out.println("\n=========2==========");

////		1~100���� �迭�� ���� �� Ȧ���� ���
//		int[] arData3 = new int[100];
//		for (int i = 0; i < arData3.length; i++) {
//			arData3[i] = i + 1;
//			if (arData3[i] % 2 == 0) {continue;}
//			System.out.print(arData3[i] + " ");
//		}
//		System.out.println("\n============3=============");

////		�ǹ�
////		1~100���� �迭�� ���� �� ¦���� �� ���
//		int[] arData4 = new int[100];
//		int total4 = 0;
//		for (int i = 0; i < arData4.length; i++) {
//			arData4[i] = i + 1;
//			if ((i + 1) % 2 == 0) {
//				total4 += i + 1;
//			}
//		}
//		System.out.print(total4);
//
//		System.out.println("\n============4=============");

////		A~F���� �迭�� ��� ���
//		char[] arData5 = new char[6];
//		for (int i = 0; i < arData5.length; i++) {
//			arData5[i] = (char)('A' + i);
//			System.out.print(arData5[i] + " ");
//		}
//		System.out.println("\n============5=============");

////		A~F���� �� C �����ϰ� �迭�� ���� �� ���
//		char[] arData6 = new char[5];
//		for (int i = 0; i < arData6.length; i++) {
//			if (i < 2) {
//				arData6[i] = (char)('A' + i);
//			} else {
//				arData6[i] = (char)('A' + 1 + i);
//			}
//			System.out.print(arData6[i] + " ");
//		}
//		System.out.println("\n============6=============");

////		���
////		5���� ������ �Է¹ް� ���� �� �ִ밪�� �ּҰ� ���
//		int[] arData7 = new int[5];

//		int max = 0;
//		int min = 0;
//		System.out.println("���� 5�� �Է�\n�Է�: ");
//		for (int i = 0; i < arData7.length; i++) {
//			arData7[i] = sc.nextInt();
//		}
//		max = arData7[0];
//		min = arData7[0];
//		for (int i = 0; i < arData7.length; i++) {
////			if (i == 0) {
////				min = arData7[i];
////			}
//			if (max < arData7[i]) {
//				max = arData7[i];
//			} else if (min >= arData7[i]) {
//				min = arData7[i];
//			}
//		}
//		System.out.println("max: " + max + "\nmin: " + min);
//		System.out.println("\n============7=============");

//		���̾�
//		����ڰ� �Է��� ������ ������ŭ �迭�� ���� �� ������ �Է¹ް� ��� ���ϱ�
		System.out.print("\n����ڰ� �Է��� ������ ���� �Է�: ");
		double avg = 0;
		int total = 0;
		int[] arData8 = null;
		arData8 = new int[sc.nextInt()];
		System.out.printf("���� %d�� �Է�(���� Ȥ�� ���ͷ� ����\n�Է�: ", arData8.length);
		for (int i = 0; i < arData8.length; i++) {
//			System.out.printf("\n�Է��� ����%d: ", i + 1);
			arData8[i] = sc.nextInt();
		}
		for (int i = 0; i < arData8.length; i++) {
			total += arData8[i];
		}
		avg = total / arData8.length;
		System.out.println("���: " + avg);

		System.out.println("\n============8=============");

	}
}
