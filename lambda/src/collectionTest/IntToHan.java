package collectionTest;

import java.util.HashMap;
import java.util.stream.IntStream;

public class IntToHan {
	
	public static void int2Hans(int nums) {
		String hans = "�����̻�����ĥ�ȱ�";
		HashMap<Integer, String> hangle2 = new HashMap<Integer, String>();
		String tempStr = "" + nums;
		IntStream.range(0, 10).forEach(c -> hangle2.put(c, "" + hans.charAt(c)));
		IntStream.range(0, tempStr.length())
		.forEach(c -> System.out.print(hangle2.get(Integer.parseInt("" + tempStr.charAt(c)))));

	}
	
	public static void main(String[] args) {
//		String hans = "�����̻�����ĥ�ȱ�";
//		HashMap<Integer, String> hangle2 = new HashMap<Integer, String>();
//		IntStream.range(0, 10).forEach(c -> hangle2.put(c, "" + hans.charAt(c)));
////		System.out.println(hangle2);	// {0=��, 1=��, 2=��, 3=��, 4=��, 5=��, 6=��, 7=ĥ, 8=��, 9=��}
//
//		Integer tempInt = 7518; // �׽�Ʈ �Էº�
//		String tempStr = "" + tempInt; // ���ڿ� ��ȯ��
//
//		IntStream.range(0, tempStr.length())
//				.forEach(c -> System.out.print(hangle2.get(Integer.parseInt("" + tempStr.charAt(c)))));

	int2Hans(3975);
		
		
		
		
	}
}
