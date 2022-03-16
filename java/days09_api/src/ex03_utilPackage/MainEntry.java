package ex03_utilPackage;

import java.util.Calendar;
import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // system�� ���� �ִ� ��¥ ����
		System.out.println(Calendar.YEAR);
		System.out.println(c.get(Calendar.YEAR) + "��");
		System.out.println(c.get(Calendar.MONTH)+1 + "��"); // ���� 0���� ����
		System.out.println(c.get(Calendar.DATE) + "��");
		
		Date date = new Date();
		int h= date.getHours();
		int m = date.getMinutes();
		int s= date.getSeconds();
		
		System.out.println(h+" "+m+" "+s);
		
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c2.set(2018,12,20);
		
		if(c1.after(c2)) {
			System.out.println("����ð��� 2022�� 1�� 1�� ����");
		}else if(c1.before(c2)) System.out.println("����ð��� 2022�� 1��1�� ����");
		else System.out.println("����ð��� 2022��");
	}
}
