package collectionTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamTask {
	public static void main(String[] args) {
//		10~1���� ArrayList�� ��� ���
//		ArrayList<Integer> arListInt2 = new ArrayList<Integer>();
//		IntStream.range(0, 9).forEach(v -> arListInt2.add(10 - v));
//		arListInt2.stream().forEach(System.out::println);
//		System.out.println("===========");

//		1~10���� ArrayList�� ��� ���
//		ArrayList<Integer> arListInt = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(arListInt::add);
//		arListInt.stream().forEach(System.out::println);
//		System.out.println("===========");

//		ABCDEF�� �� ���ں��� ���
//		String data = "ABCDEF";
		ArrayList<Integer> datas = new ArrayList<Integer>();
//		ArrayList<Character> datasChar = new ArrayList<Character>();
//		IntStream.rangeClosed('A', 'F').forEach(c -> System.out.println((char)c));

//		data.chars().forEach(c -> System.out.print((char)c + " "));
//		data.chars().forEach(datas::add);

//		1~100���� �� Ȧ���� ArrayList�� ��� ���
		
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(1, 51).map(v -> v * 2 - 1).forEach(datas::add);
//		System.out.println(datas);
		
//		ArrayList<Integer> arListInt = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 100).forEach(c -> {
//			if(c%2==1) {
//				arListInt.add(c);
//			}
//		});
//		arListInt.forEach(System.out::println);

//		A~F���� �� D�����ϰ� ArrayList�� ��� ���
		
//		IntStream.range('A', 'F').map(c -> c > 'C' ? c + 1: c).forEach(c -> System.out.println((char)c));
		
//		ArrayList<Character> arListChar = new ArrayList<Character>();
//		IntStream.rangeClosed('A', 'F').forEach(c -> {
//			if(c!='D') {
//				arListChar.add((char)c);
//			}
//		});
//		IntStream.rangeClosed('A', 'F').filter(c -> c != 'D').forEach(c -> arListChar.add((char) c));
//		arListChar.forEach(System.out::println);
		
//		5���� ���ڿ��� ��� �ҹ��ڷ� ����(Black, WHITE, reD, yeLLow, PINk), toLowerCase()
//		ArrayList<String> arListString = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//		arListString.stream().map(c -> c.toLowerCase()).forEach(System.out::println);
		
//		1~100���� �� Ȧ���� ArrayList�� ��� ���
//		ArrayList<Integer> arListInt = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 100).filter(c -> c % 2 == 1).forEach(arListInt::add);
//		arListInt.forEach(System.out::println);
		
//		Apple, banana, Melon �� ù��° ���ڰ� �빮���� ���ڿ� ���
//		ArrayList<String> arListString = new ArrayList<String>(Arrays.asList("Apple","banana","Melon"));
//		arListString.stream().filter(c -> c.charAt(0)>='A' && c.charAt(0)<='Z').forEach(System.out::println);
		
//		�ѱ��� ������ ����
		String hans = "�����̻�����ĥ�ȱ�";
		String jungSu = "�ϻ��̻�";
		jungSu.chars().map(hans::indexOf).forEach(System.out::print);
		
		
		HashMap<String, Integer> hangle = new HashMap<String, Integer>();
//		ArrayList<String> arListHans = new ArrayList<String>();
//		
		IntStream.range(0, 10).forEach(c -> hangle.put("" + hans.charAt(c), c));
////		System.out.println(hangle);	// {ĥ=7, ��=0, ��=6, ��=2, ��=5, ��=8, ��=1, ��=3, ��=4, ��=9}
//		IntStream.range(0, jungSu.length()).forEach(c -> System.out.print(hangle.get("" + (char)jungSu.chars().toArray()[c])));
		
		
//		ArrayList<String> arListHan = new ArrayList<String>(Arrays.asList("��","��", "��", "��", "��", "��", "��", "ĥ", "��", "��"));
//		IntStream.range(0, 10).forEach(c -> arListHan.set(c, "" + c));
//		arListHan.forEach(System.out::println);
		
////		������ �ѱ۷� ����
//		ArrayList<Integer> arListInt = new ArrayList<Integer>();
//		IntStream.range(0, 10).map(c -> arListInt.set(c, arListHan.get(c)));
		HashMap<Integer, String> hangle2 = new HashMap<Integer, String>();
		IntStream.range(0, 10).forEach(c -> hangle2.put(c, "" + hans.charAt(c)));
//		System.out.println(hangle2);	// {0=��, 1=��, 2=��, 3=��, 4=��, 5=��, 6=��, 7=ĥ, 8=��, 9=��}
		
		Integer tempInt = 3316;
		String tempStr = "" + tempInt;
		
		IntStream.range(0, tempStr.length()).forEach(c -> System.out.print(hangle2.get(Integer.parseInt("" + tempStr.charAt(c)))));
		
		
//		ArrayList<String> arListString = new ArrayList<String>();
//		tempInt
//		(c ->  hans.charAt(c))
		
//		.foreach(System.out::prinln);
		
		
		
		
		
		
	}
}
