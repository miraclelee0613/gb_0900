package methodTest;

public class MethodTest {
//	�� ������ ���� �޼ҵ� ����
	public int multiple(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
//	static
//		�����Ϸ��� ���� ���� �޸𸮿� �Ҵ����ش�.
//		�Ϲ� �޼ҵ带 static �޼ҵ忡�� ����ϱ� ���ؼ��� �Ʒ��� �� ���� ����� �����Ѵ�.
//		1. �Ϲ� �޼ҵ忡 static�� �ۼ��Ͽ� ���� �ð��뿡 �޸𸮷� �÷��ش�.
//		1. �Ϲ� �޼ҵ��� �Ҽ��� �˷��ش�.

	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		int result = mt.multiple(1, 3);
		result += 9;
		System.out.println(result);
	}
}
