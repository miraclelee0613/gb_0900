package hashMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.json.JSONObject;



public class HashMapTest {
	public static void main(String[] args) {
		//	���̵�, ��й�ȣ, �̸�, ����
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		JSONObject userJson = null;
		
		userMap.put("id", "hds1234");
		userMap.put("password", "1234");
		userMap.put("name", "�ѵ���");
		userMap.put("age", 20);
		
//		System.out.println(userMap);
//		System.out.println(userMap.get("id"));
		
		for (Object value : userMap.values()) {
			System.out.println(value);
		}
		
		userJson = new JSONObject(userMap);
		
		
		
//		Iterator<Entry<String, Object>> iter = userMap.entrySet().iterator();
		
		
	}
}
