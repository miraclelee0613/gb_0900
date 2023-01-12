package arrayListTask2;

import java.util.ArrayList;

public class Restaurant {
//CRUD ���� ����� ��Ƴ��� Ŭ���� ����(Restaurant)
//	- ���� �߰� 
//	- ���� �̸����� ���� ���� ��ȸ
//	- ����ڰ� ���ϴ� ������ ���� ��ü ��ȸ
//	- ���� ���� ���� �� ���� 10% ���
//	- ����ڰ� ���ϴ� ������ ���� ���� ��ȸ
	public static ArrayList<Food> foods = DBConnector.foods;

//	- ���� �߰� 
	public void add(Food food) {
		foods.add(food);
	}

//	- ���� �̸����� ���� ���� ��ȸ
	public String findKindByName(String name) {
		return findByName(name).getKind();
	}

//	���� �̸����� ���� ��ȸ
	public Food findByName(String name) {

		for (Food food : foods) {
			if (food.getName().equals(name)) {
				return food;
			}
		}
		return null;
	}

//	- ����ڰ� ���ϴ� ������ ���� ��ü ��ȸ
	public ArrayList<Food> findAllByKind(String kind) {
		ArrayList<Food> arListResult = null;
		for (Food food : foods) {
			if (food.getKind().equals(kind)) {
				arListResult.add(food);
			}
		}
		return arListResult;

	}
	
//	�����ε� ���� Ȱ��

//	- ���� ���� ���� �� ���� 10% ���(�̹� ������ Food ��ü�� ����)
	public void modifyKindAndPrice(Food modedFood) {
		modifyKind(modedFood, modedFood.getKind());
		modifyPrice(modedFood, (int) (modedFood.getPrice() * (100 + 10) / 100));
	}

//	Food ��ü�� �ٲٰ��� �ϴ� ���� ������ kind �Ű������� �޾� ������.
	public void modifyKindAndPrice(Food food, String kind) {
		modifyKind(food, kind);
		modifyPrice(food, (int) (food.getPrice() * 1.1));
	}

//	Food ��ü�� ���������� �ٲٰ� �����ϰ��� �ϴ� ������ ���� ����(20%������ 0.8 �Է�)
	public void modifyKindAndPrice(Food food, String kind, double changeRatePrice) {
		modifyKind(food, kind);
		modifyPrice(food, changeRatePrice);
	}

//	Food ��ü�� ������ Ư�� �ݾ����� ����(ex 3000)
	public void modifyKindAndPrice(Food modedFood, int newPrice) {
		modifyKind(modedFood, modedFood.getKind());
		modifyPrice(modedFood, newPrice);
	}

//	Food ��ü�� ���� ������ �����ϰ� Ư�� �ݾ����� ���� ����(ex 3000)
	public void modifyKindAndPrice(Food modedFood, String newKind, int newPrice) {
		modifyKind(modedFood, modedFood.getKind());
		modifyPrice(modedFood, newPrice);
	}

	// ���� ���� ����(�̹� ���� ������ ������ ��ü ������)
	public void modifyKind(Food modifiedFood) {
		findByName(modifiedFood.getName()).setName(modifiedFood.getKind());
	}

	// ���� ���� ����(���� ��ü�� ���ο� ���� �Է�)
	public void modifyKind(Food existedFood, String newFind) {
		findByName(existedFood.getName()).setKind(newFind);
	}

	// ���� ���� ����(�̹� ������ ��ü ������)
	public void modifyPrice(Food modifiedFood) {
		findByName(modifiedFood.getName()).setPrice(modifiedFood.getPrice());
	}

	// ���� ���� ����(���� ��ü�� ���ο� ����(ex 3000) �Է�)
	public void modifyPrice(Food existedFood, int newPrice) {
		findByName(existedFood.getName()).setPrice(newPrice);
	}

	// ���� ���� ����(���� ��ü�� ���� ��� �Է�)
	public void modifyPrice(Food existedFood, double multiplyPrice) {
		findByName(existedFood.getName()).setPrice((int) (existedFood.getPrice() * multiplyPrice));
	}

//	- ����ڰ� ���ϴ� ������ ���� ���� ��ȸ
	public int getCountByKind(String kind) {
		return findAllByKind(kind).size();
	}

}
