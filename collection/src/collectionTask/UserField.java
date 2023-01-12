package collectionTask;
//[��ȭ �ǽ�]

//	UserField Ŭ���� ����
//	- ȸ�� ������ ���� DB�� ArrayList�� ����
//	- ���̵� �ߺ��˻�
//	- ȸ������
//	- �α���
//	- ��ȣȭ
//	- ��й�ȣ ����(��й�ȣ ã�� ����)
//	- ������ȣ ����

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {
	// ȸ�� ������ ���� DB�� ArrayList�� ����
	public static ArrayList<User> users = DBConnector.users;
	final private static int KEY = ' ';
	final int LENGTH = 6;
	public UserField() {;}

	// ���̵� �ߺ��˻�
	public static User checkExistId(String id) {

		// �ߺ��Ǵ� ���� ���� ��� null�� return
		User arResult = null, arTemp = null;
		
		// ȭ�鿡�� �ϴ� ��
//		if (users == null) {return null;}
		
		// DB��ȸ�Ͽ� ��ġ�ϴ� ID ã�� for��
		for (int i = 0; i < users.size(); i++) {
			arTemp = users.get(i);
			// ���� i��° ȸ����ȣ�� id(get(ID))�� �Է��� id�� ������
			if (arTemp.getId().equals(id)) {
				arResult = arTemp;
				break;
			}
		}
		return arResult;
	}

	// ȸ������
	public static User register(User userInfo) {
		userInfo.setPassword(encrypt(userInfo.getPassword()));
		users.add(userInfo);
		return userInfo;
	}

	// �α���
	public static User login(User memberInfo) {
		// User or null
		User checked = checkExistId(memberInfo.getId());
		boolean result = false;
		String encryptedPassword = encrypt(memberInfo.getPassword());
//		memberInfo.setPassword(encryptedPassword);
		result = checked != null && checked.getPassword().equals(encryptedPassword);
		
		return result ? memberInfo : null;
		
		// ���� �ڵ�
//		if (result) {
//			m.setPassword(inputEncryptedPassword);
//		} else {
//			m = null;
//		}
//		return m;
	}

	// ��ȣȭ
	private static String encrypt(String password) {

		String result = "", temp = "";
		temp = password.replaceAll(" ", " ");
		for (int i = 0; i < temp.length(); i++) {
			result += (char) (temp.charAt(i) + KEY);
		}
//		System.out.println("���� ��й�ȣ: " + temp);
//		System.out.println("��ȣȭ ��й�ȣ: " + result);
		return result;
	}

	// ��ȣȭ(Ȯ�ο� �ڵ�)
//	public static String dencrypt(String password) {
//
//		String result = "", temp = "";
//		temp = password.replaceAll(" ", " ");
//		for (int i = 0; i < temp.length(); i++) {
//			result += (char) (temp.charAt(i) - getKEY());
//		}
////		System.out.println("���� ��й�ȣ: " + temp);
////		System.out.println("��ȣȭ ��й�ȣ: " + result);
//		return result;
//	}
	
	// ��й�ȣ ����
	private void changePassword(User userInfo) {
		
		// ����� �ڵ�
		User userInDataBase = checkExistId(userInfo.getId());
		userInDataBase.setPassword(encrypt(userInfo.getPassword()));
		
//		User result = null;
//		for (int i = 0; i < users.size(); i++) {
//			result = users.get(i);
//			if (checkExistId(userInfo.getId()) != null && result.getPhoneNumber().equals(userInfo.getPhoneNumber())) {
//				result.setPassword(userInfo.getPassword());
//				break;
//			}
//		}
//		return result;
	}

	// ������ȣ Ȯ��
//	public boolean checkCertify(String sendedNum, String inputCertifyNum) {
//		return sendedNum.equals(inputCertifyNum);
//	}
	
	// ������ȣ 6�ڸ� ����
	private String generateCertifyNum() {

		String resultNum = "";
		Random r = new Random();
		for (int i = 0; i < LENGTH; i++) {
			resultNum += r.nextInt(LENGTH);
		}
		return resultNum;
	}

	// ���� ����
	public String sendCertifyMsg(String phoneNum) {
		String api_key = "NCS0IMQ0YEPATROO";
		String api_secret = "CVX43ZMO1MPUW4OFKGFCNXULGART56JA";
		Message coolsms = new Message(api_key, api_secret);
		String certifiedNum = generateCertifyNum();

		// 4 params(to, from, type, text) are mandatory. must be filled
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", phoneNum);
		params.put("from", phoneNum);
		params.put("type", "SMS");
		params.put("text", "������ȣ: " + certifiedNum);
		params.put("app_version", "test app 1.2"); // application name and version

		try {
			JSONObject obj = (JSONObject) coolsms.send(params);
//			System.out.println(obj.toString());
		} catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
		}
		return certifiedNum;
	}
	
}
