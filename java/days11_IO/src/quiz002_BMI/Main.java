package quiz002_BMI;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		while (true) {
			BMI_calc.menu();
			switch (new Scanner(System.in).nextInt()) {
			case 1:
				BMI_calc.input();
				break;
			case 2:
				BMI_calc.delete();
				break;
			case 3:
				BMI_calc.show();
				break;
			case 4:
				FileSave.filesave();
				break;
			case 5:
				System.out.println("종료됩니다.");
				System.exit(0);
				break;
			}// switch
		} // while
	}// main
}
