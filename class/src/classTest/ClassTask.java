package classTest;

class SuperCar {
//	�귣��, ����, ����
	String brand;
	String color;
	int price;

	String password;
	int wrongInput;

//	���� ����
	boolean engineStatus;

	{
//		engineStatus = false;
		password = "1324";
		wrongInput = 0;
	}

//	������
	SuperCar(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

//	�õ��ѱ�
	boolean engineStart() {
		engineStatus = engineStatus ? false : true;
		return engineStatus;
	}

	boolean engineStop() {
		engineStatus = engineStatus ? true : false;
		return engineStatus;
	}

	void turnOn() {
//	���� ���¸� Ȯ���ϰ�
//		if (this.engineStatus == false) {
		if (!this.engineStatus) {
//	�õ��� �����ִٸ�, "�õ� �ѱ�" ���
			this.engineStatus = true;
			System.out.println("�õ� �ѱ�");
//		} else if (this.engineStatus == true) {
		} else {
//	�̹� �õ��� �����ִٸ�, "�̹� �õ��� ���� �ֽ��ϴ�" ���
			System.out.println("�̹� �õ��� ���� �ֽ��ϴ�");
		}
	}

//	�õ�����
	void turnOff() {
//		���� ���¸� Ȯ���ϰ�
//		if (this.engineStatus == true) {
		if (this.engineStatus) {
//		�õ��� �����ִٸ�, "�õ� ����" ���
			this.engineStatus = false;
			System.out.println("�õ� ����");
//		} else if (this.engineStatus == false) {
		} else {
//		�̹� �õ��� �����ִٸ�, "�̹� �õ��� ���� �ֽ��ϴ�" ���
			System.out.println("�̹� �õ��� ���� �ֽ��ϴ�");
		}
	}

//	�õ��� �ѱ� ���ؼ� ��й�ȣ 4�ڸ��� �Է¹޾ƾ� �Ѵ�.
//	3�� ���� �߸� �Է����� �� "���� �⵿" ���
//	���ڿ� �񱳴� ==�� �ƴ� equals()�� ���Ѵ�.

	
	
	
//	boolean engineStartByPw(String password) {
//		while (wrongInput < 3) {
//			if (password.equals(this.password)) {
//				turnOn();
//				return true;
//			} else {
//				wrongInput++;
//				return false;
//			}
//		}
//		System.out.println("���� �⵿");
//		wrongInput = 0;
//		return false;
//
//	}

}

public class ClassTask {
	public static void main(String[] args) {
		SuperCar sc = new SuperCar("BENZ", "Black", 300);
		
		
		
		
		
//		sc.engineStartByPw("1324");
//		System.out.println(sc.wrongInput);
//		sc.engineStartByPw("1342");
//		System.out.println(sc.wrongInput);
//		sc.engineStartByPw("1344");
//		System.out.println(sc.wrongInput);
//		sc.engineStartByPw("1333");
//		System.out.println(sc.wrongInput);
//		sc.engineStartByPw("1333");
//		System.out.println(sc.wrongInput);
//		sc.engineStartByPw("1324");
//		System.out.println(sc.wrongInput);

	}
}
