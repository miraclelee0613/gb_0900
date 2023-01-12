package arrayListTask3;

import java.util.ArrayList;
import java.util.Collections;

public class DateApp {

//	  CRUD ���� ����� ��Ƴ��� Ŭ���� ����(DateApp)
//		  - ����ڰ� ���ϴ� ������ �̻��� ��� ��ȸ 
//		  - �̻����� ���� ����
//		  - �̻��� ���� �� ����
	public static ArrayList<Love> peopleDB = DBConnector.people;

	public static Love register(String name, String phoneNumber, int age) {
		Love result = new Love();
		result.setAge(age);
		result.setName(name);
		result.setPhoneNumber(phoneNumber);
		return result;
	}
	
	
	// Ư�� ���� ��� ��ȸ
//	  - ����ڰ� ���ϴ� ������ �̻��� ��� ��ȸ 
	public ArrayList<Love> findAllByAge(int age) {
		ArrayList<Love> arListResult = new ArrayList<Love>();
		for (Love love : peopleDB) {
			if (love.getAge() == age) {
				arListResult.add(love);
			}
		}
		return arListResult;
	}

//	  - �̻����� ���� ����
	public void modifyAge(Love person) {
		Love findedByName = null;
		findedByName = findByName(person.getName());
		if (findedByName != null) {
			findedByName.setAge(person.getAge());
		}
	}

	// �̸����� ���� ��ȸ(�̸� �ߺ� �˻�)
	public Love findByName(String name) {
		for (Love love : peopleDB) {
			if (love.getName().equals(name)) {
				return love;
			}
		}
		return null;
	}

//	  - �̻��� ���� �� ����
	public static ArrayList<Love> orderByAge() {
		ArrayList<Love> arListResult = new ArrayList<Love>();

		for (Integer age : findAllOrderByAge()) {
			System.out.println(age);
			for (Love love : peopleDB) {
				if ((int)love.getAge() == (int)age) {
					arListResult.add(love);
					System.out.println("�߰� �Ϸ�");
				}
			}
		}
		DBConnector.people = arListResult;
		return arListResult;
	}

	public static int findMaxAgeOne() {
		int result = 0;
		for (Love love : peopleDB) {
			if (love.getAge() >= result) {
				result = love.getAge();
			}
		}
		return result;
	}

	public static int findMinAgeOne() {
		int result = 100;
		for (Love love : peopleDB) {
			if (love.getAge() <= result) {
				result = love.getAge();
			}
		}
		return result;
	}

	public static ArrayList<Integer> findAllOrderByAge() {
		ArrayList<Integer> arListResult = new ArrayList<Integer>();

		for (Love love : peopleDB) {
			arListResult.add(Integer.valueOf(love.getAge()));
		}
		Collections.sort(arListResult);
		return arListResult;
	}

}
