package inheritanceTest;

class A {
	String name = "A";
	int data = 10;

	void printName() {
		System.out.println(data);
	}
}

class B extends A {

	public B() {
		super();
	}

	void printData() {
		System.out.println(data);
	}
}

class Human {
	void eat() {
		System.out.println("�Ա�");
	}

	void sleep() {
		System.out.println("���ڱ�");
	}

	void walk() {
		System.out.println("�ι߰ȱ�");
	}

}

class Monkey extends Human {
	void shakeTail() {
		System.out.println("���� ġ��");
	}

	void walk() {
		System.out.println("�� �� �Ǵ� �� �߷� �ȱ�");
	}

}

public class InheritanceTest1 {

	public static void main(String[] args) {
		Monkey monkey = new Monkey();
		
	}
}
