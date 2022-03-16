package ex01_collection_set;

import java.util.TreeSet;

//중복 X , 오름차순 정렬
public class TreeSetMain {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {85,95,50,35,45,65,10,100};
		
		for (int i = 0; i < score.length; i++) {
			//set.add(score[i]);
			set.add(new Integer(score[i]));
		}
		
		System.out.println(set);
		System.out.println(set.headSet(new Integer(50)));
		System.out.println(set.headSet(50)); // 50보다 작은값
		
		System.out.println(set.tailSet(50)); // 50보다 큰값
		}
}
