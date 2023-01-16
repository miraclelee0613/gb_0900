package threadTask;

import java.util.stream.IntStream;

public class LockRotateTask {
//		��� �ִ� ���̾� �ڹ��谡 �ֽ��ϴ�. �� �ڹ��踦 Ǯ�� ���ؼ��� ��й�ȣ�� ���ݼ��� ���߾�� �մϴ�.
//		���� ���ݼ��� ���߾��� �ִ� ���� �� �ڸ��� ������, �Ǵ� �������� ȸ���Ͽ� ��й�ȣ�� ���� ���� �� �ֽ��ϴ�.
//		�̶�, �ڹ��踦 Ǯ�� ���� ȸ����Ű�� Ƚ���� �ּڰ��� ���Ϸ��� �մϴ�.
//		���� ���, ���� ���ݼ��� ���ڴ� "82195"�̰�, ��й�ȣ�� "64723"�̶�� ������ ���� ������ ���� �ڹ��踦 Ǯ �� �ֽ��ϴ�.
//	
//		- 1��° ��й�ȣ : 8->7->6(������ 2ȸ)
//		- 1��° ��й�ȣ : 2->3->4(������ 2ȸ)
//		- 1��° ��й�ȣ : 1->0->9->8->7(������ 4ȸ)
//		- 1��° ��й�ȣ : 9->0->1->2(������ 3ȸ)
//		- 1��° ��й�ȣ : 5->4->3(������ 2ȸ)
//		- �� Ƚ�� : 13ȸ
//		
//	���� �� ��� �̿ܿ��� �ٸ� ������� ȸ������ �ڹ��踦 Ǯ �� ������,
//	�ش� ������� �� ���� Ƚ���� �ڹ��踦 Ǫ�� ����� �����ϴ�. ���� �ּڰ��� 13�� �˴ϴ�.
//	���� ���ݼ��� �ִ� ���� P��, ��й�ȣ S�� �Ű������� �־��� ��,
//	�ڹ��踦 Ǯ�� ���� �ּ� ȸ�� Ƚ���� return �ϴ� solution �Լ��� �ϼ��� �ּ���.
//	
//	���� ����
//		- ��й�ȣ�� ���� : 1000 �ڸ� ������ �ڿ���
//		
//	����� ��
//	
//		���� ���ݼ�P			��й�ȣ S				�ּ� ȸ�� Ƚ�� result
//		"82195"					"64723"					13
//		"00000000000000000000"	"91919191919191919191"	20
//		
//	����� �� ����
//	����� �� # 1
//	���� �����ϴ�.

	// ���� ���ݼ�P�� ��й�ȣS�� �Է��Ͽ� �ּ� ȸ�� Ƚ���� ���ϴ� �޼ҵ�(public)
	public int rotate(String strP, String strS) {

		// �Էµ� ���ڿ��� ���̰� �ٸ� ��� ���� �߻�
		if (strP.length() != strS.length()) {

			try {
				throw new Exception("�Էµ� ���ڿ��� ���̰� �ٸ��ϴ�.");
			} catch (Exception e) {
				System.err.println("���� �޽��� : " + e.getMessage());
				e.printStackTrace();
			}
		}
		// �� ���ڿ��� �����迭�� �ٲٴ� �޼ҵ�
		int[] arIntP = str2Int(strP), arIntS = str2Int(strS);

		// �� �����迭�� ���� �ε������� ���Ͽ� ��� �� �� �ڹ��� ȸ�� ���� �����ϴ� �޼ҵ带 ����
		return rotateCount(arIntP, arIntS);
	}

