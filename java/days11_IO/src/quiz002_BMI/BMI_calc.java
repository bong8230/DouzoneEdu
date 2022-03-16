package quiz002_BMI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BMI_calc extends BMI {
	static ArrayList<BMI> calc = new ArrayList<BMI>();
	static BMI vv = new BMI();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void menu() {
		System.out.println("비만도 측정 프로그램. \n1.추가 \n2.삭제 \n3.출력 \n4.파일저장\n5.종료\n");
	}

	public static void input() throws NumberFormatException, IOException {
		System.out.print("이름 입력 : ");
		String name = br.readLine();
		System.out.print("몸무게 입력 : ");
		int weight = Integer.parseInt(br.readLine());
		System.out.print("키 입력 : ");
		int height = Integer.parseInt(br.readLine());
		System.out.println("성별 선택(남자/여자)");
		String gender = br.readLine();
		double bmi = weight / ((height / 100.0) * (height / 100.0));
		String bmiresult = bmiResult(bmi);
		calc.add(new BMI(name, weight, height, gender, bmi, bmiresult));
		System.out.println("저장되었습니다. 처음으로 돌아갑니다.");
	}

	public static void delete() throws NumberFormatException, IOException {
		System.out.print("삭제할 정보의 번호를 입력해주세요");
		int k = Integer.parseInt(br.readLine());
		calc.remove(k - 1);
		System.out.println(k + "번째  정보가 삭제되었습니다. 처음으로 돌아갑니다.");
	}

	public static void show() {
		System.out.println("===========================");
		for (int i = 0; i < calc.size(); i++) {
			System.out.println("[" + (i + 1) + "]번째\n" + "이름 : " + calc.get(i).getName());
			System.out.println("몸무게 : " + calc.get(i).getWeight());
			System.out.println("키 : " + calc.get(i).getHeight());
			System.out.println("성별 : " + calc.get(i).getGender());
			System.out.println("bmi지수 : " + calc.get(i).getBmi());
			System.out.println("판정 : " + calc.get(i).getBmiresult());
			System.out.println("===========================");
		}
	}

	public static String bmiResult(double bmi) {
		if (bmi >= 25.0)
			return "비만";
		else if (bmi >= 23.0 && bmi <= 24.9)
			return "과체중";
		else if (bmi >= 18.5 && bmi <= 22.9)
			return "정상";
		else
			return "체중 부족";
	}

}
