package dateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-yy-MM-dd");
		Date now = new Date();
//		System.out.println(now);
		System.out.println(simpleDateFormat.format(now));
		
//		getTime() : �� ��¥�� ���̸� ���� �� ���, �и��� ����
		System.out.println(now.getTime());
		
		
		
		
		
		
		
		
	}
}
