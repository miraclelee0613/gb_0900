package classTest;


class Car{
//	�귣��
	String brand;
//	����
	String color;
//	����
	int price;
	
	Car(String brand, String color, int price){
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
//	�õ��ѱ�(�귣�� �õ� �ѱ�)
	void turnOn() {
		System.out.printf("%s �õ� �ѱ�\n", this.brand);
	}
	
	
//	�õ�����(�귣�� �õ� ����)
	void turnOff() {
		System.out.printf("%s �õ� ����\n", this.brand);
	}
}

public class Road {
	public static void main(String[] args) {
		SuperCar kia = new SuperCar("KIA", "black", 30000000);
		kia.turnOn();
		kia.turnOff();
		
		
		
		
		
	}
}
