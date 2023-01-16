package threadTask01;

import java.util.ArrayList;

public class ThreadTask01 {
//	'0'�� '1'�θ� �̷���� ���ڿ��� �ֽ��ϴ�.
//	�� ���ڿ����� '1'�� �ִ� �� �� �����ؼ� ��Ÿ������ ���Ϸ� �մϴ�.
//	���� ��� 110111 �̶�� ���ڿ��� �־����� ��,
//	'1'�� ������ ��Ÿ���� ���� �� ���� 11 �� �� ���� 111 �Դϴ�.
//	�� ��� 1�� �ִ� 3�� �����ؼ� ��Ÿ�����ϴ�.
//
//	'0'�� '1'�θ� �̷���� ���ڿ� s�� �Ű������� �־��� ��,
//	�� ���ڿ����� '1'�� �ִ� �� �� �����ؼ� ��Ÿ������ return �ϵ��� solution �Լ��� �ϼ��� �ּ���.
//
//	���ѻ���
//		- s�� ���̴� 3 �̻� 5,000 �����Դϴ�.
//		- s�� '0'�� '1'�θ� �����Ǿ� �ֽ��ϴ�.
//		
//	����� ��
//		s			result
//		"110111"	3
//		"00000"		0
//		
//	����� �� ����
//		����� �� #1
//		������ ���ÿ� �����ϴ�.
//		
//		����� �� #2
//		���ڿ��� '0'���θ� �����Ǿ� �ֽ��ϴ�. '1'�� �ִ� 0�� �����ؼ� ��Ÿ���ϴ�.

	// ���ӵ� �� �� ���� ū ���� �����ϴ� �޼ҵ�
	public static int getMaxCount(String str) {
		int result = 0;	//	 �ᱣ���� ���� ���� ����
		//	 makeArInt�޼ҵ�� str���� {"111", "1", "11", "11"}ó�� �ٲٰ� �� 1�� ������ ���ϴ� �޼ҵ�
		ArrayList<Integer> tempArList = makeArInt(str);	//	{ 3, 1, 2, 5}�� ���� ����� ����
		
		for (Integer i : tempArList) {	//	�� ���� ������
			if(i >= result) {	//	���� ������ ���� ������ �ִ밪���� ũ�ų� ������
				result = i;	//	������ ���� �� ū ���̹Ƿ� �ᱣ���� ����.
			}
		}	//	�� ������ tempArList�� ���̸�ŭ �ݺ�
		return result;	//	���� �ᱣ���� �ִ��̹Ƿ� ����
	}

	//	"1100111001" ���� ���� StringŸ������ �޾� 0�� �ϳ��� ����� ���� ����(�����ڿ����� �ϳ� ����)
	//	"11011101"�� �ǰ� �̸� split()�� �̿��� 0�� ���������� �Ͽ� �迭�� ����
	//	{"11", "11","1"} �׸��� �迭�� �� ���� String.length()�� ArrayList<Integer>�� ��� �����ϴ� �޼ҵ�
	public static ArrayList<Integer> makeArInt(String str) {
		ArrayList<Integer> arResult = new ArrayList<Integer>();	//	ArrayList<Integer>�� Ÿ���� ��� ������ ���� ����
		
		while(str.contentEquals("00")) {	//	�������� �� 0�� //
			str = str.replaceAll("00", "0");
		}
		
		String[] arString = str.split("0");
		for (String string : arString) {
			arResult.add(string.length());
		}
		
		return arResult;
	}

	public static void main(String[] args) {
		System.out.println(getMaxCount("1101111"));
		System.out.println(getMaxCount("00000"));
	}
}
