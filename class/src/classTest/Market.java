package classTest;

class Company {
//	static Long sequence;
//	static Long total;
//	
//	Long id;
//	String name;
//	Long salary;
//	int income;
//
//	static {
//		sequence = 0L;
//	}
//	{
//		id = ++sequence ; // �ʱ�ȭ ���	// this��������
//	}
//
//	public Company(String name, Long salary) {
//		this.name = name;
//		this.salary = salary;
//	}
//
//	void printMyData() {
//		System.out.println(id + ", " + name + ", ��" + salary + "����");
//	}

	static int sequence;
	static int total;
	int id;
	String name;
	int income;

//	�ʱ�ȭ ���
//	�����ڰ� ȣ��� ������ ����
	{
		id = ++sequence;
	}

}

public class Market {
	public static void main(String[] args) {
		String[] name1 = { "�ѵ���", "�̼���", "ȫ�浿", "�庸��" };
//		Company ȫ�浿 = new Company("ȫ�浿", 4000L);
//
//		System.out.println(ȫ�浿.id);
//		
//		ȫ�浿.printMyData();
//		
//		Company.total += ȫ�浿.income = 1000;

	}
}
