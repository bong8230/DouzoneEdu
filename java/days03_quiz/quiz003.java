package days03_quiz;

public class quiz003 {
	public static void main(String[] args) {
			//123456��
		int su = 123456;
		int hour,min,sec;
		
		hour = su/3600;
		min = (su%3600)/60;
		sec = ((su%3600)%60)%60;
				
		
		System.out.printf("%d�� " + "%d�� " + "%d��",hour,min,sec);
	}
}
/*
 * while(su<0){
 * 		time = 
 * }
 */