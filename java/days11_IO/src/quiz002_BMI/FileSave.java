package quiz002_BMI;

import java.io.*;

public class FileSave extends BMI_calc {
	public static void filesave() throws IOException {
		FileWriter file = new FileWriter("bmiResult.txt");
		try {

			for (int i = 0; i < calc.size(); i++) {
				file.write("[" + (i + 1) + "]��°\n" + "�̸� : " + calc.get(i).getName() + "\n");
				file.write("������ : " + calc.get(i).getWeight() + "\n");
				file.write("Ű : " + calc.get(i).getHeight() + "\n");
				file.write("���� : " + calc.get(i).getGender() + "\n");
				file.write("bmi���� : " + calc.get(i).getBmi() + "\n");
				file.write("���� : " + calc.get(i).getBmiresult() + "\n");
			}
			System.out.println("����");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			file.close();
		}
	}
}
