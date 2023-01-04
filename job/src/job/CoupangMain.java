package job;

import java.util.Random;

class CoupangMan {
	Random random = new Random();

	String Name; // 쿠팡맨 이름
	int level; // 쿠팡맨 레벨
	int income; // 쿠팡맨 월급
	int todayHouses; // 금일 배정된 가구 수
	int totalHouse; // 지금까지 배송한 가구 수
	int incomeByHouses; // 가구 당 책정한 금액
	final int needHouses = 500; // 레벨업에 필요한 가구수
	static int total; // 지금까지 수입의 총합
	boolean nightWork; // 야간작업 여부
	boolean assigned; // 금일 배정 여부

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

//	// 배송 시작
//	void startDelivery() {
//	}

//	배송 종료 - 배송 종료시 배송한 가구 수 산정, 레벨업 여부 확인
//	void stopDelivery() {
//		assigned = false;
//		
//		levelUp();
//		
//	}

//	배송 진행(void)
//	void delivery() {
//	}

//	레벨업 요건 확인(boolean)
	boolean checkLevelUp() {
		return (this.totalHouse >= (this.level * needHouses)) ? true : false;
	}

//	레벨업 기능(void)
	void levelUp() {
		if (checkLevelUp()) {
			this.level++;
		}
	}

////	레벨 확인(int 레벨 리턴)
//	int checkLevel() {
//		return this.level;
//	}

//	야간 작업 전환(void)
	void turnNightWork(boolean nightWork) {
		this.nightWork = nightWork;
	}

//	야간 작업 여부(boolean)
	boolean checkNightWork() {
		return this.nightWork;
	}

////	금일 배정 가구 수 확인(int 리턴)
//	int checkHouses() {
//		return assignHouses();
//	}

//	예상 급여 확인(int 리턴)
	int TodayIncome() {
		int result = (int) (assignHouses() * incomeByHouses * ((this.level + 10) / 10));
//		if()
		return result;
	}

//	확률 - 가구 수 배정(int 레벨 비례)
	int assignHouses() {
		if (!assigned) {
			todayHouses = random.nextInt(level * 10) + level * 70;
			assigned = true;
		}
		return todayHouses;
	}

//	확률 - 배송 중 부상 입을 확률 계산

	@Override
	public String toString() {
		return "CoupangMan\n이름= " + Name + ",\nLevel=" + level + ",\n야간작업=" + nightWork + ",\n금일 가구 배정 여부=" + assigned;
	}

}

public class CoupangMain {
	public static void main(String[] args) {
		final String WELCOME_MSG = "쿠팡맨 서비스입니다.\n원하는 서비스를 고르세요.";
		String[] arMenu = {"쿠팡맨 가입", "쿠팡맨 로그인", };
		
		final String MENU_MSG = "";
		
//		CoupangMan cp = new CoupangMan("홍길동");
		
//		System.out.println(cp.toString());
//		System.out.println();
//		System.out.println("배정 가구: " + cp.assignHouses());
//		System.out.println();
//		System.out.println(cp.toString());

		
		
		while(true) {
			System.out.println(WELCOME_MSG);
			

			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
