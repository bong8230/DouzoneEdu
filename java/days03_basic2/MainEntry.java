/* >���
 * 1. �񱳹�
 * if ~ else
 * 
 * 2. ���ù�
 * switch ~ case
 * 
 * 3. �ݺ���
 * for, Ȯ�� for��
 * while
 * do~~while
 * 
 * 4.��Ÿ����
 * break
 * continue
 * 
 * 
 * >�Է¹ޱ�
 * java.io <-- Input/ Output
 * java.util <-- Scanner 
 * 
 */
package days03_basic2;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
//		System.out.println("�Է��ϼ���.");
//		
//		int x = num.nextInt();
//		double y = num.nextDouble();
//		char ch = num.next().charAt(2);
//		
//		System.out.println(x + "," + y + "," + ch );
		
		
//		System.out.println("next() vs nextLine()");
//		System.out.println("String input:");
//		String s1 = num.next();
//		//String s1 = num.nextLine();
//		
//		System.out.println(s1);
		
		System.out.println("kor, eng =");
		int kor = num.nextInt();
		int eng = num.nextInt();
	}
}