package Quiz_ex01;
 
public class Prob1 {
	public static void main(String[] args) {
		int seconds = 47567;
		System.out.println("<< " + seconds + " �� ��ȯ �ð� >>");
		System.out.println(printTime(seconds));
		
		seconds = 11578;
		System.out.println("<< " + seconds + " �� ��ȯ �ð� >>");
		System.out.println(printTime(seconds));
	}

	private static String printTime(int seconds) {
		int hour = seconds/3600;
		int sss = seconds%3600;
		int minute = sss/60;
		int ss = sss%60;
		return hour+ "�� " + minute +"�� " + ss + "��";
	}
}