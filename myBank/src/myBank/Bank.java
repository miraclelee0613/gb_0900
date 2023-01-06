package myBank;

import java.util.Random;
import java.util.Scanner;

public class Bank {
	Random r = new Random();
//				ȸ����ȣ ������
	private static int seq = 0;

//	[���� �ǽ�]
//			����
//				������
	private String name;

//				ȸ����ȣ
	private int memberNumber;

//				���¹�ȣ(�ߺ� ����)
	private String account;

//				�ڵ�����ȣ(�ߺ� ����)
	private String phoneNumber;

//				��й�ȣ
	private String pw;

//				�����ܰ�
	private int balance;

	static {
		seq++;
	}

	public Bank() {
		;
	}

	public Bank(String name, String phoneNumber, String pw) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.pw = pw;
		this.memberNumber = Bank.getSeq();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	// �ܾ���ȸ(String account)
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static int getSeq() {
		return seq;
	}

//	���°���

//	�Ա� ���(int depositMoney)
	void deposit(int depositMoney) {
		this.balance += depositMoney;
	}

//	��� ���(int depositMoney)
	void withdraw(int withdrawMoney) {
		this.balance -= withdrawMoney;
	}

//	���°���(String name, String phoneNumber)
//	���¹�ȣ�� ���� ����
//	�ߺ��˻�(), this.name = name, this.phineNumber = phoneNumber
	boolean signin(String name, String password, String phoneNumber) {
		if (this.name == name || this.phoneNumber == phoneNumber) {
			return false;
		} else {
			this.name = name;
			this.phoneNumber = phoneNumber;
			this.pw = password;
			return true;
		}

	}

//	���� ���� ����(6�ڸ�)
	String makeAccount() {
		String result = "";
		for (int i = 0; i < 6; i++) {
			result += r.nextInt(10);
		}
		return result;
	}

////	���� ���� ����
//	String makeAccountRandom(int end) {
//		// ���ึ�� ���¹�ȣ�� ���̰� �ٸ��Ƿ�
//		// ���¹�ȣ�� ���̸� �Ű������� ����.
//
//		String result = "";
//
//		for (int i = 0; i < end; i++) {
//			result += r.nextInt(10);
//		}
//
//		return result;
//
//	}

//	���¹�ȣ �ߺ��˻�
	boolean checkAccount(String account) {
		if (this.account.equals(account)) {
			return true;
		}
		return false;
	}

//	�α���
	boolean login(String account, String password) {
		if (this.account == account && this.pw == password) {
			return true;
		}
		return false;
	}

//	��й�ȣ�� �Է��Ͽ� �α���
	boolean login(String password) {
		if (this.pw == password) {
			return true;
		}
		return false;
	}

//	�ڵ��� ��ȣ �ߺ� �˻�
//	�̹� ������ true ������ false
	static boolean isTherePhoneNumber(Bank[] arBank, String phoneNum) {
		for (int i = 0; i < arBank.length; i++) {
			if (arBank[i] == null) {
				return false;
			}
			if (arBank[i].getPhoneNumber().equals(phoneNum)) {
				return true;
			}
		}
		return false;
//		if(this.phoneNumber == phoneNumber) {
//			return true;
//		}
//		return false;
	}

//	���¹�ȣ ã��(String phoneNumber)
	String forgotAccount(String phoneNumber) {
		if (this.phoneNumber == phoneNumber) {
			return this.account;
		}
		return null;
	}

////	��й�ȣ �缳��(Bank bank, String newPw)
//	boolean newPassword(String account, String , String newPw) {
//		if(this.pw == bank.pw) {
//			this.pw = newPw;
//		}
//		return false;
//	}
	static String combinateArToMenu(String[] ar) {
		String result = "";
		for (int i = 0; i < ar.length; i++) {
			result += i + ar[i] + "\n";
		}
		return result;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", memberNumber=" + memberNumber + ", account=" + account + ", phoneNumber="
				+ phoneNumber + ", pw=" + pw + ", balance=" + balance + "]";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Shinhan[] arShinhans = new Shinhan[100];
		Kookmin[] arKookmins = new Kookmin[100];
		Kakao[] arKakaos = new Kakao[100];
		Bank[][] customers = new Bank[3][100];
		int[] arUserCount = new int[3];
		final int SHINHAN = 0;
		final int KOOKMIN = 1;
		final int KAKAO = 2;
		Bank customer = null;
		customers[0] = arShinhans;
		customers[1] = arKookmins;
		customers[2] = arKakaos;
		String welcomeList = "", mainMenu = "", forgotMenu = "";
		String[] arWelcome = { "����", "����� ���", "�α���", "���¹�ȣ ã��" };
		String[] arMainList = { "�α׾ƿ�", "�Ա��ϱ�", "����ϱ�", "�ܾ���ȸ", "���¹�ȣ ã��" };
		String[] arForgot = { "�ڵ��� ��ȣ�� ���� ã��", "���� ���� �߱�" };
		String plzInput = "�Է� : ", inputErrMsg = "�߸� �Է��ϼ̽��ϴ�.", plzReinputMsg = "�ٽ� �Է����ֽñ� �ٶ��ϴ�.";
		String tempStr = "", exitMsg = "���α׷��� �����մϴ�.", alreadyExistErrMsg = "�̹� �����ϴ� �ڵ��� ��ȣ�Դϴ�.";
		String signupWelcome = "ȸ������ �������Դϴ�.";
		int choice = 0;
		boolean whileFlag = false;
		String chooseBankMsg = "�����Ͻ� ������ ����ּ���.\n";
		String[] arBanks = { "������", "��������", "��������", "īī����ũ" };
		String name = "", phoneNum = "", pw1 = "", pw2 = "";
		String signupMsgName = "����� �̸��� �Է����ּ���.", signupMsgPhoneNum = "��ȿ�� �ڵ��� ��ȣ�� �Է����ּ���(�ߺ����� �Ұ�)",
				signupPw1 = "��й�ȣ�� �Է����ּ���.", signupPw2 = "��й�ȣ�� �ٽ� �Է����ּ���.";
		String loginErrMsg = "�α��� ����", backToMainMsg = "���θ޴��� �̵��մϴ�.";

		welcomeList = Bank.combinateArToMenu(arWelcome);
		mainMenu = Bank.combinateArToMenu(arMainList);
		forgotMenu = Bank.combinateArToMenu(arForgot);
		chooseBankMsg += Bank.combinateArToMenu(arBanks);

//		for (int i = 0; i < customers.length; i++) {
//			switch (i) {
//			case 1:
//				for (int j = 0; j < customers[i].length; j++) {
//					Shinhan[] shinhans = new Shinhan[j];
//					customers[i][j] = shinhans[j];
//				}
//				break;
//
//			case 2:
//				for (int j = 0; j < customers[i].length; j++) {
//					Kukmin[] kukmins = new Kukmin[j];
//					customers[i][j] = kookmins[j];
//				}
//				break;
//
//			case 3:
//				for (int j = 0; j < customers[i].length; j++) {
//					Kakao[] kakaos = new Kakao[j];
//					customers[i][j] = kakaos[j];
//				}
//				break;
//
//			}
//		}

		while (true) {
			whileFlag = false;
			System.out.println(welcomeList);
			System.out.print(plzInput);
			tempStr = sc.next();
			choice = Integer.parseInt(tempStr);
			switch (choice) {
			case 0: // ���α׷� ����
				whileFlag = true;
				break;
			case 1: // ����� ���(����)
				choice = 0;
				name = "";
				phoneNum = "";
				pw1 = "";
				pw2 = "";
				System.out.println(signupWelcome);
				System.out.println(chooseBankMsg);
				choice = sc.nextInt();

				System.out.println(signupMsgName);
				System.out.print(plzInput);
				name = sc.next();

				System.out.println(signupMsgPhoneNum);
				System.out.print(plzInput);
				phoneNum = sc.next();
//				if (Bank.isTherePhoneNumber(customers[choice - 1], phoneNum)) {
//					// �̹� ������ ���� ������ true�� �߸鼭 ����
//					System.out.println(alreadyExistErrMsg);
//					break;
//				}

				System.out.println(signupPw1);
				System.out.println(plzInput);
				pw1 = sc.next();

				System.out.println(signupPw2);
				System.out.println(plzInput);
				pw2 = sc.next();

				if (!pw1.equals(pw2)) { //
					System.out.println(inputErrMsg);
					continue;
				}

				switch (choice - 1) {
				case SHINHAN:
					customer = arShinhans[arUserCount[SHINHAN]++] = new Shinhan(name, phoneNum, pw1);
					customer = (Shinhan) customer;
					System.out.println(customer.toString());
					break;
				case KOOKMIN:
					customer = arKookmins[arUserCount[KOOKMIN]++] = new Kookmin(name, phoneNum, pw1);
					customer = (Kookmin) customer;
					System.out.println(customer.toString());
					break;
				case KAKAO:
					customer = arKakaos[arUserCount[KAKAO]++] = new Kakao(name, phoneNum, pw1);
					customer = (Kakao) customer;
					System.out.println(customer.toString());
					break;
				}

				break;
			case 2: // �α���
				if (customer instanceof Shinhan) {
					customer = (Shinhan) customer;
				} else if (customer instanceof Kookmin) {
					customer = (Kookmin) customer;
				} else if (customer instanceof Kakao) {
					customer = (Kakao) customer;
				} else {
					System.out.println(loginErrMsg);
					System.out.println(backToMainMsg);
					continue;
				}
				break;
				
			case 3: // ���¹�ȣ ã��(forgot)
				break;
			case 4:
				break;
			case 5:
				break;
			}
			if (whileFlag) {
				System.out.println(exitMsg);
				break;
			}

		}

	}

}
