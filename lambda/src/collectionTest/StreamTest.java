package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


public class StreamTest {
   public static void main(String[] args) {
//      HashMap<String, Integer> chinaTown = new HashMap<String, Integer>();
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
//      
//      chinaTown.put("�����", 4500);
//      chinaTown.put("«��", 6500);
//      chinaTown.put("������", 14500);
      
//      forEach()
//      ���� ���� ������ �ִ� �÷��� ��ü���� forEach �޼ҵ带 ����� �� �ִ�.
//      forEach() �޼ҵ忡�� Consumer �������̽� Ÿ���� ���� �����ؾ� �Ѵ�.
//      Consumer�� �Լ��� �������̽��̱� ������ ���ٽ��� ����� �� �ִ�.
//      �Ű��������� �÷��� ��ü �ȿ� ����ִ� ������ ������� ����,
//      ȭ��ǥ �ڿ����� �����ϰ� ���� ������ �ۼ��Ѵ�.
      
//      chinaTown.values().stream().forEach(v -> System.out.println(v));
//      chinaTown.values().forEach(v -> System.out.println(v));
//      chinaTown.values().forEach(System.out::println);
      
//      datas.forEach(data -> System.out.println(data));
//      datas.forEach(System.out::println);
      
//      IntStream.range(1, 10).forEach(v -> datas.add(v));
//      IntStream.range(1, 10).forEach(datas::add);
	   
//	   char(): ���ڿ��� IntStream���� ����
//	   String data = "ABC";
//	   data.chars().forEach(System.out::println);
//	   data.chars().forEach(c -> System.out.println((char)c));
	   
//	   map(): �������� ���ϴ� ������ ����
//	   String data = "ABC";
//	   data.chars().map(c -> c+3).forEach(c -> System.out.println((char)c));
	   
//	   ArrayList<User> users = new ArrayList<User>(Arrays.asList(
//			   new User(1, "�ѵ���", 20),
//			   new User(2, "�̼���", 21),
//			   new User(3, "ȫ�浿", 31)
//			   ));
	   
//	   ���� ���� �޼ҵ忡 �ٷ� ������ ������ ��ü�� �������� �ۼ��ϰ�,
//	   �޼ҵ忡 ���� �������� �ʰ� �׳� ����� ������ Ŭ������ �������� �ۼ��Ѵ�.
//	   users.stream().map(User::getAge).forEach(System.out::println);
	   
//		filter() : ���ǽ��� true�� ��츸 ����
//	   StreamTest streamTest = new StreamTest();
//	   IntStream.rangeClosed(1, 10).filter(n -> n %2)
	   
//	   sorted()
	   Integer[] arData = {10, 40, 23};
//	   ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
//	   
//	   datas.stream().sorted().forEach(System.out::println);
//	   datas.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	   
//	   collect() : ����� �پ��� Ÿ������ �������ش�.
//	   ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
//	   ArrayList<Integer> results =
//			   (ArrayList<Integer>)datas.stream().sorted().collect(Collectors.toList());
//	   
//	   System.out.println(results);
	   
//	   ArrayList<Integer> times = new ArrayList<Integer>(Arrays.asList(arData));
//	   System.out.println(times);	//	[10, 40, 23]
//	   String result = times.stream().map(String::valueOf).collect(Collectors.joining(":"));
//	   System.out.println(result);	//	10:40:23
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
}

















