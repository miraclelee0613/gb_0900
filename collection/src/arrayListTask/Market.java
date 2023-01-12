package arrayListTask;

import java.util.ArrayList;

/*
 * CRUD ���� ����� ��Ƴ��� Ŭ���� ����(Market)
	- ���� �߰�
	- ���� ����
	- ���� ������ ��� ���ݺ��� ������ �˻�
	- ���� ��ü ��ȸ
	- ���� �̸����� ���� ��ȸ
*/
public class Market {
	public static ArrayList<Fruit> fruits = DBConnector.fruit;
	
	// ���ϸ� �ߺ��˻�
//	public Fruit checkFruit(String name) {
//		
//		for(Fruit fruit:fruitDB)
//			
//	}
	
//	���� �̸����� ��ȸ
	public Fruit checkFruit(String name) {
		for(Fruit fruit:fruits) {
			if(fruit.getName().equals(name)) {
				return fruit;
			}
		}
		return null;
	}
	
//	- ���� �߰�
	public void add(Fruit fruit) {
		fruits.add(fruit);
	}
	
//	- ���� ����
	public void remove(String name) {
		for(Fruit fruit:fruits) {
			if(fruit.getName().equals(name)) {
				fruits.remove(fruit);
			}
		}
	}
	
	// ���� ���� ��� ���
	public double checkAvg() {
		double sum = 0;
		for (Fruit fruits:fruits) {sum += fruits.getPrice();}
		return sum / fruits.size();
	}
	
//	- ���� ������ ��� ���ݺ��� ������ �˻�
	public boolean checkAvgBelowByPrice(int price) {
		return price < checkAvg();
	}
//	- ���� ��ü ��ȸ
	public ArrayList<Fruit> selectAll(){
		return fruits;
	}
	
	
//	- ���� �̸����� ���� ��ȸ
	public int findByName(String name) {
		return checkFruit(name).getPrice();
		
	}
	
}
