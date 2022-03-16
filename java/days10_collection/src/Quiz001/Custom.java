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
//고객 추가 , 삭제, 고객리스트출력,수정,프로그램종료

public class Custom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Customer> cstm = new ArrayList<Customer>();

		// Customer ctm;

		while (true) {
			System.out.println();
			System.out.println("고객정보관리를 시작합니다. \n1.입력 \n2.현재 고객리스트 \n3.수정 \n4.삭제\n5.종료\n");
			int num = sc.nextInt();
			Customer ctm = new Customer();
			
			if (num == 1) { // 입력

				System.out.println();

				System.out.print("이름을 입력 : ");
				ctm.setName(sc.next());
				System.out.print("주소 입력 : ");
				ctm.setAdress(sc.next());
				System.out.print("핸드폰번호 입력 : ");
				ctm.setPhone(sc.next());

				cstm.add(ctm);
				System.out.println("고객정보가 저장되었습니다. 처음으로 돌아갑니다.");
				continue;
			}

			else if (num == 2) { // 고객리스트 출력
				System.out.println("===========================");
				for (int i = 0; i < cstm.size(); i++) {
					System.out.println("[" + (i + 1) + "]번째\n" + "저장된 고객 이름 : " + cstm.get(i).getName());
					System.out.println("저장된 고객 주소 : " + cstm.get(i).getAdress());
					System.out.println("저장된 고객 번호 : " + cstm.get(i).getPhone());
					System.out.println("===========================");
				}
			}

			else if (num == 3) { // 수정
				System.out.println("현재 " + cstm.size() + "건의 고객정보가 있습니다.");
				System.out.print("몇번째 고객을 수정하시겠습니까? (숫자입력)");
				int n = sc.nextInt();
				System.out.println("현재 " + n + "번째 고객의 정보입니다.");

				System.out.println("===========================");
				System.out.println("[" + n + "]번째\n" + "저장된 고객 이름 : " + cstm.get(n - 1).getName());
				System.out.println("저장된 고객 주소 : " + cstm.get(n - 1).getAdress());
				System.out.println("저장된 고객 번호 : " + cstm.get(n - 1).getPhone());
				System.out.println("===========================");

				System.out.println("수정할 고객의 정보를 입력해주세요");
				System.out.print("이름을 입력 : ");
				ctm.setName(sc.next());
				System.out.print("주소 입력 : ");
				ctm.setAdress(sc.next());
				System.out.print("핸드폰번호 입력 : ");
				ctm.setPhone(sc.next());
				cstm.set(n - 1, ctm);
				System.out.println(n + "번째 고객의 정보가 성공적으로 변경되었습니다.");
				continue;

			}

			else if (num == 4) { // 삭제
				System.out.print("삭제할 고객리스트의 번호를 입력해주세요");
				int k = sc.nextInt();
				cstm.remove(k - 1);
				System.out.println(k + "번째 고객의 정보가 삭제되었습니다. 처음으로 돌아갑니다.");
				continue;
			}

			else if (num == 5) {
				System.out.println("고객정보 관리가 종료되었습니다.");
				break; // 종료
			}
			
			else {
				System.out.println("번호를 잘못 입력하셨습니다.");
				continue;
			}
		}
	}
}
