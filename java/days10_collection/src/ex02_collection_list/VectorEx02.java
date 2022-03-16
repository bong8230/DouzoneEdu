package ex02_collection_list;

import java.util.*;

public class VectorEx02 {
	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector(3,5);
		
		v.addElement("자바"); // string
		v.addElement(new Double(10.2)); // double
		v.addElement(date); // object
		
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		
		for (int j = 0; j < 10; j++) {
			v.add(new Integer(j));
		}
		System.out.println("===== 객체 10개 추가 =====");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		
		System.out.println("===== Vector 내용 출력 =====");
		Enumeration enu = v.elements();
		
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + " ");
		}
		System.out.println();
		
		
		System.out.println("-------객체 내용 포함 확인-------");
		if(v.contains("자바")) System.out.println("자바 있다 임마");
		
		System.out.println("10.2 위치는? "+v.indexOf(10.2));
		System.out.println(v.get(v.indexOf(10.2)));
		
		System.out.println("------------------------------------------");
		//date 객체 삭제
		v.removeElementAt(v.indexOf(date));
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		System.out.println(v);
		//v.remove(v.indexOf(date));
		
		System.out.println();
		for(i=0;i<v.size();i++) { // 0번째를 지우면 자동으로 하나씩 땡겨짐. 따라서 전부 지워지지않음
			//v.removeElementAt(i);
//			v.remove(0);
//			v.remove(10.2);
		}
		//v.removeAllElements();
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		System.out.println(v);
		System.out.println("\n\n");
		
		v.trimToSize();
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		v.removeAllElements();
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		v.trimToSize();
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
	}
}
