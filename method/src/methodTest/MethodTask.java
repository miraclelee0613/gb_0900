package methodTest;

public class MethodTask {

//	1~10���� println()���� ����ϴ� �޼ҵ�
	public void printNums() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}

//	"ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
	public void pringHGD(int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("ȫ�浿");
		}
	}

//	�̸��� n�� println()���� ����ϴ� �޼ҵ�
	public void printName(String name, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(name);
		}
	}

//	�� ������ ������ ���ִ� �޼ҵ�
	public int subtract(int num1, int num2, int num3) {
		int result = num1 - num2 - num3;
		return result;
	}

//	�� ������ ������ �� ��� ������ �� ���� ���ϴ� �޼ҵ�
	public int[] func(int[] nums) {
		int[] result = null;

		if (nums[1] != 0) {
			result = new int[2];
			result[0] = nums[0] / nums[1];
			result[1] = nums[0] % nums[1];
		}
		return result;
	}

	void div(int[] arNums) {
		int[] result = null;
		if (arNums[1] != 0) {
			result = new int[2];
			result[0] = arNums[0] / arNums[1];
			result[1] = arNums[0] % arNums[1];
		}

	}

//	1~n������ ���� �����ִ� �޼ҵ�
	int sum(int end) {
		int sum = 0;
		for (int i = 0; i < end; i++) {
			sum += i + 1;
		}
		return sum;
	}

//	Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�
	int odd(int num) {
		return num++;
	}

//	���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
	String upperLower(String str) {
		char[] arStr = new char[str.length()];
		char temp = ' ';
		String result = "";
		for (int i = 0; i < arStr.length; i++) {
			arStr[i] = str.charAt(i);
			temp = arStr[i];
			if (temp >= 'a' && temp <= 'z') {
				temp -= ' ';
			} else if (temp >= 'A' && temp <= 'Z') {
				temp += ' ';
			} else {
				result += temp;
			}
		}

		return result;

	}

//	���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
	int howManyChars(String str, char pick) {
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == pick) {
				result++;
			}
		}
		return result;
	}

//	5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
	int indexFromNums(int[] ints, int index) {
		int result = 0;
		if (index >= 0) {
			result = ints[index];
		} else {
			result = -1;
		}
		return result;
	}

//	�ѱ��� ������ �ٲ��ִ� �޼ҵ�(�ϰ��̻� -> 1024)
	int hanToInt(String arHanStr) {
		String hans = "�����̻�����ĥ�ȱ�";
		char[] arHanChar = new char[arHanStr.length()];
		String result = "";
		for (int i = 0; i < arHanStr.length(); i++) {
//			arHanChar[i] = ;
			result += hans.indexOf(arHanStr.charAt(i));
		}

		return Integer.parseInt(result);
	}

//	5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
	int[] maxAndMin(int[] ints) {
		int[] result = new int[2];
		int max = 0, min = 0;
		max = ints[0];
		min = ints[0];
		for (int i = 0; i < ints.length; i++) {
			if (max < ints[i]) {
				max = ints[i];
			} else if (min > ints[i]) {
				min = ints[i];
			}
		}
		result[0] = max;
		result[1] = min;

		return result;
	}

//	5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�(void)
	void maxAndMin(int[] ints, int[] result) {

		int max = 0, min = 0;
		max = ints[0];
		min = ints[0];
		for (int i = 0; i < ints.length; i++) {
			if (max < ints[i]) {
				max = ints[i];
			} else if (min > ints[i]) {
				min = ints[i];
			}
		}
		result[0] = max;
		result[1] = min;
	}

//	indexOf() �����
//	���ڿ��� ���ڸ� �Է� ���� �� �ش� ���ڰ� ���° �ε����� �ִ��� �˻��ϰ�
//	���� �ش� ���ڰ� ������ -1�� �����Ѵ�.
	int indexOfT(String str, char c) {
		char temp = ' ';
//		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(i);
			if (temp == c) {
				return i;
			}
		}
		return -1;
	}
	
	
	int indexOf(String str, char c) {
		char temp = ' ';
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(i);
			if (temp == c) {
				result = i;
			} else {
				result = -1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		MethodTask mt = new MethodTask();

		char r = 'r';
		String str = "Str";
		int result = mt.indexOf(str, r);
		if (result != -1) {
			System.out.printf("%s���ڿ� %d��° �ε����� %c ����", str, result, r);
		} else {
			System.out.printf("%s�� %c ����", str, r);
		}

//		String splitLine = "--------------";
//
//		mt.printNums();
//		System.out.println(splitLine);
//
//		mt.pringHGD(3);
//		System.out.println(splitLine);
//
//		mt.printName("�̸�", 5);
//		System.out.println(splitLine);
//
//		System.out.println(mt.subtract(9, 3, 1));
//		Scanner sc = new Scanner(System.in);
//		int[] nums = {sc.nextInt(), sc.nextInt()};

//		int[] nums = { 12, 0 };

//		for (int i = 0; i < nums.length; i++) {
//			System.out.println(mt.func(nums)[i]);
//		}
//		System.out.println(mt.func(nums)[0] + ", " + mt.func(nums)[1]);;

//		System.out.println(mt.result[0] + ", " + mt.result[1]);

//		System.out.println(mt.sum(100));

//		System.out.println(mt.upperLower("StringAndTurttle"));

//		System.out.println(mt.howManyChars("EndEndoes", 'e'));

//		System.out.println(mt.hanToInt("���������"));

//		int[] arInts = { 10, 2, 8, 4, 3 };
//		int[] arResult = new int[2];
//		mt.maxAndMin(arInts, arResult);
//		System.out.println(arResult[0] + ", " + arResult[1]);

	}
}
