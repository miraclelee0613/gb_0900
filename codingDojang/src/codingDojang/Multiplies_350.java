package codingDojang;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Multiplies_350 {
	public static void main(String[] args) {
//		https://codingdojang.com/scode/350
//		10�̸��� �ڿ������� 3�� 5�� ����� ���ϸ� 3,5,6,9�̴�. �̵��� ������ 23�̴�.
//
//		1000�̸��� �ڿ�������| 3,5�� ����� ������ ���϶�.

		// ��1
//		int sum = 0;
//		for (int i = 0; i < 1000; i++) {
//			if (i % 3 == 0 || i % 5 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);

		// �����ڵ�
//	    import java.util.stream.IntStream;
//	    public static void main(String[] args) {
//	        System.out.println(String.format("����: %d", foo(1000)));
//	    }
//
//	    private static int foo(int end) {
//	        return IntStream.range(1, end).filter(j -> j%3==0 || j%5==0).sum();
//	    }

		// Ŀ������ �����ϰ� ���� ����
		int start = 1; // ���۰��� ���� ���� ����
		int end = 1000; // ������ ���� ���� ����
		Scanner sc = new Scanner(System.in); // �Է±�� �ҷ�����
		System.out.print("�Է��� ���� ��� ����� ���� ���ϴ� ���α׷��Դϴ�.\n�Է��� ���� ������ �Է��ϼ���.\nEnter: ");
		int ea = sc.nextInt(); // �Է��� ���� ������ ���� ����. �ȳ� �޽������� ����
		int[] factors = new int[ea]; // �Է��� ���� ������ �̿��� �迭�� ���̸� ����.

		System.out.print("���۰��� ������ �Է����ּ���.\nEnter: ");
		start = sc.nextInt(); // �Է����� ���۰� ������ ����
		end = sc.nextInt(); // �Է����� ���� ������ ����

		System.out.printf("\n%d���� ���� �����̳� Enter�� ���������� �Ͽ� �Է����ּ���.\nEnter: ", ea);
		for (int i = 0; i < factors.length; i++) { // factors.length ��� ea�� �ᵵ ���������� ������ ���ظ� ���� �״�� ��.
			factors[i] = sc.nextInt(); // �迭�� ���̸�ŭ ���� �Է¹޾� �迭�� ä���ֱ�.
		}

		System.out.println("����: " + sumByFactors(start, end, factors)); // ������ ���� ������ �̿��� sumByFactors�޼ҵ带 ����Ͽ� ���� ��ȯ����.
		sc.close(); // �ʿ�� ������ ��������� �Ű澲�� ���� �ڵ�. ��ĳ�ʸ� �ݾ��ش�.
	}

	private static int sumByFactors(int start, int end, int[] factors) {
		// ����� ������� ��� ����� ���� ���ϴ� ����� �޼ҵ�

		return IntStream.range(start, end) // ������ ���ϴ� �κ�
				.filter(j -> { // ���ǽ� �Է��ϴ� �κ�
					boolean tf = false; // return�� ���ǽ��� ���� �� ���� ����
					for (int i = 0; i < factors.length; i++) { // �Ķ���ͷ� ���� �迭�� ���� ��ŭ �ݺ�
						tf = tf || j % factors[i] == 0;
						// ������ ��(j)�� �Ķ���ͷ� ���� �迭(int[] factor)�� �� ��(factor[i])�� ���� �������� 0�̸�
						// factor[i]�� j�� ����� ���̹Ƿ� true�� ������ �̸� ������ tf���� ||(�Ǵ�)���� ������.
					}
					return tf; 	// ��� �ݺ��� ������ ���� tf ���� ��ȯ��.
				}).sum(); 		// �� ������ true�� range���� ���� ���� ��� ���ϰ� return��.
	}
}
