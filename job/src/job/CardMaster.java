package job;

import java.util.Random;
import java.util.Scanner;

// Ÿ¥
// ����(��, ��, ����)
// ���� ����� ���
// ���: ȣ��, ����, ����, Ÿ¥
// �и� ���� �� �߰� �ݾ� ����
// ���� �а� ���� �� ���� �� �� ��
// ����, �� ����
// �ǵ�: 1��
// ���� 3ȸ �¸� �� ��� ���

public class CardMaster {
	
	String nickname;	//	Ÿ¥���� �г��� 
	int money;			//	���� ������
	int level;			//	Ÿ¥ ���
	int deck;			//	����
	int winCount;		//	����Ƚ��(��޿� ������ ��)
	
	public CardMaster() {;}	// �⺻������

	public CardMaster(String nickname, int money) {	// ������ - �г��Ӱ� ���۱��� �Ű������� ����
		this.nickname = nickname;	// ���� �Ű������� ��������� ����
		this.money = money;			// ���� ����
	}
	
//	�ǵ� �� �߰� �ݾ��� �޴´�.
	void deposit(int money) {
		// ����Ÿ���� �����Ƿ� �޼ҵ��̴�
		
		this.money -= money;
		// ��������� this.money���� �Ű������� ���� money��ŭ�� ���� �ٽ� this.money�� �����Ѵ�.
	}
	
//	��(60%) ��(30%) ����(10%)
	void getMyDeck() {	// ���и� �޴´�
		Random random = new Random();	// ������ ���� ����
		
		int[] rating = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2};
		// Ȯ�� ������ ���� �迭 ���� �� �ʱ�ȭ
		// Ȯ���� ������ �����
		
