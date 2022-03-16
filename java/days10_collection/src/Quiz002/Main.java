package Quiz002;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		while (true) {
			ScoreManager.menu();
			switch (new Scanner(System.in).nextInt()) {
				case 1:
					ScoreManager.input();
					break;
				case 2:
					ScoreManager.update();
					break;
				case 3:
					ScoreManager.delete();
					break;
				case 4:
					ScoreManager.show();
					break;
				case 5:
					System.out.println("종료됩니다.");
					System.exit(0);
					break;
			}//switch
		}//while
	}//main
}
