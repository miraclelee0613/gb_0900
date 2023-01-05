package job;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

class CoupangMan {
	Random random = new Random();

	String name; // ���θ� �̸�
	static int needHouses; // �������� �ʿ��� ������
	int level; // ���θ� ����
	int income; // ���θ� ����
	int todayHouses; // ���� ������ ���� ��
	int totalHouse; // ���ݱ��� ����� ���� ��
	int incomeByHouses; // ���� �� å���� �ݾ�
	int total; // ���ݱ��� ������ ����
	boolean nightWork; // �߰��۾� ����
	boolean assigned; // ���� ���� ����

	{
		level = 1;
		income = 250;
		incomeByHouses = 300;
	}
	static {
		needHouses = 500;
	}

	public CoupangMan() {
		;
	}

	public CoupangMan(String driverName) {
		this.name = driverName;
	}

	public CoupangMan(String driverName, boolean nightWork) {
		this.name = driverName;
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

//	�α���
	boolean checkName(String name) {
		return this.name.equals(name);
	}

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

	// �߰� �۾� ��ȯ(void)
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
		return "CoupangMan\n�̸�= " + name + ",\nLevel=" + level + ",\n�߰��۾�=" + nightWork + ",\n���� ���� ���� ����=" + assigned;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getNeedHouses() {
		return needHouses;
	}

	public static void setNeedHouses(int needHouses) {
		CoupangMan.needHouses = needHouses;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public int getTodayHouses() {
		return todayHouses;
	}

	public void setTodayHouses(int todayHouses) {
		this.todayHouses = todayHouses;
	}

	public int getTotalHouse() {
		return totalHouse;
	}

	public void setTotalHouse(int totalHouse) {
		this.totalHouse = totalHouse;
	}

	public int getIncomeByHouses() {
		return incomeByHouses;
	}

	public void setIncomeByHouses(int incomeByHouses) {
		this.incomeByHouses = incomeByHouses;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public boolean isNightWork() {
		return nightWork;
	}

	public void setNightWork(boolean nightWork) {
		this.nightWork = nightWork;
	}

	public boolean isAssigned() {
		return assigned;
	}

	public void setAssigned(boolean assigned) {
		this.assigned = assigned;
	}

}

class Console {

}

public class CoupangMain {

	String combiMenu(String[] arStr) {
		String result = "";
		for (int i = 0; i < arStr.length; i++) {
			result += i + "." + arStr[i];
			if (arStr.length - 1 != i) {
				result += "\n";
//				System.out.println(121 + ". " + result);
			} else {
//				result = i + "." + result + arStr[i];
//				System.out.println(124 + ". " + result);
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CoupangMan cm = new CoupangMan();

		final String WELCOME_MSG = "���θ� �����Դϴ�.\n���ϴ� ���񽺸� ������.";
		String[] arMenu = { "����", "���θ� ����", "���θ� �α���" };
		String errMsg = "�߸� �Է��ϼ̽��ϴ�.";
		String signupMsg = "���θ� ���Ը޴��Դϴ�.\n���θ� �̸��� �߰��۾� ���θ� �Է��� �ּ���.\n������Ҵ� 0�� �Է����ּ���.";
		String loginMsg = "�α��� ����", wrongLoginMsg = "�������� �ʴ� �̸��Դϴ�.";
		String menuMsg = new CoupangMain().combiMenu(arMenu);
		String driverName = null;
		String tempString = "";
		boolean booleanTemp = false;
		boolean nightWork = false, checkLogin = false;
//		temp
		int tempInt = 0;

//		System.out.println(arMenu[1] + arMenu[2]);
//		System.out.println("------135----");

//		CoupangMan cp = new CoupangMan("ȫ�浿");

//		System.out.println(cp.toString());
//		System.out.println();
//		System.out.println("���� ����: " + cp.assignHouses());
//		System.out.println();
//		System.out.println(cp.toString());
		
		while (true) {
			boolean exitFlag = false;
			sc.nextLine();
			System.out.print("\n�ƹ�Ű�� �Է½� �޴� ���\n");
			sc.nextLine();
//			ClearConsole();

			System.out.println(WELCOME_MSG);
			System.out.println(menuMsg);
			int choice = -1;
			choice = sc.nextInt();
			switch (choice) {
			case 0: // ����
				exitFlag = true;
				break;
			case 1: // ���θ� ����
				System.out.println();
				System.out.print("�̸� �Է�: ");
				driverName = sc.next();
				if (driverName.equals("0")) {
					break;
				}
				System.out.print("\n\n�߰� �۾� ����\n1. ����\n2. �Ұ���\n�Է�: ");
				tempInt = sc.nextInt();
				if (!(tempInt == 1 || tempInt == 2)) {
					System.out.println(errMsg);
					break;
				}
				nightWork = tempInt == 1;
				cm.setName(driverName);
				cm.setNightWork(nightWork);
				nightWork = false;
				
				System.out.println(cm.name + "�� ������ �Ϸ�Ǿ����ϴ�\n");
				System.out.println("\n=========���� ����===========");
				System.out.println(cm.toString());

				break;
			case 2: // ���θ� �α���
//				System.out.println("2�� �Է�");
				if (!driverName.equals(null)) {
					System.out.print("������ �̸� �Է�: ");
					if(cm.checkName(sc.next())) {
						checkLogin = true;
						System.out.println(loginMsg);
					}else {
						
					}
					
				}

				break;
			default: // �߸� �Է��� ���
				System.out.println(errMsg);
				break;
			}

			if (exitFlag) {
				System.out.println("�����մϴ�.");
				break;
			}

		}

	}

	public static void ClearConsole() {
		for (int i = 0; i < 25; i++) {
			System.out.println();
		}

	}
}
