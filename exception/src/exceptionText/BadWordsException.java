package exceptionText;

// Exception ���: �����Ϸ��� üũ
// RuntimeException: �����Ϸ��� üũ���� ����
public class BadWordsException extends Exception {
	public BadWordsException(String message) {
		super(message);
	}
}
