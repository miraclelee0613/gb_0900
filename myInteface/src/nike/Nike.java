package nike;

import starbucks.Form;
import starbucks.FormAdapter;

public class Nike {
	public void register(Form form) {
		if(form instanceof FormAdapter) {
			System.out.println("���� ���� �����Դϴ�.");
		}
		
		form.sell("�ȭ");
		
	}
	
}
