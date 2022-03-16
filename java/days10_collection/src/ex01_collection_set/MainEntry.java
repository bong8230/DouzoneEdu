package ex01_collection_set;

import java.util.HashSet;
import java.util.Iterator;

//1)Set : 순서없고, 중복 X
public class MainEntry {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("키보드");		hs.add("마우스");		hs.add("컵");		hs.add("볼펜");		hs.add("키보드");
		System.out.println(hs.size());
		
		HashSet hs2 = new HashSet();
		hs2.add(100);
		hs2.add(3);
		hs2.add(1000);
		hs2.add(12.34);
		System.out.println(hs.size());
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {//다음요소가 있으면...
			System.out.println(it.next());
		}
		
		System.out.println("=========================");
		
		for(Object i:hs2) {
			System.out.println(i);
		}
		
		System.out.println(hs);
		
		
		
		/*
		Object[] objArr = {"1",new Integer(1), "2","3","3","4","t","4", 1, 12.34};
		
		Set set = new HashSet();
		
		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}
		System.out.println(set);
		*/
	}
}
