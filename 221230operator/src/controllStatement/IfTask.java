package controllStatement;

import java.util.Scanner;

public class IfTask {
   public static void main(String[] args) {
//      ����ڿ��� �Ʒ��� �޴��� ����ϰ�
//      ��ȣ�� �Է¹޴´�.
	   int inputNum = 0;
	   String result = null;
	   final String RED = "������", BLACK = "������", YELLOW = "�����", WHITE = "���";
//      1. ������
//      2. ������
//      3. �����
//      4. ���
	   System.out.printf("1. %s\n2. %s\n3. %s\n4. %s\n", RED, BLACK, YELLOW, WHITE );
	   System.out.print("�Է� : ");
	   Scanner sc = new Scanner(System.in);
	   inputNum = sc.nextInt();

//      ����ڰ� �Է��� ��ȣ�� ������ ����� ����Ѵ�.
	   if(inputNum == 1) {
		   result = RED;
	   }else if(inputNum == 2) {
		   result = BLACK;
	   }else if(inputNum == 3) {
		   result = YELLOW;
	   }else if(inputNum == 4) {
		   result = WHITE;
	   }else {
		   result = "�߸� �Է��ϼ̽��ϴ�";
	   }
	   
	   System.out.println(result);
   }
}