		this.deck = rating[	// rating[������]�� ������ �Ǿ� �迭�� ���� �������� �ȴ�.
		                random.nextInt(
		                // ���� ���� rating.length�� ����(0 ~ 9) �ȿ��� ����Ͽ�
                		   	rating.length)];
							// Ȯ�� ������ ���� �迭�� ���� ��ŭ�� �Ű������� �Ͽ� �������� ������ ���Ѵ�.
	}
	
	int battle(CardMaster cardMaster) {	// ��� ���
//		-1 : draw, 0 : lose, 1 : win
		boolean draw = this.deck == cardMaster.deck; 	// Ÿ¥�� �� ������ ���� ������ ���º�
		boolean lose = this.deck > cardMaster.deck;		// Ÿ¥�� �� cardMaster�� ���� ���� ������ �й�
		boolean win = this.deck < cardMaster.deck;		// Ÿ¥�� �� cardMaster�� ���� ���� ������ �¸�
		boolean[] status = {draw, lose, win};			// ���� ���º��� ���� ���� �迭 ����
		int result = 0;	// ���ϰ� �ʱ�ȭ
		
		for (int i = -1; i < 2; i++) {
		// ���ϰ��� -1~1 �����̹Ƿ� i�� -1�� ����
			
			if(status[1 + i]) {
			// ���� ���º��� ���� �˻�
				
				result = i;
				// i==-1�̸� ���º�, 0�̸� �й�, 1�̸� �¸�
				
				break;
			}
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		String[] arLevel = {"ȣ��", "����", "����", "Ÿ¥"};
		// ��� ����
		
		String[] decks = {"����", "��", "��"};
		// ���� ���
		
		String[] status = {"���º�", "�й�", "�¸�"};
		// �º� �����
		
		String message = "1. ����ϱ�\n2. ���� ����\n3. ������";
		// �޽���
		
		String depositMessage = "1. �߰��ݾ� �Է�\n2. �߰��ݾ� ���� ����";
		// �߰��� ���� �Է� �޽���
		
		int choice = 0/*������ ���� ����*/, money = 0/*�ǵ�*/, defaultMoney = 10_000/*�õ�Ӵ�*/,
				result = 0/*��� �����(-1~1)*/, depositMoney = 0/*�����*/;
		Scanner sc = new Scanner(System.in);	// �Է��� ���� ��ĳ�� ��ü ����
		CardMaster me = new CardMaster("���", 0);	// �÷��̾� ��ü ����
		CardMaster computer = new CardMaster("�Ʊ�", 0);	// ��ǻ�� ��ü ����
		String title = null;	// ���� ���� ���
		
		while (true) {
		// Ư�� ���� �Ͽ� �ݺ��� Ż��
			title = "[" + arLevel[me.level] + "]" + me.nickname + " �ڻ�: " + me.money + "\n"
					+ "[" + arLevel[computer.level] + "]" + computer.nickname + " �ڻ�: " + computer.money;
			// ���� ����� ���� ���ڿ� ���� �� ����, ����
			System.out.println(title);	// ���� ���
			System.out.println(message);	// �޽��� ���
			choice = sc.nextInt();	// 1. ����ϱ� 2. ���� ���� 3. ������ ����
			
			if(choice == 3) {break;}	// 3. ������ ���ý� �ٷ� while�� Ż��
			
			switch(choice) {	// 3. �����Ⱑ �ƴ� ��� switch��(���ǹ�) ����
			case 1: // ����ϱ�
				me.deposit(defaultMoney);
				computer.deposit(defaultMoney);
				// 10000�� �������
				
				money += defaultMoney * 2;
				// �ǵ��� �ǵ� + (�⺻������� �� ��)�� ���Ѵ�.
				// �� �⺻������� �� ���̳��ϸ�, �÷��̰� �� ���̱� �����̴�
				
				me.getMyDeck();
				computer.getMyDeck();
				// �� Ÿ¥�� ���� �̴´�
				
				System.out.println("���� ��: " +decks[me.deck]);
				// �޽��� ���
				
				System.out.println(depositMessage);
				// 1. �߰��ݾ� �Է�\n2. �߰��ݾ� ���� ����
				// �߰��ݾ� �Է� ���� �޽��� ���
				
				choice = sc.nextInt();
				// �߰��ݾ� ���� �Է�
				
				if(choice == 1) {	// �߰��ݾ� �Է��� ������ ���
//				if(!(choice == 1)) {	// �߰��ݾ� �Է��� ������ ���
					System.out.print("�߰� �ݾ�: ");
					// �߰��ݾ� �Է� �޽��� ���
					
					depositMoney = sc.nextInt();
					// �߰��ݾ� �Է�
					
					me.deposit(depositMoney);
					computer.deposit(depositMoney);
					// �� Ÿ¥ ��� �Է��� �ݾ׸�ŭ ����
					
					money += depositMoney * 2;
					// �ǵ��� 10000 * Ÿ¥��(2)��ŭ �߰�
				}
				
				result = me.battle(computer);
				System.out.println(status[result + 1]);
				
				switch(result) {
				case -1: // ���º�
					while(result == -1) {
						money *= 2;
						System.out.println(money);
						me.getMyDeck();
						System.out.println("���� ��: " +decks[me.deck]);
						System.out.println("1. ��\n2. ����");
						choice = sc.nextInt();
						if(choice == 2) { 
							result = 0; 
							System.out.println(status[result + 1]);
							computer.money += money;
							System.out.println(computer.nickname + "�� ���� �ݾ�: " + computer.money);
							
							System.out.println(me.nickname + "�� ���� �ݾ�: " + me.money);
							System.out.println("���� �ǵ�: " + money);
							me.money = me.money - money;
							System.out.println(me.nickname + "�� ���� �ݾ׿��� �ǵ��� �� �ݾ�: " + me.money);
							
							me.money = me.money - defaultMoney - depositMoney;
							System.out.println(me.nickname + "�� �ǵ��� �� �ݾ׿��� �⺻ ����ݰ� �߰����� �� �ݾ�: " + me.money);
							
//							me.money = me.money - (money - defaultMoney - depositMoney); 
							
//							me.money -= (money - defaultMoney - depositMoney);
							// �ǵ����� �⺻���� ���� �ݾװ� �߰��ݾ��� �� �ݾ� ��ŭ�� �÷��̾��� ���� �ݾ׿��� ����
							me.winCount = 0;	// ���� �����߱� ������ ������ ����Ƚ���� 0���� �ʱ�ȭ
							System.out.println(me.nickname + "�� ����Ƚ��: " + me.winCount);
							
							computer.winCount++;	// ��ǻ���� �¸�Ƚ���� 1����
							System.out.println(computer.nickname + "�� ����Ƚ��: " + computer.winCount);
							
							break;	// while(result == -1) Ż��
						}
						result = me.battle(computer);	// ������ 2. ���̰� �ƴ϶�� ��� ����(���º��� �� '��'�ϴ� ���)
						System.out.println(status[result + 1]);	// �º� ��� ���
						
						switch(result) {
						case 0: // �÷��̾� �й�
							computer.money += money;	// �������� ���� ������
							System.out.println(computer.nickname + "�� ���� �ݾ�: " + computer.money);
							
							me.money -= money - defaultMoney - depositMoney;
							System.out.println(me.nickname + "�� �й� �� ���� �ݾ�: " + me.money);
							
							me.winCount = 0;
							computer.winCount++;
							break;
						case 1: // �¸�
							me.money += money;	// �������� ���� �ݴ��� ���
							computer.money -= money - defaultMoney - depositMoney;
							me.winCount++;
							computer.winCount = 0;
							break;
						}
					}
					break;
					
				case 0: // �й�
					computer.money += money;
					me.money -= money - defaultMoney - depositMoney;
					me.winCount = 0;
					computer.winCount++;
					break;
				case 1: // �¸�
					System.out.println(money);
					me.money += money;
					computer.money -= money - defaultMoney - depositMoney;
					me.winCount++;
					computer.winCount = 0;
					break;
				}
				if(me.winCount > 2	// �÷��̾��� ����Ƚ���� 2���� ũ��(3 �̻��̰�)
						&& me.level < 3) {	// �÷��̾��� ������ 3(�ִ�ġ)���� ���� ��
					me.level++;	// �÷��̾��� ���� ���
				}
				if(computer.winCount > 2 && computer.level < 3) {
					computer.level++;
				}
				break;
			case 2: // ���� ����
				break;
			default: // �� ��
				System.out.println("�ٽ� �Է����ּ���.");
				break;
			}
		}
		
		
	}
}









