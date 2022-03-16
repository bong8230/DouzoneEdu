/* >제어문
 * 1. 비교문
 * if ~ else
 * 
 * 2. 선택문
 * switch ~ case
 * 
 * 3. 반복문
 * for, 확장 for문
 * while
 * do~~while
 * 
 * 4.기타구문
 * break
 * continue
 * 
 * 
 * >입력받기
 * java.io <-- Input/ Output
 * java.util <-- Scanner 
 * 
 */
package days03_basic2;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
//		System.out.println("입력하세요.");
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