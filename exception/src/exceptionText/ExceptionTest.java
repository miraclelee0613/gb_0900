package exceptionText;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
			System.out.println("���� ����");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
//			e.printStackTrace();	// ����
			System.err.println(e.getMessage());
			System.err.println(e);
		} catch (Exception e) {
			e.printStackTrace();	// ����
		}
	}
}
