package job;

import java.util.Random;

class CoupangMan {
	Random random = new Random();

	String Name; // ���θ� �̸�
	int level; // ���θ� ����
	int income; // ���θ� ����
	int todayHouses; // ���� ������ ���� ��
	int totalHouse; // ���ݱ��� ����� ���� ��
	int incomeByHouses; // ���� �� å���� �ݾ�
	final int needHouses = 500; // �������� �ʿ��� ������
	static int total; // ���ݱ��� ������ ����
	boolean nightWork; // �߰��۾� ����
	boolean assigned; // ���� ���� ����

	{
		level = 1;
		income = 250;
		incomeByHouses = 300;
	}

	public CoupangMan(String driverName) {
		this.Name = driverName;
	}

	public CoupangMan(String driverName, boolean nightWork) {
		this.Name = driverName;
		this.nightWork = nightWork;
	}

//	// ��� ����
//	void startDelivery() {
//	}

//	��� ���� - ��� ����� ����� ���� �� ����, ������ ���� Ȯ��
//	void stopDelivery() {
//		assigned = false;
//		
//		levelUp();
//		
//	}

//	��� ����(void)
//	void delivery() {
//	}

//	������ ��� Ȯ��(boolean)
	boolean checkLevelUp() {
		return (this.totalHouse >= (this.level * needHouses)) ? true : false;
	}

//	������ ���(void)
	void levelUp() {
		if (checkLevelUp()) {
			this.level++;
		}
	}

////	���� Ȯ��(int ���� ����)
//	int checkLevel() {
//		return this.level;
//	}

//	�߰� �۾� ��ȯ(void)
	void turnNightWork(boolean nightWork) {
		this.nightWork = nightWork;
	}

//	�߰� �۾� ����(boolean)
	boolean checkNightWork() {
		return this.nightWork;
	}

////	���� ���� ���� �� Ȯ��(int ����)
//	int checkHouses() {
//		return assignHouses();
//	}

//	���� �޿� Ȯ��(int ����)
	int TodayIncome() {
		int result = (int) (assignHouses() * incomeByHouses * ((this.level + 10) / 10));
//		if()
		return result;
	}

//	Ȯ�� - ���� �� ����(int ���� ���)
	int assignHouses() {
		if (!assigned) {
			todayHouses = random.nextInt(level * 10) + level * 70;
			assigned = true;
		}
		return todayHouses;
	}

//	Ȯ�� - ��� �� �λ� ���� Ȯ�� ���

	@Override
	public String toString() {
		return "CoupangMan\n�̸�= " + Name + ",\nLevel=" + level + ",\n�߰��۾�=" + nightWork + ",\n���� ���� ���� ����=" + assigned;
	}

}

public class CoupangMain {
	public static void main(String[] args) {
		final String WELCOME_MSG = "���θ� �����Դϴ�.\n���ϴ� ���񽺸� ������.";
		String[] arMenu = {"���θ� ����", "���θ� �α���", };
		
		final String MENU_MSG = "";
		
//		CoupangMan cp = new CoupangMan("ȫ�浿");
		
//		System.out.println(cp.toString());
//		System.out.println();
//		System.out.println("���� ����: " + cp.assignHouses());
//		System.out.println();
//		System.out.println(cp.toString());

		
		
		while(true) {
			System.out.println(WELCOME_MSG);
			

			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