	// ���ڿ��� �����迭�� �ٲٴ� �޼ҵ�
	private int[] str2Int(String str) {
		//
		// �ε����� ���� IntStream
		return IntStream
				// �ε��� ���̴� ���ڿ�str�� ���̸�ŭ
				.range(0, str.length())
				// �ε����� �̿��� ���ڿ�str�� �� ���ڸ� ����, ���� �״�θ� �����ϱ� ���� -> ���ڿ� -> IntegerŸ������ ����ȯ
//				.map(i ->Integer.parseInt("" + str.charAt(i)))
				// �ƽ�Ű�ڵ� �� ����'0'�� ������ 48�̹Ƿ� �׸�ŭ �������Ͽ� ���� 0 ~ 9�� ����
				.map(i -> str.charAt(i) - '0')
				// ���� �迭�� ����
				.toArray();

//		//	���� �迭�� ���̴� �Է¹��� ���ڿ��� ���̸�ŭ
//		int[] result = new int[str.length()];
//		
//		//	���� �迭�� ���̸�ŭ �ݺ�
//		for (int i = 0; i < result.length; i++) {
//			
//			//	�Է¹��� ���ڿ��� �� ���ڸ� �迭�� �� �ε������� ����
//			result[i] = str.charAt(i);
//		}

//		return result;

	}

	// �ڹ��� ��ȣ ȸ�� Ƚ���� ���� �޼ҵ�
	private int rotateCount(int[] arFirst, int[] arSecond) {
		int result = 0; // ������ ������� ���� ����
		// �Է¹��� �ƹ� �Ű������� ���̸�ŭ �ݺ�
		for (int i = 0; i < arSecond.length; i++) {
			// �� �ε����� ���� ����Ͽ� �ڹ��� ȸ�� Ƚ���� ���Ͽ� ���� ���� �����տ���
			result += rotateCalc(arFirst[i], arSecond[i]);
		}
		return result; // �ݺ��� ���� �� ����
	}

	// 0~9 ������ �� ���� �޾Ƽ� �ڹ��� ȸ���� �ּڰ��� ���ϴ� �޼ҵ�
	private int rotateCalc(int num1, int num2) {
		//	�ܼ��� �� ���� ���� ���밪���� ���ϸ� �Ʒ� �ּ��� ���� �ʿ����.
		int differ = (num1 - num2) < 0 ? num2 - num1 : num1 - num2;
		// �� ���� ���� 5���� ũ�� �� �ڸ��� ���ð����� ����((0~9) -> 10) - �� ���� ��(differ)�� �ϸ� ��. 
		return differ > 5 ? 10 - differ : differ;
//		boolean isBigNum1 = num1 > num2; // �Ű������� �� ���� ���Ͽ� ū ���� �Ǵ�
//		int bigOne = isBigNum1 ? num1 : num2 // �Ű����� �� ū �� ����
//				, smallOne = isBigNum1 ? num2 : num1; // �Ű����� �� ���� �� ����
//		int differ = bigOne - smallOne; // �Ű��������� ��(0 �Ǵ� ���)

		// �������� ����. ������ �Ʒ� �ּ�
//		return differ > 5 ? (smallOne + 10) - bigOne : differ;
		// 10ĭ�� ������ ����Ǿ� �ִٸ�, ���� �� �Ÿ��� 5�� ���ۿ� ������,
		// �� ���� ���� 5���� ũ�� �� ����(10) - ū ���� ���� ���� ��(differ)�� �ϸ� ��. 
//		return differ > 5 ? 10 - differ : differ;

//		if (differ > 5) {	//	�Ű������� ���̰� 5���� ũ��(�� 9, 3 -> 6)
//			return (smallOne + 10) - bigOne;	//	���� ���� 10�� ���Ͽ�(�� 9, 3+10) �� ���̸� ����(13-9=4) 4< 9-3
//		}
//		return differ;	//	�Ű������� ���̰� 5�����̸� ���̰� ����
	}

	public static void main(String[] args) {
		LockRotateTask lock = new LockRotateTask();
		String strS = "82195", strP = "64723";
		System.out.println(lock.rotate(strS, strP));

		strS = "00000000000000000000";
		strP = "91919191919191919191";	// 1�� 20�� = 20

		System.out.println(lock.rotate(strS, strP));

		strS = "00000000000000000000";
		strP = "55555555555555555555";	// 5�� 20�� = 100
		
		System.out.println(lock.rotate(strS, strP));
	}

}
