package myCastingTest;

class Car {
//	String brand;
//	String color;
//	int price;

	void engineStart() {
		System.out.println("����� �õ� ��");
	}

}

class SuperCar extends Car {
	@Override
	void engineStart() {
//		super.engineStart();
		System.out.println("�������� �õ� ��");
	}
	
	void openRoof() {
		System.out.println("���� ����");
	}
}

public class CastingTest {
	public static void main(String[] args) {
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		
//		up casting
		Car noOptionFerrari = new SuperCar();
		noOptionFerrari.engineStart();
		
//		���� ����
//		SuperCar brokenFerrari = (SuperCar)new Car();
		
//		down casting
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		
		
	}
}
