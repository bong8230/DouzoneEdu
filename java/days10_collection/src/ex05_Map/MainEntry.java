package ex05_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("kosa", "th2");
		map.put("kbs",12345);
		map.put("it","1478");
		map.put("kosta", "th2");
		
		System.out.println("��Ұ��� : " + map.size());
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id�� password�� �Է����ּ���");
			System.out.print("id : "); String id = sc.nextLine().trim();
			System.out.print("password : "); String pwd = sc.nextLine().trim();
			System.out.println();
		
		
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� ���������ʽ��ϴ�. �ٽ��Է����ּ���");
				continue;
			}else {
				if(!map.get(id).equals(pwd)) {
					System.out.println("��й�ȣ�� ��ġ�����ʽ��ϴ�.");
				} else {
					System.out.println("id�� pwd�� ��ġ�մϴ�.");
					break;
				}
			}
		}//end while
	}
}
