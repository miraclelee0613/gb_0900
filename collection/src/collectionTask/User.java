package collectionTask;

import java.util.ArrayList;

//[��ȭ �ǽ�]
//	User Ŭ���� ����
//	- �̸�, ���̵�, ��й�ȣ, �޴�����ȣ
//	- private���� ����
//	- �⺻ �����ڸ� ����
//	- toString() ������
public class User{
	
	// �̸�
	private String name;

	// ���̵�
	private String id;

	// ��й�ȣ
	private String password;

	// �޴�����ȣ
	private String phoneNumber;

	public User() {;}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	// toString() ������
	@Override
	public String toString() {
		String result = "�̸� :" + getName() + "\n���̵�: " + getId() + "\n�ڵ��� ��ȣ: " + getPhoneNumber();
		return result;
	}

}
