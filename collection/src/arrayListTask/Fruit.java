package arrayListTask;

//		���� ������ ���� Ŭ���� ����(Fruit)
//			- ���� �̸�(�ߺ� ����)
//			- ���� ����

public class Fruit {
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "[���ϸ� =" + name + ", ���ϰ���=" + price + "]";
	}
	
	
}
