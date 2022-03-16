package ex05_Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("����",new Integer(80));
		map.put("����",new Integer(55));
		map.put("��ȣ",100);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸� : " + e.getKey() + ", ���� : " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("������ ��� :" + set);
		
		Collection values = map.values();
		System.out.println(values);
		
		it = values.iterator();
		
		int total =0;
		while(it.hasNext()) {
			Integer i = (Integer) it.next();
			total += i;
		}
		System.out.println("���� : " + total);
		System.out.println("��� : " + (float)total/set.size());
		System.out.println("�ְ����� : " + Collections.max(values));
		System.out.println("�������� : " + Collections.min(values));
	}
}
