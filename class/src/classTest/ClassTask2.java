package classTest;

public class ClassTask2 {
////	�ִ밪, �ּҰ� ���ϱ�
//	void getMaxAndMin(int[] arData, Result result) {
//		result.max = arData[0];
//		result.min = arData[0];
//		
//	}
	
//	�л���ȣ, ��������, ��������, ���������� �Է¹��� �� ���հ� ��� ���ϱ�
	void getSumAndAvg(Student cScore) {
		cScore.avg();
		cScore.total();
	}
	
	
	public static void main(String[] args) {
		Student cScore = new Student(1, 90, 70, 80);
		ClassTask2 ct = new ClassTask2();
		ct.getSumAndAvg(cScore);
		System.out.println("sum: " + cScore.total + "\navg :" + cScore.avg);
		
		
		
	}
}
