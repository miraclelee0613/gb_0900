package myCastingTest;

//	���ø���

//	�ִϸ��̼�, ��ȭ, ��� Ŭ���� ����
//	����ڰ� ������ ������
//	�ִϸ��̼��̶�� "�ڸ�����"��� ���
//	��ȭ��� "4D"��� ���
//	��󸶶�� "����"��� ���

public class CastingTask {

	String downCasting(Video video) {
		if (video instanceof Drama) {
			return "��� : ���� �Ǹ�";
//			return (Drama) son;
		} else if (video instanceof Film) {
			return "��ȭ : 4D";
//			return (Film) son;
		} else if (video instanceof Animation) {
			return "�ִϸ��̼� : �ڸ�����";
//			return (Animation) son;
		}
		return null;
	}

	public static void main(String[] args) {
		Video drama = new Drama(/* "����̷�", 130 */);
		CastingTask ct = new CastingTask();
		System.out.println(ct.downCasting(drama));
	}
}
