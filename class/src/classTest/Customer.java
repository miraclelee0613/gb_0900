package classTest;

public class Customer {
	/*
	 * �մ� Ŭ���� �̸� �޴��� ��ȣ �����ܰ� ������
	 */

	private String name;
	private String mobile;
	private int balance;
	private double discountRate;

	{
		balance = 0;
		discountRate = 1.0;
	}

//	������
	public Customer() {;}
	
	public Customer(String name, String mobile) {
		this.name = name;
		this.mobile = mobile;
	}

	public void addBalance(int money) {
		setBalance(getBalance() + money);
	}

	public void buyStuff(Shop shop) {
		shop.setPrice((int)(shop.getPrice() * (1 - this.discountRate)));
		if (this.balance >= shop.getPrice() && shop.getStock() >= 1) {
			this.balance = balance - shop.getPrice();
			shop.setStock(shop.getStock() - 1);
		}
	}

	public void checkBalance() {
		System.out.println("���� �ܰ�: " + getBalance());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public static void main(String[] args) {
		Customer customer = new Customer("ȫ�浿", "01077287518");
		Shop doll = new Shop("����", 3000);
		customer.addBalance(1000);
		customer.addBalance(1000);
		customer.addBalance(1000);
		customer.addBalance(1000);
		System.out.println(customer.getBalance());
		;
		System.out.println("===========");
		customer.buyStuff(doll);
		System.out.println("����(3000) ����");
		System.out.println(customer.getBalance());
		System.out.println("===========");
		customer.setDiscountRate(0.5);
		System.out.println("50%D.C.");
		customer.addBalance(5000);
		System.out.println("5000�� ����");
//		System.out.println("���� �ܰ�: "+ customer.getBalance());
		customer.checkBalance();

		customer.buyStuff(doll);
		System.out.println("����(3000��) ����");
		System.out.println("���� �ܰ�: " + customer.getBalance());

	}

}
