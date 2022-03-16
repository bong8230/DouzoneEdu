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
		System.out.println("�񸸵� ���� ���α׷�. \n1.�߰� \n2.���� \n3.��� \n4.��������\n5.����\n");
	}

	public static void input() throws NumberFormatException, IOException {
		System.out.print("�̸� �Է� : ");
		String name = br.readLine();
		System.out.print("������ �Է� : ");
		int weight = Integer.parseInt(br.readLine());
		System.out.print("Ű �Է� : ");
		int height = Integer.parseInt(br.readLine());
		System.out.println("���� ����(����/����)");
		String gender = br.readLine();
		double bmi = weight / ((height / 100.0) * (height / 100.0));
		String bmiresult = bmiResult(bmi);
		calc.add(new BMI(name, weight, height, gender, bmi, bmiresult));
		System.out.println("����Ǿ����ϴ�. ó������ ���ư��ϴ�.");
	}

	public static void delete() throws NumberFormatException, IOException {
		System.out.print("������ ������ ��ȣ�� �Է����ּ���");
		int k = Integer.parseInt(br.readLine());
		calc.remove(k - 1);
		System.out.println(k + "��°  ������ �����Ǿ����ϴ�. ó������ ���ư��ϴ�.");
	}

	public static void show() {
		System.out.println("===========================");
		for (int i = 0; i < calc.size(); i++) {
			System.out.println("[" + (i + 1) + "]��°\n" + "�̸� : " + calc.get(i).getName());
			System.out.println("������ : " + calc.get(i).getWeight());
			System.out.println("Ű : " + calc.get(i).getHeight());
			System.out.println("���� : " + calc.get(i).getGender());
			System.out.println("bmi���� : " + calc.get(i).getBmi());
			System.out.println("���� : " + calc.get(i).getBmiresult());
			System.out.println("===========================");
		}
	}

	public static String bmiResult(double bmi) {
		if (bmi >= 25.0)
			return "��";
		else if (bmi >= 23.0 && bmi <= 24.9)
			return "��ü��";
		else if (bmi >= 18.5 && bmi <= 22.9)
			return "����";
		else
			return "ü�� ����";
	}

}
