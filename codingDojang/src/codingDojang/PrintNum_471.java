package codingDojang;

public class PrintNum_471 {
	public static void main(String[] args) {
//		https://codingdojang.com/scode/471
//		20150111�� ����մϴ�.
//		4���� ���ظ� �����ϸ� �˴ϴ�.
//
//		1. �ڵ� ���� ���ڰ� ����� �մϴ�.
//		2. ���� �̸��̳� ��θ� ����ؼ��� �ȵ˴ϴ�.
//		3. �ð�, ��¥ �Լ��� ����ؼ��� �ȵ˴ϴ�.
//		4. ���� ��ȣ ����� �̿��ؼ��� �ȵ˴ϴ�.
		
		String result = "";
		int[] nums = {'U' - 'A', 'P' - 'A', 'a'-'a', 'o' };
		for (int i = 0; i < nums.length; i++) {
			result += nums[i];
		}
		System.out.println(result);
		
		
		
	}
}
