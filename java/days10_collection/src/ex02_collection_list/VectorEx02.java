package ex02_collection_list;

import java.util.*;

public class VectorEx02 {
	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector(3,5);
		
		v.addElement("�ڹ�"); // string
		v.addElement(new Double(10.2)); // double
		v.addElement(date); // object
		
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		
		for (int j = 0; j < 10; j++) {
			v.add(new Integer(j));
		}
		System.out.println("===== ��ü 10�� �߰� =====");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		
		System.out.println("===== Vector ���� ��� =====");
		Enumeration enu = v.elements();
		
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + " ");
		}
		System.out.println();
		
		
		System.out.println("-------��ü ���� ���� Ȯ��-------");
		if(v.contains("�ڹ�")) System.out.println("�ڹ� �ִ� �Ӹ�");
		
		System.out.println("10.2 ��ġ��? "+v.indexOf(10.2));
		System.out.println(v.get(v.indexOf(10.2)));
		
		System.out.println("------------------------------------------");
		//date ��ü ����
		v.removeElementAt(v.indexOf(date));
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		System.out.println(v);
		//v.remove(v.indexOf(date));
		
		System.out.println();
		for(i=0;i<v.size();i++) { // 0��°�� ����� �ڵ����� �ϳ��� ������. ���� ���� ������������
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
