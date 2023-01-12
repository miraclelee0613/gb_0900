package hashMapTest;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONWork {
	public static void main(String[] args) {
		String dcRate = "discountRate", dcProducts = "discountProducts";
//		상품 클래스 선언(상품 번호, 상품이름, 상품 가격, 상품 재고)
//		1. 상품 1개를 제작하여 JSON형식으로 변경
		Product product = new Product(1, "인형", 3000, 5);
		JSONObject productJSON = new JSONObject(product);
		
//		2. JSON형식의 상품 정보 중 상품 재고 출력
		try {
			System.out.println("stock: " + productJSON.get("stock"));
		} catch (JSONException e1) {
			e1.printStackTrace();
		}
//		System.out.println(productJSON);
		
//		3. 할인 중인 상품 정보 제작
		Product product2 = new Product(2, "가방", 50000, 3);
		JSONObject discountProductJSON = new JSONObject(product2);
		JSONObject discountJSON = new JSONObject();
//		4. 할인 중인 상품의 KEY값은 "discount"로 설정
//		5. JSON형식으로 변경
		
//		6. JSON에 할인율 필드 추가
		
		try {
			discountProductJSON.put(dcRate, 0.5);
			discountJSON.put(dcProducts, discountProductJSON);
			System.out.println(discountJSON);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
//		7. JSON형식의 상품 정보 중 할인율 출력
		try {
//			discountJSON.getJSONObject("DCRate");
			System.out.println("DCRate = " + discountJSON.getJSONObject(dcProducts).get(dcRate));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
