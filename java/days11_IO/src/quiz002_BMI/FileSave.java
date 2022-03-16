package quiz002_BMI;

import java.io.*;

public class FileSave extends BMI_calc {
	public static void filesave() throws IOException {
		FileWriter file = new FileWriter("bmiResult.txt");
		try {

			for (int i = 0; i < calc.size(); i++) {
				file.write("[" + (i + 1) + "]번째\n" + "이름 : " + calc.get(i).getName() + "\n");
				file.write("몸무게 : " + calc.get(i).getWeight() + "\n");
				file.write("키 : " + calc.get(i).getHeight() + "\n");
				file.write("성별 : " + calc.get(i).getGender() + "\n");
				file.write("bmi지수 : " + calc.get(i).getBmi() + "\n");
				file.write("판정 : " + calc.get(i).getBmiresult() + "\n");
			}
			System.out.println("성공");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			file.close();
		}
	}
}
