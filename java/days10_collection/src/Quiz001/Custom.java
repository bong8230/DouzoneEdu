package Quiz001;

import java.util.ArrayList;
import java.util.Scanner;

class Customer {
	protected String name, adress, phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
//�� �߰� , ����, ������Ʈ���,����,���α׷�����

public class Custom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Customer> cstm = new ArrayList<Customer>();

		// Customer ctm;

		while (true) {
			System.out.println();
			System.out.println("������������ �����մϴ�. \n1.�Է� \n2.���� ������Ʈ \n3.���� \n4.����\n5.����\n");
			int num = sc.nextInt();
			Customer ctm = new Customer();
			
			if (num == 1) { // �Է�

				System.out.println();

				System.out.print("�̸��� �Է� : ");
				ctm.setName(sc.next());
				System.out.print("�ּ� �Է� : ");
				ctm.setAdress(sc.next());
				System.out.print("�ڵ�����ȣ �Է� : ");
				ctm.setPhone(sc.next());

				cstm.add(ctm);
				System.out.println("�������� ����Ǿ����ϴ�. ó������ ���ư��ϴ�.");
				continue;
			}

			else if (num == 2) { // ������Ʈ ���
				System.out.println("===========================");
				for (int i = 0; i < cstm.size(); i++) {
					System.out.println("[" + (i + 1) + "]��°\n" + "����� �� �̸� : " + cstm.get(i).getName());
					System.out.println("����� �� �ּ� : " + cstm.get(i).getAdress());
					System.out.println("����� �� ��ȣ : " + cstm.get(i).getPhone());
					System.out.println("===========================");
				}
			}

			else if (num == 3) { // ����
				System.out.println("���� " + cstm.size() + "���� �������� �ֽ��ϴ�.");
				System.out.print("���° ���� �����Ͻðڽ��ϱ�? (�����Է�)");
				int n = sc.nextInt();
				System.out.println("���� " + n + "��° ���� �����Դϴ�.");

				System.out.println("===========================");
				System.out.println("[" + n + "]��°\n" + "����� �� �̸� : " + cstm.get(n - 1).getName());
				System.out.println("����� �� �ּ� : " + cstm.get(n - 1).getAdress());
				System.out.println("����� �� ��ȣ : " + cstm.get(n - 1).getPhone());
				System.out.println("===========================");

				System.out.println("������ ���� ������ �Է����ּ���");
				System.out.print("�̸��� �Է� : ");
				ctm.setName(sc.next());
				System.out.print("�ּ� �Է� : ");
				ctm.setAdress(sc.next());
				System.out.print("�ڵ�����ȣ �Է� : ");
				ctm.setPhone(sc.next());
				cstm.set(n - 1, ctm);
				System.out.println(n + "��° ���� ������ ���������� ����Ǿ����ϴ�.");
				continue;

			}

			else if (num == 4) { // ����
				System.out.print("������ ������Ʈ�� ��ȣ�� �Է����ּ���");
				int k = sc.nextInt();
				cstm.remove(k - 1);
				System.out.println(k + "��° ���� ������ �����Ǿ����ϴ�. ó������ ���ư��ϴ�.");
				continue;
			}

			else if (num == 5) {
				System.out.println("������ ������ ����Ǿ����ϴ�.");
				break; // ����
			}
			
			else {
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
		}
	}
}
