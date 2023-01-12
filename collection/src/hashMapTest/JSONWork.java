package hashMapTest;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONWork {
	public static void main(String[] args) {
		String dcRate = "discountRate", dcProducts = "discountProducts";
//		��ǰ Ŭ���� ����(��ǰ ��ȣ, ��ǰ�̸�, ��ǰ ����, ��ǰ ���)
//		1. ��ǰ 1���� �����Ͽ� JSON�������� ����
		Product product = new Product(1, "����", 3000, 5);
		JSONObject productJSON = new JSONObject(product);
		
//		2. JSON������ ��ǰ ���� �� ��ǰ ��� ���
		try {
			System.out.println("stock: " + productJSON.get("stock"));
		} catch (JSONException e1) {
			e1.printStackTrace();
		}
//		System.out.println(productJSON);
		
//		3. ���� ���� ��ǰ ���� ����
		Product product2 = new Product(2, "����", 50000, 3);
		JSONObject discountProductJSON = new JSONObject(product2);
		JSONObject discountJSON = new JSONObject();
//		4. ���� ���� ��ǰ�� KEY���� "discount"�� ����
//		5. JSON�������� ����
		
//		6. JSON�� ������ �ʵ� �߰�
		
		try {
			discountProductJSON.put(dcRate, 0.5);
			discountJSON.put(dcProducts, discountProductJSON);
			System.out.println(discountJSON);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
//		7. JSON������ ��ǰ ���� �� ������ ���
		try {
//			discountJSON.getJSONObject("DCRate");
			System.out.println("DCRate = " + discountJSON.getJSONObject(dcProducts).get(dcRate));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
